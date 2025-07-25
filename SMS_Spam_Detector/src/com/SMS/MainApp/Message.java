package com.SMS.MainApp;

public class Message {
    private String content;
    private boolean isSpam;

    public Message(String content, boolean isSpam) {
        this.content = content;
        this.isSpam = isSpam;
    }

    public String getContent() {
        return content;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public void printMessage() {
        System.out.println("Message: " + content);
        System.out.println("Status: " + (isSpam ? "SPAM 🚫" : "NOT SPAM ✅"));
    }
}

