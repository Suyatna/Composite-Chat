package com.zuyatna.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> features = new ArrayList<>();
        features.add("entertainment");
        features.add("fashion");
        features.add("information");

        ChatHistory history = new ChatHistory();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";

        while (!text.equalsIgnoreCase("quit")) {

            System.out.print("say: ");
            text = reader.readLine();

            if (text.equalsIgnoreCase("halo")) {

                Chat welcome = new WelcomeChat();

                history.addHistory(welcome);

                System.out.println(welcome.getResponseText());
            }
            else if (text.equalsIgnoreCase("product")) {

                Chat product = new ProductChat();
                ((ProductChat) product).setProducts(features);

                history.addHistory(product);

                System.out.println(product.getResponseText());
            }
            else if (text.equalsIgnoreCase("payment")) {

                Chat payment = new PaymentConfirmationChat();
                ((PaymentConfirmationChat) payment).setOrderNum("0001");

                history.addHistory(payment);

                System.out.println(payment.getResponseText());
            }
            else if (text.equalsIgnoreCase("history")) {

                System.out.println(history.getResponseText());
            }
            else if (text.equalsIgnoreCase("clear")) {

                history.removeHistory();
                System.out.println("history has been removed");
            }
            else
                System.out.println("please say to me :(");

            System.out.println();
        }
    }
}
