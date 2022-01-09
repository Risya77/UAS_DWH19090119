package com.example.AuliaRizqisyarifa19090119.domain;

import javax.persistence.*;

@Entity

public class Fakta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer skWaktu;
    private Integer amount;
    private Integer skFilm;
    private Integer skCustomer;
    private Integer skStaf;

    public Fakta(){

    }

    public Fakta(int id,int skWaktu, int amount, int skFilm, int skCustomer, int skStaf){
        this.id=id;
        this.skWaktu=skWaktu;
        this.amount=amount;
        this.skFilm=skFilm;
        this.skCustomer=skCustomer;
        this.skStaf=skStaf;
    }

    public Integer getSkStaf() {
        return skStaf;
    }

    public void setSkStaf(Integer skStaf) {
        this.skStaf = skStaf;
    }

    public Integer getSkCustomer() {
        return skCustomer;
    }

    public void setSkCustomer(Integer skCustomer) {
        this.skCustomer = skCustomer;
    }

    public Integer getSkFilm() {
        return skFilm;
    }

    public void setSkFilm(Integer skFilm) {
        this.skFilm = skFilm;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getSkWaktu() {
        return skWaktu;
    }

    public void setSkWaktu(Integer skWaktu) {
        this.skWaktu = skWaktu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}