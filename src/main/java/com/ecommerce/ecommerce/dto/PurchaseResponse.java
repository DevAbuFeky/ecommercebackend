package com.ecommerce.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;

}

// using this class to send back a java object as jason