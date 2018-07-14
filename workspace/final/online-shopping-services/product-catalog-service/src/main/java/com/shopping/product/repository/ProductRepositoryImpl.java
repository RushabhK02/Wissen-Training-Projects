package com.shopping.product.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.product.model.Product;

@Repository(value="productRepository")
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Product> find() {
		return em.createQuery("from Product").getResultList();
	}
	
	@Override
	public <T> Product findByProperty(T propValue) {
		Query query;
		
		if (propValue instanceof String){
			query = em.createQuery("from Product p where p.name like :prodName");
			query.setParameter("prodName", "%"+propValue+"%");
			List<Product> products = query.getResultList();
			if(products.isEmpty())
				return null;
			return products.get(0);
	    }
		if (propValue instanceof Integer){
			return em.find(Product.class, propValue);
	    }
		return null;	
	}

	@Override
	public Product save(Product product) {
		em.persist(product);
		return product;
	}
	
	

}