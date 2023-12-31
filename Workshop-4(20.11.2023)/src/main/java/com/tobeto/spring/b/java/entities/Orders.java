package com.tobeto.spring.b.java.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Table(name="orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="date")
    private LocalDate date;

    @Column(name = "rental_start_date")
    private LocalDate rentalStartDate;

    @Column(name = "rental_end_date")
    private LocalDate rentalEndDate;

    //ManyToOne

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars carId;
}
