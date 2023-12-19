package com.example.demo.service;

import com.example.demo.model.BakedGoods;
import com.example.demo.repository.BakedGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BakedGoodsService {
    private final BakedGoodsRepository bakedGoodsRepository;

    @Autowired
    public BakedGoodsService(BakedGoodsRepository bakedGoodsRepository) {
        this.bakedGoodsRepository = bakedGoodsRepository;
    }

    public List<BakedGoods> getAllProductsDetails() {
        return bakedGoodsRepository.findAll();
    }
}
