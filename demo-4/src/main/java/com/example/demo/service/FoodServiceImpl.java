package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.FoodRepository;

@Service
public class FoodServiceImpl implements FoodService {
  @Autowired
  private FoodRepository foodRepository;

  @Override
  public List<Map<String, Object>> getFoods() {
    return foodRepository.getFoods();
  }
}
