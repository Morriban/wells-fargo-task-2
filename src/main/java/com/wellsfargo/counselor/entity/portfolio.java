package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

public class portfolio
{
    @Id
    @GeneratedValue
    private long portfolioID;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @OneToOne
    @JoinColumn(nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<security> securities;

    protected portfolio() {

    }

    public portfolio(long portfolioID, LocalDateTime creationDate, Client client, Set<security> securities) {
        this.portfolioID = portfolioID;
        this.creationDate = creationDate;
        this.client = client;
        this.securities = securities;
    }

    // portfolioID
    public long get_portfolioID()
    {
        return portfolioID;
    }

    public void set_portfolioID(long portfolioID)
    {
        this.portfolioID = portfolioID;
    }

    // clientID
    public Client get_client()
    {
        return client;
    }

    public void set_client(Client client)
    {
        this.client = client;
    }

    // securities
    public Set<security> get_securities()
    {
        return securities;
    }

    public void set_securities(Set<security> securities)
    {
        this.securities = securities;
    }

    // creationDate
    public LocalDateTime get_creationDate()
    {
        return creationDate;
    }

    public void set_creationDate(LocalDateTime creationDate)
    {
        this.creationDate = creationDate;
    }

}
