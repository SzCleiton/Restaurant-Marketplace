package com.szcleiton.desafioanotaai.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.szcleiton.desafioanotaai.domain.product.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
