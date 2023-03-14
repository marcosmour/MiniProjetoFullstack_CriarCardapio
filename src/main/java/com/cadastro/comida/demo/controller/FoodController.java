package com.cadastro.comida.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.comida.demo.dto.FoodRequestDTO;
import com.cadastro.comida.demo.model.Food;
import com.cadastro.comida.demo.repository.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {
	
	
	@Autowired
	private FoodRepository foodRepository;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	
	/*@GetMapping
	public List<FoodDto> getAll(){
		
		List<FoodDto> foodList = foodRepository.findAll().stream().map(FoodDto::new).toList();
		
		return foodList;	
	}*/
	 
	@GetMapping()
	public List<Food> getAll() {
		return foodRepository.findAll();
	}

	@PostMapping
	public Food salve(@RequestBody FoodRequestDTO data){
		Food foodData = new Food(data);
		foodRepository.save(foodData);
		return foodData;
	}
}
