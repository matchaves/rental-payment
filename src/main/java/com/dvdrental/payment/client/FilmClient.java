package com.dvdrental.payment.client;


import com.dvdrental.payment.dto.FilmDtoCost;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "film", url = "localhost:8002", path = "/films")
public interface FilmClient {


    @GetMapping("/cost/{film_id}")
    FilmDtoCost filmCost (@RequestParam Long film_id);

}
