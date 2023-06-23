package com.sauravbhise.moviecatalogservice.resources;

import com.sauravbhise.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId) {

        // get all rated movie ids

        // For each movie id, call movie info service to get the details

        // put them all together
        return Collections.singletonList(
                new CatalogItem("Transformers", "Robots", 4)
        );
    }
}
