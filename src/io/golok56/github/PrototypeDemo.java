package io.golok56.github;

public class PrototypeDemo {
    public static void main(String[] args) {
        ChatCache.loadCache();

        Chat clonedChat = ChatCache.getCache(1);
        System.out.println("Id: " + clonedChat.getId() + "\nResponse: " + clonedChat.getResponseText());

        Chat clonedChat2 = ChatCache.getCache(2);
        System.out.println("Id: " + clonedChat2.getId() + "\nResponse: " + clonedChat.getResponseText());

        Chat clonedChat3 = ChatCache.getCache(3);
        System.out.println("Id: " + clonedChat3.getId() + "\nResponse: " + clonedChat.getResponseText());
    }
}
