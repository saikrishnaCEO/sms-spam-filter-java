package com.SMS.MainApp;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpamDetector detector = new SpamDetector();

        System.out.println("📱 Welcome to SMS Spam Filter");
        System.out.println("Type your message below (or type 'exit' to quit):");

        while (true) {
            System.out.print("\nEnter SMS: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("🔚 Exiting SMS Filter. Goodbye!");
                break;
            }

            boolean isSpam = detector.isSpam(input);
            Message msg = new Message(input, isSpam);
            msg.printMessage();
            logToFile(msg);
        }

        scanner.close();
    }

    private static void logToFile(Message msg) {
        try (FileWriter writer = new FileWriter("spam_log.txt", true)) {
            writer.write(LocalDateTime.now() + " | "
                    + msg.getContent() + " => "
                    + (msg.isSpam() ? "SPAM" : "NOT SPAM") + "\n");
        } catch (IOException e) {
            System.out.println("⚠️ Error logging message: " + e.getMessage());
        }
    }
}
