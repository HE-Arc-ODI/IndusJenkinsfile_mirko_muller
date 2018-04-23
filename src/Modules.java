import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/helloworld/modules")

public class Modules {

  // The Java method will process HTTP GET requests
  @GET
  // The Java method will produce content identified by the MIME Media type "text/plain"
//  @Path("?key={id}")
  @Path("{id}")
  @Produces("text/plain; charset=UTF-8")
  public String getClichedMessage(@PathParam("id") String param) {

    HashMap<Integer, String> hmap = new HashMap<Integer, String>();

    /*Adding elements to HashMap*/
    hmap.put(61512, "Gestion et suivi de projets informatiques");
    hmap.put(61513, "Gestion et suivi de projets informatiques (prat)");
    hmap.put(61514, "Gestion de projets agiles");
    hmap.put(62511, "Industrialisation du logiciel");
    hmap.put(62512, "Outils de développement intégré");
    hmap.put(62513, "Outils de développement intégré (prat)");
    hmap.put(62522, "Entrepôt de données");
    hmap.put(62523, "Entrepôt de données (prat)");
    hmap.put(62524, "Analyses de données");
    hmap.put(63511, "Technologies actuelles");
    hmap.put(63512, "Recherche opérationnelle");
    hmap.put(63513, " Concepts avancés de persistance");
    hmap.put(64511, "Gestion des contenus de l'entreprise");
    hmap.put(64512, "Gestion des données semi-structurées");
    hmap.put(64521, " Projet RAD");

    //convertion de l'id de String en integer
    int mudule = Integer.valueOf(param);

    // Checking Key Existence
    boolean flag = hmap.containsKey(mudule);

    String message;


    /* Get values based on key*/
    if (flag) {
      message = hmap.get(mudule);
    } else {
      message = "le module n'existe pas !";
    }
    return message;
  }

}
