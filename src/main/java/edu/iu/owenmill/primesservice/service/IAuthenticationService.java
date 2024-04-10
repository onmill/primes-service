package edu.iu.owenmill.primesservice.service;

import java.io.IOException;

import edu.iu.owenmill.primesservice.model.Customer;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}
