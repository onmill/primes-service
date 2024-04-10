package edu.iu.owenmill.primesservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class Customer {
    private String username;
    private String password;
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
