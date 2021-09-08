package ru.vorobyov.shop.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.vorobyov.shop.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
	
	List<Product> findAll();
	
//	List<Product> findAllOrderByPriceAsc();
//
//	List<Product> findAllOrderByPriceDesc();
//
//	List<Product> findAllOrderByPriceAscLimit1();
//
//	List<Product> findAllOrderByPriceDescLimit1();
	
}
