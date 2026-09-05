package com.example.redis.springdata.redis;

import com.example.redis.springdata.redis.entity.Product;
import com.example.redis.springdata.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class SpringDataRedisApplication {

	@Autowired
	private ProductDao dao;
	@PostMapping
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	public Product findProductId(@PathVariable int id) {
		return dao.findProductById(id);
	}

	@DeleteMapping("{id}")
	public String deleteProduct(@PathVariable int id) {
		return dao.deleteProduct(id);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisApplication.class, args);
	}

}
