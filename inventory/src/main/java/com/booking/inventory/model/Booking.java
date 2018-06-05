package com.booking.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    UUID id;

    @Column(name = "from")
    LocalDateTime from;

    @Column(name = "until")
    LocalDateTime util;

    @Column(name = "guest_name")
    String guestName;

    @Column(name = "guest_email")
    String guestEmail;

    @Column(name = "guest_phone")
    String guestPhone;

    @JoinColumn(name = "room_id")
    @OneToMany
    Room room;

}
