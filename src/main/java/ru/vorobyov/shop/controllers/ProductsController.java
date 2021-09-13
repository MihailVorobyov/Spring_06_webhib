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
@RequestMapping
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	private String showProductsPage(Model model, @RequestParam (value = "sort_method", defaultValue = "fromMin") String sortMethod,
	                                            @RequestParam (value = "min", defaultValue = "0.0") String min,
	                                            @RequestParam (value = "max", defaultValue = "1500.0") String max) {
		List<Product> productList = null;
		
		if ("fromMin".equals(sortMethod)) {
			productList = productService.fromMin(Double.parseDouble(min));
		} else if ("toMax".equals(sortMethod)) {
			productList = productService.toMax(Double.parseDouble(max));
		} else if ("fromMinToMax".equals(sortMethod)) {
			productList = productService.fromMinToMax(Double.parseDouble(min), Double.parseDouble(max));
		}
		
		model.addAttribute("productList", productList);
		
		return "products";
	}

}
