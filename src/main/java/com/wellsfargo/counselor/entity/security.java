package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Double purchasePrice;
    @Column(nullable = false)
    private LocalDateTime purchaseDate;
    @Column(nullable = false)
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id",nullable = false)
    private portfolio portfolio;

    protected security() {

    }

    public security(long securityId, String name, String category, Double purchasePrice, LocalDateTime purchaseDate, long quantity, portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }



    // portfolio
    public portfolio get_portfolio()
    {
        return portfolio;
    }

    public void set_portfolio(portfolio portfolio)
    {
        this.portfolio = portfolio;
    }

    // quantity
    public Long get_quantity()
    {
        return quantity;
    }

    public void set_quantity(Long quantity)
    {
        this.quantity = quantity;
    }

    // purchasePrice
    public Double get_purchase_price()
    {
        return purchasePrice;
    }

    public void set_purchase_price(Double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    // purchaseDate
    public LocalDateTime get_purchase_date()
    {
        return purchaseDate;
    }

    public void set_purchase_date(LocalDateTime purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    // name
    public String get_name()
    {
        return name;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    // category
    public String get_category()
    {
        return category;
    }

    public void set_category(String category)
    {
        this.category = category;
    }

    // quantity
    public long get_securityId()
    {
        return securityId;
    }

    public void set_securityId(Long securityId)
    {
        this.securityId = securityId;
    }

}
