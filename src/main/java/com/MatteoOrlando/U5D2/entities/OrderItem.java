package com.MatteoOrlando.U5D2.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderItem {

    private String itemName;
    private double price;
    private int quantity;

}