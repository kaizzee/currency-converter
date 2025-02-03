package com.example.currencyconverter.model;

import lombok.Data;

@Data
public class ConversionRequest {
    private String from;
    private String to;
    private double amount;
}