package com.cadastro.comida.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.comida.demo.model.Food;

public interface FoodRepository extends JpaRepository<Food, UUID>{

}
