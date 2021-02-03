package com.blockchain1.Transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Transaction {
    private String senderId;
    private String receipeintId;
    private double amount;
    private boolean verified;

    public Transaction(String iID, String rID, double amt){
        this.senderId = iID;
        this.receipeintId = rID;
        this.amount = amt;
        this.verified = false;
    }
}
