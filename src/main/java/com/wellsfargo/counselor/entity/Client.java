package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientID;

    @ManyToOne
    @JoinColumn(name = "advisor_id",nullable = false)
    private Advisor advisor;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;


    protected Client() {

    }

    public Client(long clientID, Advisor advisor, String firstName, String lastName, String address, String phone, String email) {
        this.clientID = clientID;
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    // advisor
    public Advisor get_Advisor()
    {
        return advisor;
    }

    public void set_Advisor(Advisor advisor)
    {
        this.advisor = advisor;
    }

    // first name
    public String get_first_name()
    {
        return firstName;
    }

    public void set_first_name(String firstName)
    {
        this.firstName = firstName;
    }

    // last name
    public String get_last_name()
    {
        return lastName;
    }

    public void set_last_name(String lastName)
    {
        this.lastName = lastName;
    }

    // address
    public String get_address()
    {
        return address;
    }

    public void set_address(String address)
    {
        this.address = address;
    }

    // phone
    public String get_phone()
    {
        return phone;
    }

    public void set_phone(String phone)
    {
        this.phone = phone;
    }

    // email
    public String get_email()
    {
        return email;
    }

    public void set_email(String email)
    {
        this.email = email;
    }

    // clientID
    public long get_client_ID()
    {
        return clientID;
    }

    public void set_client_ID(long clientID)
    {
        this.clientID = clientID;
    }




}
