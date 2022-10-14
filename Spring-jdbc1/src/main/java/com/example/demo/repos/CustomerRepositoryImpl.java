package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.interfaces.CurdRepository;

@Repository
public class CustomerRepositoryImpl implements CurdRepository<Customer> {
private JdbcTemplate template;
@Autowired
public CustomerRepositoryImpl(JdbcTemplate template) {
	super();
	this.template=template;
}
	@Override
	public boolean save(Customer t) {
String sql ="insert into tieto_customer values(?,?,?)";
             
        
        int rowAdded=
                template.update(sql,t.getCustomerid(),t.getCustomername(),t.getEmail());
        
        return rowAdded==1;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from tieto_customer";
		return  template.query(sql, BeanPropertyRowMapper.newInstance(Customer.class));
	}

}
