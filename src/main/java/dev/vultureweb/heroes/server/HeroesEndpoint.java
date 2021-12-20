package dev.vultureweb.heroes.server;

import dev.vultureweb.heroes.domain.Hero;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/heroes")
public class HeroesEndpoint {

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public List<Hero> getHeroes() {
      return List.of(
            new Hero(1, "Captain America"),
            new Hero(11, "Dr Nice"),
            new Hero(12, "Narco"),
            new Hero(13, "Bombasto"),
            new Hero(14, "Celeritas"),
            new Hero(15, "Magnet"),
            new Hero(16, "RubberMan"),
            new Hero(17, "Dynama"),
            new Hero(18, "Dr IQ"),
            new Hero(19, "Magma"),
            new Hero(20, "Tornado")
      );
   }
}

//{ id: 11, name: 'Dr Nice' },
//      { id: 12, name: 'Narco' },
//      { id: 13, name: 'Bombasto' },
//      { id: 14, name: 'Celeritas' },
//      { id: 15, name: 'Magneta' },
//      { id: 16, name: 'RubberMan' },
//      { id: 17, name: 'Dynama' },
//      { id: 18, name: 'Dr IQ' },
//      { id: 19, name: 'Magma' },
//      { id: 20, name: 'Tornado' }
