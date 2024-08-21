package com.example.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
@CrossOrigin
public class ProductController {
	
	List<Product> products;
	
	int counter = 0;
	
	public ProductController() {
		Product product1 = new Product("p_01", "Levis Jeans", "30", "Clothing");
		Product product2 = new Product("p_02", "Sony LED", "600", "Electronics");
		Product product3 = new Product("p_03", "Lee T-Shirt", "20", "Clothing");
		Product product4 = new Product("p_04", "IPhone", "450", "Electronics");
		
		//products = List.of(product1, product2, product3, product4);
		products = new CopyOnWriteArrayList<>();
		products.add(product1);    products.add(product2);  products.add(product3);   products.add(product4);
	}

	@GetMapping("/allProducts")
	public List getAllProducts() throws InterruptedException {
		
		System.out.println("Inside getAllProducts()...");
		
		return products;
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		
		System.out.println("product is "+product);
		
		return "Product Added Succesfully";
	}
	
	@GetMapping("/fetchName")
	public String getName() throws InterruptedException {
		System.out.println("fetchName()");
		
		//Thread.sleep(5000);
		//counter++;
//		
		return "Eileen";
	}
	
	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable String productId) {
		
		System.out.println("Product Id received is "+productId);
		
		for(Product product : products) {
			
			if(product.getProductId().equals(productId)) {
				products.remove(product);
			}
		}
		
		return "Product Deleted and the size is "+products.size();
	}
}
