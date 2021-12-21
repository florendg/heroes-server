package dev.vultureweb.heroes.server;

import dev.vultureweb.heroes.domain.Hero;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/heroes")
public class HeroesEndpoint {

   private final List<Hero> heroes =List.of(
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

   private Map<Integer,Hero> heroMap;

   @PostConstruct
   private void createHeroMap() {
      heroMap = new HashMap<>();
      for(Hero hero : heroes) {
         heroMap.put(hero.id(),hero);
      }
   }

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public List<Hero> getHeroes() {
      return heroes;
   }

   @GET
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_JSON)
   public Hero getHero(@PathParam("id") Integer id) {
      return heroMap.get(id);
   }
}
