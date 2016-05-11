package json;

import domain.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

/*
 * Deze klasse is een JAX-RS provider die JSON kan parsen tot een User.
 */

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class LeerlingReader implements MessageBodyReader<Leerling>
{
    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType)
    {
        return Leerling.class.isAssignableFrom(type);
    }

    @Override
    public Leerling readFrom(Class<Leerling> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException
    {
        try (JsonReader in = Json.createReader(entityStream)) {
            
            JsonObject jsonUser = in.readObject();
            Leerling leerling = new Leerling();
            
            leerling.setnaam(jsonUser.getString("naam", null));
            leerling.setNummer(jsonUser.getString("nummer", null));
            leerling.setVT((Verkeerstechniek) jsonUser.getJsonObject("VT"));
            leerling.setRT((Rijtechniek) jsonUser.getJsonObject("RT"));
            leerling.setHoofdscherm((Hoofdscherm) jsonUser.getJsonObject("hoofdscherm"));
            
            JsonArray jsonEvaluaties = jsonUser.getJsonArray("evaluaties");
            if (jsonEvaluaties != null) {
                for (JsonObject Evaluatie : jsonEvaluaties.getValuesAs(JsonObject.class)) {
                    leerling.getEvaluaties().add((Evaluatie) Evaluatie.getJsonObject("Evaluatie"));
                }
            }
            
            JsonArray jsonAttitude = jsonUser.getJsonArray("attitude");
            if (jsonAttitude != null) {
                for (JsonString jsonRole : jsonAttitude.getValuesAs(JsonString.class)) {
                    leerling.getAttitude().add(jsonRole.getString());
                }
            }
            
            JsonArray jsonOpmerkingen = jsonUser.getJsonArray("opmerkingen");
            if (jsonOpmerkingen != null) {
                for (JsonString jsonRole : jsonOpmerkingen.getValuesAs(JsonString.class)) {
                    leerling.getOpmerkingen().add(jsonRole.getString());
                }
            }

            return leerling;
            
        } catch (JsonException | ClassCastException ex) {
            throw new BadRequestException("Ongeldige JSON invoer");
        }
    }
}
