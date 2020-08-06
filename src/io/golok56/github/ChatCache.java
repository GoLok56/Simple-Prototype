package io.golok56.github;

import java.util.HashMap;

public class ChatCache {
    private static HashMap<Integer, Chat> cache = new HashMap<>();

    public static Chat getCache(int id) {
        Chat cachedChat = cache.get(id);
        return (Chat) cachedChat.clone();
    }

    public static void loadCache() {
        WelcomeChat welcomeChat = new WelcomeChat();
        welcomeChat.setId(1);
        cache.put(welcomeChat.getId(), welcomeChat);

        PaymentConfirmationChat paymentConfirmationChat = new PaymentConfirmationChat();
        paymentConfirmationChat.setOrderNum("112156");
        paymentConfirmationChat.setId(2);
        cache.put(paymentConfirmationChat.getId(), paymentConfirmationChat);

        ProductChat productChat = new ProductChat();
        productChat.setProducts(new String[]{"Ayam", "Sate", "Kambing"});
        productChat.setId(3);
        cache.put(productChat.getId(), productChat);
    }
}
