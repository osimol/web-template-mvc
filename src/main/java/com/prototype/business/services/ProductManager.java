package com.prototype.business.services;

import java.util.List;

import com.prototype.business.entities.Product;

public interface ProductManager {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}
