package com.dvdrental.payment.repository;

import com.dvdrental.payment.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface RentalRepository extends JpaRepository<Rental, Long> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE rental SET status = ?2 WHERE rental_id = ?1 AND status = 'processando'", nativeQuery = true)
    void updateStatusRental(Long rental_id, String status);
}
