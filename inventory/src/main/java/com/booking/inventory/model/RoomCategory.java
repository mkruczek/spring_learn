package com.booking.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "room_category")
public class RoomCategory {

    @Id
    UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;
}
