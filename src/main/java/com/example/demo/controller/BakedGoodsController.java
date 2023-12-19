package com.example.demo.controller;

import com.example.demo.model.BakedGoods;
import com.example.demo.service.BakedGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/baked-goods")
public class BakedGoodsController {
    private final BakedGoodsService bakedGoodsService;

    @Autowired
    public BakedGoodsController(BakedGoodsService bakedGoodsService) {
        this.bakedGoodsService = bakedGoodsService;
    }

    @GetMapping("/get-details")
    public List<BakedGoods> getAllProductsDetails() {
        return bakedGoodsService.getAllProductsDetails();
    }
}
