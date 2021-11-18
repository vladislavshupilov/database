/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author vladislav
 */
@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Sneaker sneaker;
    @OneToOne
    private Buyer buyer;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date givenSneaker;
    private double generalMoney;
    
    public Sneaker getSneaker() {
        return sneaker;
    }

    public void setSneaker(Sneaker sneaker) {
        this.sneaker = sneaker;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Date getGivenSneaker() {
        return givenSneaker;
    }

    public void setGivenSneaker(Date givenSneaker) {
        this.givenSneaker = givenSneaker;
    }

}
