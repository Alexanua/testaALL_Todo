package org.campusmolndal;

import java.util.Scanner;

public class ToDoAppFacade {
    private UserMenu userMenu;

    public ToDoAppFacade() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        UserService userService = new UserService(databaseHandler);
        ToDoService toDoService = new ToDoService(databaseHandler);

        ToDoMenu toDoMenu = new ToDoMenu(toDoService);
        this.userMenu = new UserMenu(userService, toDoMenu, new Scanner(System.in));
    }

    public void start() {
        userMenu.start();
    }
}
