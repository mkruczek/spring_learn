package com.booking.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    UUID id;

    @Column(name = "uri")
    String uri;

    @JoinColumn(name = "booking_id")
    @OneToOne
    Booking booking;
}
