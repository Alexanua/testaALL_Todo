# Project Name
## Todo App

## Description
The Todo App is a task management application designed to help users write, organize, and track their tasks. With this app, users can create, update, and delete tasks, mark tasks as completed, and categorize tasks into different categories.

## Motivation
The motivation behind this project was to enhance skills in Java development and working with databases. The project aimed to create a practical application that assists users in staying organized and effectively managing their tasks. Additionally, the project aimed to gain experience in writing unit tests and using Mockito to simulate interactions with a database.

## Problem Solved
The Todo App aims to solve the problem of task management and organization. Many individuals struggle to keep track of their tasks, often forgetting important deadlines or failing to prioritize their work effectively. By providing a simple and intuitive interface for creating and managing tasks, this app helps users stay organized, improve productivity, and ensure that important tasks are not overlooked.

## Key Learnings
During the development of this project, several valuable learnings were gained:
- Working with the SQLite database and performing basic database operations such as inserting, updating, and retrieving data.
- Writing unit tests using JUnit and Mockito to ensure code correctness and simulate interactions with the database.
- Understanding software design principles and best practices, such as separating concerns and maintaining code modularity.

## Project Status
- [x] Fully functioning TODO application that can handle TODOs from the command line.
- [x] Comprehensive tests for the application.
- [x] Successful mocking of dependencies in the tests.
- [x] Continuous Integration (CI) tests through Github Actions.
- [x] Implementation of a database using SQLite.
- [x] Utilization of JUnit 5, Mockito, and JSON in Java.
- [x] Building the project using Maven.
- [x] Integration of Github Actions for testing the project.

Please note that during the implementation of Continuous Integration (CI) tests through Github Actions, there were challenges encountered. However, with diligent troubleshooting and support, the project's CI tests were successfully set up and running.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Credits](#credits)
- [License](#license)

## Installation
To install and run the project locally, follow these steps:

- Clone the repository to your local machine:
- git clone https://github.com/Alexanua/testaALL_Todo.git

- Navigate to the project directory:
- cd project (Mac)
- Install the required dependencies using Maven:
- mvn install
- Configure any necessary environment variables as specified in the project documentation.
- Start the project locally:
## mvn exec:java

Note: Make sure you have the Java Development Kit (JDK) installed on your machine.

The Todo app should now be running locally. Ensure that you have the necessary prerequisites installed and configured correctly before proceeding with the installation steps. Refer to the project documentation for detailed instructions and any additional setup requirements specific to your environment.

## Usage
Once the Todo app is up and running, you can use it to manage your tasks effectively. Follow these instructions to get started:

1. Register a user by selecting "Register User" from the menu and providing the required information.

2. Use the "Todo List" option in the menu to access the Todo Menu.

3. In the Todo Menu, you can perform the following actions:
- Add a new item: Enter the details of the task, such as ID, text, completion status, assigned user ID, and category.
- Mark an item as done: Enter the ID of the item you want to mark as done.
- Delete an item: Enter the ID of the item you want to delete.

4. Use the "Exit" option in the main menu to exit the application.

## Credits
This project wouldn't have been possible without the contributions of the following team members:
- Marcus
- Alexander

If you used any third-party assets that require attribution, list the creators with links to their primary web presence in this section.

## License
The project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).

## Dependencies
The project uses the following dependencies (included via Maven):
- ch.qos.logback:logback-classic:1.4.8
- ch.qos.logback:logback-core:1.4.8
- com.beust:jcommander:1.82
- junit:junit:4.12
- net.bytebuddy:byte-buddy-agent:1.14.4
- net.bytebuddy:byte-buddy:1.14.4
- org.apiguardian:apiguardian-api:1.1.2
- org.hamcrest:hamcrest-core:1.3
- org.json:json:20230227
- org.junit.jupiter:junit-jupiter-api:5.9.3
- org.junit.jupiter:junit-jupiter-engine:5.9.3
- org.junit.platform:junit-platform-commons:1.9.3
- org.junit.platform:junit-platform-engine:1.9.3
- org.mockito:mockito-core:5.3.1
- org.mongodb:bson-record-codec:4.9.1
- org.mongodb:bson:4.9.1
- org.mongodb:mongodb-driver-core:4.9.1
- org.mongodb:mongodb-driver-sync:4.9.1
- org.objenesis:objenesis:3.3
- org.opentest4j:opentest4j:1.2.0
- org.slf4j:slf4j-api:2.0.7
- org.testng:testng:7.8.0
- org.webjars:jquery:3.6.1
- org.xerial:sqlite-jdbc:3.42.0.0

