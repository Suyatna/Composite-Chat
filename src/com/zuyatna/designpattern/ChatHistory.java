package com.zuyatna.designpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatHistory implements Chat {

    private List<Chat> history = new ArrayList<Chat>();

    public void addHistory(Chat chat) {

        this.history.add(chat);
    }

    public void removeHistory() {

        this.history.clear();
    }

    @Override
    public String getResponseText() {

        StringBuilder response = new StringBuilder();

        for (int i = 0; i < history.size(); i++) {
            response.append("\n").append("-").append(history.get(i).getResponseText());
        }

        return response.toString();
    }
}
