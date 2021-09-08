package ru.vorobyov.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vorobyov.shop.entities.Product;
import ru.vorobyov.shop.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/sort")
	private String showProductsPage(Model model, @RequestParam (value = "sort_method", defaultValue = "asc") String sortMethod) {
		
		List<Product> productList = null;
		
		if ("asc".equals(sortMethod)) {
//			productList = productService.findAllOrderByPriceAsc();
			productList = productService.findAll();
//		} else if ("desc".equals(sortMethod)) {
//			productList = productService.findAllOrderByPriceDesc();
//		} else if ("max".equals(sortMethod)) {
//			productList = productService.findMax();
//		} else if ("min".equals(sortMethod)) {
//			productList = productService.findMin();
//		} else {
//			productList = productService.findAllOrderByPriceAsc();
		}
		
		model.addAttribute("productsList", productList);
		
		return "products";
	}

}
