package com.szcleiton.desafioanotaai.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.szcleiton.desafioanotaai.domain.category.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
