package com.zuyatna.designpattern;

import java.util.ArrayList;
import java.util.List;

public class ProductChat implements Chat {

    private List<String> products = new ArrayList<String>();

    public void setProducts(List<String> products) {

        this.products = products;
    }

    @Override
    public String getResponseText() {

        StringBuilder response = new StringBuilder("List of products: ");

        for (int i = 0; i < products.size(); i++) {
            response.append("\n ").append(i + 1).append(" ").append(products.get(i));
        }

        return response.toString();
    }
}
