/**
 * 
 */
package com.neon.dao;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.neon.bean.Customer;

/**
 * @author user368
 *
 */

public interface CustomerOperationDao {

	public List<Customer> createCustomer(Customer customer);

	public void deleteCustomer(int id);

	public Customer updateCustomer(Customer customer, int customerId);

	public List<Customer> listCustomer();

}
