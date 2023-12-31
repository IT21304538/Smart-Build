package com.example.procurement_managerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalItem {
    private long id;
    private String itemName;
    private double price;
    private int quantity;
    private String seller;

    private double totPrice;
    public Object thenReturn(ApprovalItem approvalItem){
        return null;
    }
}
