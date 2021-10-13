package com.example.m2_Casa_WebDataJpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Casa {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private Double precio;
    private Integer metros;
    private String adress;
    private Boolean garden;


    public Casa() {
    }

    public Casa(Long id, Double precio, Integer metros, String adress, Boolean garden) {
        this.id = id;
        this.precio = precio;
        this.metros = metros;
        this.adress = adress;
        this.garden = garden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Boolean getGarden() {
        return garden;
    }

    public void setGarden(Boolean garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "id=" + id +
                ", precio=" + precio +
                ", metros=" + metros +
                ", adress='" + adress + '\'' +
                ", garden=" + garden +
                '}';
    }
}
