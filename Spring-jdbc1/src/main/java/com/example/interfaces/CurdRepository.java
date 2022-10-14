package com.example.interfaces;
import java.util.*;

import com.example.demo.model.Customer;
public interface CurdRepository<T> {
	public boolean save(T t);
	public List<Customer> findAll();

}
