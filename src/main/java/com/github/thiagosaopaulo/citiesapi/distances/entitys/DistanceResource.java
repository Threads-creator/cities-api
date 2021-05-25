package com.github.thiagosaopaulo.citiesapi.distances.entitys;

import com.github.thiagosaopaulo.citiesapi.distances.service.DistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

    private final DistanceService service;
    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    public DistanceResource(DistanceService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity byEspecifiedUnit(@RequestParam(name = "from") final Long city1,
                                           @RequestParam(name = "to") final Long city2,
                                           @RequestParam(name = "unit") final String tipoUnidade){
        String resposta = "A distancia entre as cidades " + city1 + " E " + city2;
        resposta += "\n Calculado pelo SGBD: ";

        if(tipoUnidade.equalsIgnoreCase("metters")){
            log.info("byCube");
            resposta += service.distanceByCubeInMeters(city1, city2) + " Metros";
            return ResponseEntity.ok().body(resposta);
        }

        log.info("byPoints");
        resposta += service.distanceByPointsInMiles(city1, city2) + " Milhas";
        return ResponseEntity.ok().body(resposta);

    }

    @GetMapping("/by-points")
    public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {
        log.info("byPoints");
        return ResponseEntity.ok().body(service.distanceByPointsInMiles(city1, city2));
    }

    @GetMapping("/by-cube")
    public ResponseEntity byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        log.info("byCube");
        return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1, city2));
    }

//    @GetMapping("/by-math")
//    public Double byMath(@RequestParam(name = "from") final Long city1,
//                         @RequestParam(name = "to") final Long city2,
//                         @RequestParam final EarthRadius unit) {
//        log.info("byMath");
//        return service.distanceUsingMath(city1, city2, unit);
//    }
}
