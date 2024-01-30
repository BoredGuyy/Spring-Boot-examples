package com.khalil.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCostumer(Customer customer);
    boolean existsCustomerWithEmail(String email);
    boolean existsCustomerById(Integer id);
    void deleteCurstomerWithId(Integer id);
    void updateCustomerWithId(Customer customer);
}
