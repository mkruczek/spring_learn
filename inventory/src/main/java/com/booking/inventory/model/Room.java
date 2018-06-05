package com.booking.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "room")
public class Room {

    @Id
    UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "photo")
    byte[] photo;

    @JoinColumn(name = "room_category_id")
    @OneToMany
    RoomCategory roomCategory;
}
