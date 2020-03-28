package com.jonjazzy.mysql.entity;

import javax.persistence.*;

@Entity
@NamedQuery(name= "find_all_transactions", query="select p from Transactions p")
public class Transactions
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String merchantCode;
    private Integer payableId;
    private Integer initiatingAmount;

    //default constructor
    public Transactions() {
    }

    public Transactions(String merchantCode, int payableId, int initiatingAmount)
    {
        super();
        this.merchantCode = merchantCode;
        this.payableId = payableId;
        this.initiatingAmount = initiatingAmount;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", merchantCode='" + merchantCode + '\'' +
                ", payableId=" + payableId +
                ", initiatingAmount='" + initiatingAmount + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public int getPayableId() {
        return payableId;
    }

    public void setPayableId(int payableId) {
        this.payableId = payableId;
    }

    public int getInitiatingAmount() {
        return initiatingAmount;
    }

    public void setInitiatingAmount(int initiatingAmount) {
        this.initiatingAmount = initiatingAmount;
    }
}
