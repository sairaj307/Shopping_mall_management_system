package com.example.demo;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shopId;
    private String shopCategory;

    //@OneToOne
    //private Employee shopEmployeeID;

    private String shopName;

    private String shopStatus;

    //@OneToOne
    //private ShopOwner shopOwner;

    private String leaseStatus;

    // Add other properties as needed

    //@OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    //private List<Customer> customers;

    public Shop() {

    }

    /*public Shop(String shopCategory, Employee shopEmployeeID, String shopName, String shopStatus,
                ShopOwner shopOwner, String leaseStatus, List<Customer> customers) {
        this.shopCategory = shopCategory;
        this.shopEmployeeID = shopEmployeeID;
        this.shopName = shopName;
        this.shopStatus = shopStatus;
        this.shopOwner = shopOwner;
        this.leaseStatus = leaseStatus;
        this.customers = customers;
    }*/
    public Shop(String shopCategory, String shopName, String shopStatus,
            String leaseStatus) {
    this.shopCategory = shopCategory;
    this.shopName = shopName;
    this.shopStatus = shopStatus;
    this.leaseStatus = leaseStatus;
}

    // Getters and setters (and other methods) as needed
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    /*public Employee getShopEmployeeID() {
        return shopEmployeeID;
    }

    public void setShopEmployeeID(Employee shopEmployeeID) {
        this.shopEmployeeID = shopEmployeeID;
    }
    
    public ShopOwner getShopOwner() {
        return shopOwner;
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public void setShopOwner(ShopOwner shopOwner) {
        this.shopOwner = shopOwner;
    }
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    */

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(String leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    @Override
    public String toString() {
        return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", shopStatus=" + shopStatus + ", leaseStatus="
                + leaseStatus + "]";
    }
}

