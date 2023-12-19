package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Inventory")
public class BakedGoods {
    @Id
    private Long id;

    private String name;
    private int quantity;
    private String supplier;
    private double retailPrice;
    private double wholesalePrice;
    private String uPC;

    // Constructors, getters, and setters

    public BakedGoods() {
    }

    public BakedGoods(String name, int quantity, String supplier, double retailPrice, double wholesalePrice, String isbn) {
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
        this.uPC = uPC;
    }

    // Getters and setters for each attribute

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getUPC() {
        return uPC;
    }

    public void setUPC(String uPC) {
        this.uPC = uPC;
    }

    // toString method for easy logging and debugging

    @Override
    public String toString() {
        return "BakedGoods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", supplier='" + supplier + '\'' +
                ", retailPrice=" + retailPrice +
                ", wholesalePrice=" + wholesalePrice +
                ", UPC='" + uPC + '\'' +
                '}';
    }
}