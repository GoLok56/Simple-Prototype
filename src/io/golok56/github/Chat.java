package io.golok56.github;

public abstract class Chat {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chat clone() {
        return null;
    }

    abstract String getResponseText();
}
