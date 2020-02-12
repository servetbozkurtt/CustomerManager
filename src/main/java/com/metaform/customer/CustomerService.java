package com.metaform.customer;

import java.util.List;
import java.util.Optional;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metaform.customer.config.PersistenceConfig;



@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Autowired
	private PersistenceConfig config;
	
	public List<Customer> listAll(){
		Session session = config.sessionFactory().getObject().openSession();
		@SuppressWarnings("deprecation")
		Criteria customerCriteria = session.createCriteria(Customer.class);
		customerCriteria.add(Restrictions.eq("silindi",false));
		@SuppressWarnings("unchecked")
		List<Customer> results = customerCriteria.list();
		return results;
		
//		return (List<Customer>) repo.findAll();
	}

	public Optional<Customer> findById(Long id) {
		return repo.findById(id);
	}

	public void save(Customer customer) {
		repo.save(customer);
	}

	public Customer get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Customer> search(String keyword) {
		return repo.search(keyword);
	}
}
