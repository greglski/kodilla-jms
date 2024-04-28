package com.kodilla.kodillajms.controller;

import lombok.Data;

@Data
public class Order {
    private String id;
    private String productName;
    private String productId;
    private int quantity;
}
