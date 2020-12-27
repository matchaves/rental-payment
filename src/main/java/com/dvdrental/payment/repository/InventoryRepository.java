package com.dvdrental.payment.repository;


import com.dvdrental.payment.dto.FilmDtoCost;
import com.dvdrental.payment.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface InventoryRepository extends JpaRepository<Film, Long> {


    @Query(value = "select f.* from film f, inventory i where i.film_id = f.film_id and i.inventory_id = ?1", nativeQuery = true)
    Film filmCost(Long inventory_id);





}
