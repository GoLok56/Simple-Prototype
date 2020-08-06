package io.golok56.github;

public class ProductChat extends Chat {
    private String[] products;

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public Chat clone() {
        ProductChat productChat = new ProductChat();
        productChat.setId(getId());
        productChat.setProducts(products);
        return productChat;
    }

    @Override
    public String getResponseText() {
        StringBuilder response = new StringBuilder("Ini kak produk yang kami sediakan: ");
        for (int i = 0; i < products.length; i++) {
            response.append("\n").append(i + 1).append(" ").append(products[i]);
        }

        return response.toString();
    }
}