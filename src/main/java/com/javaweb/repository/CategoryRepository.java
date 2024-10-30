package com.javaweb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.entity.CategoryEntity;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{

	List<CategoryEntity> findByCategoryNameContaining(String categoryName);
	Page<CategoryEntity> findByCategoryNameContaining(String categoryName, Pageable pageable);

	Page<CategoryEntity> findAll(Pageable pageable);
	List<CategoryEntity> findAll(Sort sort);
	List<CategoryEntity> findAllById(Iterable<Integer> ids);
}