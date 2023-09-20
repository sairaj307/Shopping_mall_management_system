package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    List<Shop> listAll() {
        return shopRepository.findAll();
    }

    Shop get(Integer id) {
        return shopRepository.findById(id).get();
    }

    public void save(Shop shop) {
        shopRepository.save(shop);
    }

    public void delete(Integer id) {
        shopRepository.deleteById(id);
    }
}
