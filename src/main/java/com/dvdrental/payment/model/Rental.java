package com.dvdrental.payment.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rental_id;
    private LocalDateTime rental_date;
    private Long inventory_id;
    private Integer customer_id;
    private LocalDateTime return_date;
    private Long staff_id;
    private LocalDateTime last_update;
    private String status;

    public Rental() {
    }

    public Long getRental_id() {
        return rental_id;
    }

    public void setRental_id(Long rental_id){
        this.rental_id = rental_id;
    }

    public LocalDateTime getRental_date() {
        return rental_date;
    }

    public void setRental_date(LocalDateTime rental_date) {
        this.rental_date = rental_date;
    }

    public Long getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(Long inventory_id) {
        this.inventory_id = inventory_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public LocalDateTime getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDateTime return_date) {
        this.return_date = return_date;
    }

    public Long getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Long staff_id) {
        this.staff_id = staff_id;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Rental(Long inventory_id) {
        this.inventory_id = inventory_id;
    }
}
