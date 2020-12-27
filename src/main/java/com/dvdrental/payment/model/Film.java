package com.dvdrental.payment.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long film_id;
    private String title;
    private String description;
    private Long release_year;

    @Column(name="language_id")
    private Integer language;
    private Integer rental_duration;
    private Double rental_rate;
    private Integer length;
    private Double replacement_cost;
    private String rating;
    private LocalDateTime last_update;
    private String special_features;
    private String fulltext;

    public Long getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Long film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Long release_year) {
        this.release_year = release_year;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public Double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(Double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }
}
