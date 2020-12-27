package com.dvdrental.payment.service;

import com.dvdrental.payment.client.FilmClient;
import com.dvdrental.payment.dto.FilmDtoCost;
import com.dvdrental.payment.model.Film;
import com.dvdrental.payment.model.Payment;
import com.dvdrental.payment.repository.InventoryRepository;
import com.dvdrental.payment.repository.PaymentRepository;
import com.dvdrental.payment.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PaymentService {

    @Autowired
    public PaymentRepository paymentRepository;

    @Autowired
    public RentalRepository rentalRepository;

    @Autowired
    public InventoryRepository inventoryRepository;

    @Autowired
    public FilmClient filmClient;

    public void doPayment (Payment payment) {

        Film film = inventoryRepository.filmCost(payment.getInventory_id());

        //ToDO
        //desenvolver logica de pagamento aprovado ou reprovado
        String status = "aprovado";

        paymentRepository.doPayment(payment.getCustomer(),
                                    payment.getStaff(),
                                    payment.getRental(),
                                    film.getRental_rate(),
                                    status);

        this.updateStatusRental(payment.getRental(), status);

    }

    public void updateStatusRental(Long inventory_id, String status) {
        rentalRepository.updateStatusRental(inventory_id, status);//.stream().map(FilmDto::create).collect(Collectors.toList());
    }


}
