package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FoodService;

@RestController
public class FoodController {
  @Autowired
  private FoodService foodService;
  
  @GetMapping("/v1/foods")
  public List<Map<String, Object>> getFoods(){
	  return foodService.getFoods();
  }
}
