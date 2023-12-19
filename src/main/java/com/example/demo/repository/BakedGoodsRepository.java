package com.example.demo.repository;

import com.example.demo.model.BakedGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BakedGoodsRepository extends JpaRepository<BakedGoods, Long> {
    // Custom queries can be added here if needed
}
