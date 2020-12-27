package com.dvdrental.payment.repository;

import com.dvdrental.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    @Modifying
    @Transactional
    @Query(value = "insert into public.payment (customer_id, staff_id, rental_id, amount, payment_date, status) values ( :customer, :staff, :rental, :amount, now(), :status )", nativeQuery = true)
    void doPayment(@Param("customer") Long customer,
                   @Param("staff") Long staff,
                   @Param("rental") Long rental,
                   @Param("amount") Double amount,
                   @Param("status") String status);

}
