package com.wellsfargo.counselor.entities;

import javax.persistence.*;
import java.util.List;


@Entity
public class Portfolio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String name;


    @OneToOne(mappedBy = "portfolio")
    private Client client;


    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;



    public Portfolio() {
    }


    public Portfolio(String name,
                     Client client,
                     List<Security> securities) {

        this.name = name;
        this.client = client;
        this.securities = securities;
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }


    public List<Security> getSecurities() {
        return securities;
    }


    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}