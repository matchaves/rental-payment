package com.dvdrental.payment.dto;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
public class FilmDtoCost {


    private Long rental_duration;
    private Double replacement_cost;
    private Double rental_rate;

    public Long getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Long rental_duration) {
        this.rental_duration = rental_duration;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(Double rental_rate) {
        this.rental_rate = rental_rate;
    }
}
