package com.praveen.demoSpringWeb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int pId;
    private String pName;
    private String pType;
    private int pwarranty;

    public Product() {
    }

    public Product(int pId, String pName, String pType, int pwarranty) {
        this.pId = pId;
        this.pName = pName;
        this.pType = pType;
        this.pwarranty = pwarranty;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public int getPwarranty() {
        return pwarranty;
    }

    public void setPwarranty(int pwarranty) {
        this.pwarranty = pwarranty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pType='" + pType + '\'' +
                ", pwarranty=" + pwarranty +
                '}';
    }


}
