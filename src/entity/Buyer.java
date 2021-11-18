/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author vladislav
 */
@Entity
public class Buyer implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String buyerFirstName;
    private String buyerLastName;
    private String buyerPhone;
    private double buyerMoney;

    public String getBuyerFirstName() {
        return buyerFirstName;
    }

    public void setBuyerFirstName(String buyerFirstName) {
        this.buyerFirstName = buyerFirstName;
    }

    public String getBuyerLastName() {
        return buyerLastName;
    }

    public void setBuyerLastName(String buyerLastName) {
        this.buyerLastName = buyerLastName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }


    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public double getBuyerMoney() {
        return buyerMoney;
    }

    public void setBuyerMoney(double buyerMoney) {
        this.buyerMoney = buyerMoney;
    }
    @Override
    public String toString() {
        return "покупатель: " + buyerFirstName +" "+ buyerLastName + ", номер телефона: " + buyerPhone + ", деньги: " + buyerMoney +" евро"+' ';
    }
}
