package resources;

import domain.*;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Set;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jens
 */
@RequestScoped
@Path("leerlingen")
@Transactional(dontRollbackOn = {BadRequestException.class, NotFoundException.class})
public class Leerlingen {
 
    @PersistenceContext
    private EntityManager em;
    
    @Resource
    private Validator validator; 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Leerling> getAllLeerlingen(@QueryParam("first") @DefaultValue("0") int first, @QueryParam("results") @DefaultValue("10") int results)
    {
        TypedQuery<Leerling> queryFindAll = em.createNamedQuery("Leerling.findAll", Leerling.class);
        queryFindAll.setFirstResult(first);
        queryFindAll.setMaxResults(results);
        return queryFindAll.getResultList();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addLeerling(Leerling leerling)
    {
        Set<ConstraintViolation<Leerling>> validate = validator.validate(leerling);
        if(!validate.isEmpty()){
            throw new BadRequestException("invalid user data");
        }
        
        leerling.setnaam(leerling.getnaam().trim());
        
        if (em.find(Leerling.class, leerling.getnaam()) != null) {
            throw new BadRequestException("naam al in gebruik");
        }
        
        // zelfde al hierboven  
//        if (user.getPassword() == null || user.getPassword().trim().length() < 8) {
//            throw new BadRequestException("Paswoord ongeldig");
//        }
        
        leerling.setNummer(leerling.getNummer().trim());
        
        em.persist(leerling);
        
        return Response.created(URI.create("/" + leerling.getnaam())).build();
    }
    
    @Path("{naam}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Leerling getUser(@PathParam("naam") String naam)
    {
        Leerling leerling = em.find(Leerling.class, naam);
        
        if (leerling == null) {
            throw new NotFoundException("Gebruiker niet gevonden");
        }
        
        return leerling;
    }
    
    @Path("{naam}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateUser(@PathParam("naam") String naam, InputStream input)
    {
        Leerling leerling = em.find(Leerling.class, naam);
        
        if (leerling == null) {
            throw new NotFoundException("Gebruiker niet gevonden");
        }
        em.detach(leerling);
        
        try (JsonReader jsonInput = Json.createReader(input)) {
            JsonObject jsonUser = jsonInput.readObject();

            // Ter illustratie ondersteunen we hier enkel het wijzigen van het paswoord en de
            // fullName. Hoe je een volledige update kan ondersteunen, is te vinden in het grote
            // voorbeeld 'Reminders'.
            if (jsonUser.containsKey("nummer")) {

                String nummer = jsonUser.getString("nummer");
                leerling.setNummer(nummer.trim());

            }

            if (jsonUser.containsKey("hoofdscherm")) {
                if (jsonUser.isNull("hoofdscherm")) {
                    leerling.setHoofdscherm(null);
                } else {
                    leerling.setHoofdscherm((Hoofdscherm) jsonUser.getJsonObject("Hoofdscherm"));
                }
            }
            
           if (jsonUser.containsKey("RT")) {
                if (jsonUser.isNull("RT")) {
                    leerling.setRT(null);
                } else {
                    leerling.setRT((Rijtechniek) jsonUser.getJsonObject("RT"));
                }
            }
           
           if (jsonUser.containsKey("VT")) {
                if (jsonUser.isNull("VT")) {
                    leerling.setVT(null);
                } else {
                    leerling.setVT((Verkeerstechniek) jsonUser.getJsonObject("VT"));
                }
            }
           
           if (jsonUser.containsKey("evaluaties")) {
                if (jsonUser.isNull("evaluaties")) {
                    leerling.getEvaluaties().add(null);
                } else {
                    leerling.getEvaluaties().add((Evaluatie) jsonUser.getJsonObject("evaluaties"));
                }
            }
           
           if (jsonUser.containsKey("attitude")) {
                if (jsonUser.isNull("attitude")) {
                    leerling.getAttitude().add(null);
                } else {
                    String attitude = jsonUser.getString("attitude");
                    leerling.getAttitude().add(attitude);
                }
            }
           
           if (jsonUser.containsKey("opmerkingen")) {
                if (jsonUser.isNull("opmerkingen")) {
                    leerling.getOpmerkingen().add(null);
                } else {
                    leerling.getOpmerkingen().add( jsonUser.getString("opmerkingen"));
                }
            }
           
            
            Set<ConstraintViolation<Leerling>> validate = validator.validate(leerling);
            if (!validate.isEmpty()) {
                throw new BadRequestException("invalid user data");
            }
            em.merge(leerling); 
        } catch (JsonException | ClassCastException ex) {
            throw new BadRequestException("Ongeldige JSON invoer");
        }
    }
    
    @Path("{naam}")
    @DELETE
    public void removeUser(@PathParam("naam") String naam)
    {
        Leerling leerling = em.find(Leerling.class, naam);
        
        if (leerling == null) {
            throw new NotFoundException("Leerling niet gevonden");
        }
        
        em.remove(leerling);
    }
}