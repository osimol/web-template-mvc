package com.prototype.business.services;

import java.util.List;

import com.prototype.business.entities.Product;

public class SimpleProductManager implements ProductManager {

	private List<Product> products;
	
	public List<Product> getProducts() {
		return products; 
		//throw new UnsupportedOperationException();
	}

	public void increasePrice(int percentage) {
		if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }  
		//throw new UnsupportedOperationException();
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		//throw new UnsupportedOperationException();
	}
}
