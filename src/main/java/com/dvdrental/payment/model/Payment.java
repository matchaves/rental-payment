package com.dvdrental.payment.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "payment_id")
    private Long payment_id;
    private Long customer_id;
    private Long staff_id;
    private Long rental_id;
    private Long inventory_id;

    public Long getCustomer() {
        return customer_id;
    }
    public Long getStaff() {
        return staff_id;
    }
    public Long getRental() {
        return rental_id;
    }
    public Long getInventory_id() {
        return inventory_id;
    }
}
