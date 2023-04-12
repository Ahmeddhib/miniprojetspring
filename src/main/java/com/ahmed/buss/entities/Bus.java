package com.ahmed.buss.entities;

import java.util.Date;

public class Bus {
    private Long idBus;
    private String TypeBus;
    private double price;
    private Date dateMisenService;
    private String couleur;
    private int capacity;


    public Bus() {
        super();
    }

    public Bus(String typeBus, double price, Date dateMisenService, String couleur, int capacity) {
        super();
        TypeBus = typeBus;
        this.price = price;
        this.dateMisenService = dateMisenService;
        this.couleur = couleur;
        this.capacity = capacity;
    }

    public Long getIdBus() {
        return idBus;
    }

    public void setIdBus(Long idBus) {
        this.idBus = idBus;
    }

    public String getTypeBus() {
        return TypeBus;
    }

    public void setTypeBus(String typeBus) {
        TypeBus = typeBus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateMisenService() {
        return dateMisenService;
    }

    public void setDateMisenService(Date dateMisenService) {
        this.dateMisenService = dateMisenService;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus [idBus=" + idBus + ", TypeBus=" + TypeBus + ", price=" + price + ", dateMisenService="
                + dateMisenService + ", couleur=" + couleur + ", capacity=" + capacity + "]";
    }

    public void setDateMiseEnService(Date dateMisenService) {
        this.dateMisenService = dateMisenService;
    }
}