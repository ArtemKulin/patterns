package ru.kulinartem.patterns.mediator;

public class ChatRunner {

    public static void main(String[] args) {
        SimpleTextChat simpleChat = new SimpleTextChat();

        User admin = new Admin(simpleChat, "Admin");
        User user1 = new SimpleUser(simpleChat, "User1");
        User user2 = new SimpleUser(simpleChat, "User2");

        simpleChat.setAdmin(admin);
        simpleChat.addUserToChat(user1);
        simpleChat.addUserToChat(user2);

        user1.sendMessage("Hello, I am User 1!!!");
        admin.sendMessage("Roger that. I am admin!!!");
    }
}
