package io.golok56.github;

public class WelcomeChat extends Chat {
    @Override
    public Chat clone() {
        WelcomeChat welcomeChat = new WelcomeChat();
        welcomeChat.setId(getId());
        return welcomeChat;
    }

    @Override
    public String getResponseText() {
        return "Halo selamat pagi kak, ada yang bisa aku bantu ga nih?";
    }
}