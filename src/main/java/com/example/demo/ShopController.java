package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    // RESTful API methods for Retrieval operations
    @GetMapping("/shops")
    public List<Shop> list() {
        return shopService.listAll();
    }

    @GetMapping("/shops/{id}")
    public ResponseEntity<Shop> get(@PathVariable Integer id) {
        try {
            Shop shop = shopService.get(id);
            return new ResponseEntity<>(shop, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/shops")
    public void add(@RequestBody Shop shop) {
        shopService.save(shop);
    }

    // RESTful API method for Update operation
    @PutMapping("/shops/{id}")
    public ResponseEntity<?> update(@RequestBody Shop shop, @PathVariable Integer id) {
        try {
            Shop existShop = shopService.get(id);
            shopService.save(shop);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Delete operation
    @DeleteMapping("/shops/{id}")
    public void delete(@PathVariable Integer id) {
        shopService.delete(id);
    }
}
