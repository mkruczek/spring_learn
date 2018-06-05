package com.booking.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="pricing")
public class Pricing {

    @Id
    UUID id;

    @Column (name = "price_one")
    double piceOne;
    @Column (name = "price_two")
    double piceTwo;
    @Column (name = "price_three")
    double piceThree;

}
