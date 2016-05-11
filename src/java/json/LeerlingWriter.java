package json;

import domain.*;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class LeerlingWriter implements MessageBodyWriter<Leerling>
{
    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType)
    {
        return Leerling.class.isAssignableFrom(type);
    }

    @Override
    public long getSize(Leerling leerling, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType)
    {
        return -1;
    }

    @Override
    public void writeTo(Leerling leerling, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException
    {
        JsonObjectBuilder jsonUser = Json.createObjectBuilder();

        jsonUser.add("naam", leerling.getnaam());
        
        if (leerling.getNummer()!= null) {
            jsonUser.add("nummer", leerling.getNummer());
        }
        
         if (leerling.getVT()!= null) {
            jsonUser.add("VT", (JsonObjectBuilder) leerling.getVT());
        }
         
         if (leerling.getRT()!= null) {
            jsonUser.add("RT", (JsonObjectBuilder) leerling.getRT());
        }
         
         if (leerling.getHoofdscherm()!= null) {
            jsonUser.add("hoofdscherm", (JsonObjectBuilder) leerling.getHoofdscherm());
        }
        
        JsonArrayBuilder jsonEvaluaties = Json.createArrayBuilder();
        for (Evaluatie eva : leerling.getEvaluaties()) {
            jsonEvaluaties.add((JsonObjectBuilder) eva);
        }
        jsonUser.add("evaluaties", jsonEvaluaties);
        
        JsonArrayBuilder jsonAttitude = Json.createArrayBuilder();
        for (String att : leerling.getAttitude()) {
            jsonAttitude.add(att);
        }
        jsonUser.add("attitude", jsonAttitude);
        
        JsonArrayBuilder jsonopmerkingen = Json.createArrayBuilder();
        for (String opm : leerling.getOpmerkingen()) {
            jsonopmerkingen.add(opm);
        }
        jsonUser.add("opmerkingen", jsonopmerkingen);
        
        
        
        try (JsonWriter out = Json.createWriter(entityStream)) {
            out.writeObject(jsonUser.build());
        }
    }
}
