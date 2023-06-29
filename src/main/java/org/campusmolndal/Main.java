package org.campusmolndal;

import java.util.Scanner;

public class Main {
    // kör Now
    public static void main(String[] args) {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        UserService userService = new UserService(databaseHandler);
        ToDoService toDoService = new ToDoService(databaseHandler);

        UserMenu userMenu = new UserMenu(userService, new ToDoMenu(toDoService), new Scanner(System.in));

        userMenu.start();
    }
}






