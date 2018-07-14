package com.shopping.product.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.product.model.Review;

@Transactional
@Repository(value="reviewRepository")
public class ReviewRepositoryImpl implements ReviewRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Review> loadReviews(int productId) {
		Query query = em.createQuery("from Review r where r.product.id=:productId");
		query.setParameter("productId", productId);
		List<Review> reviews=query.getResultList();
		if(reviews.isEmpty())
			return null;
		return reviews;
	}

	@Override
	public Review addReview(Review review) {
		return em.merge(review);
	}

	@Override
	public Review findById(int reviewId) {
		Review review = em.find(Review.class, reviewId);
		if(review==null)
			return null;
		return review;
	}

	@Override
	public void deleteReview(int reviewId) {
		em.remove(em.find(Review.class, reviewId));	
	}

}
