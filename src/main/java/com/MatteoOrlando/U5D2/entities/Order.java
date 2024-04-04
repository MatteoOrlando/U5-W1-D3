package com.MatteoOrlando.U5D2.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
public class Order {
    private int orderNumber;
    private OrderStatus status;
    private int numberOfGuests;
    private LocalTime acquisitionTime;
    private List<Pizza> items;

}