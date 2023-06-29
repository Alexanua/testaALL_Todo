## Project Report: Todo App

# Your Name
- Alexander Sharif

# Project Description
- The project is a Todo app designed to assist users in writing and organizing their tasks. 
- The app allows users to create, update, and delete tasks, mark tasks as completed, and categorize tasks into different categories.

# Who did what ?
- Alexander Sharif: Independently developed the entire project, including design, implementation, testing, and incorporation of testing frameworks like Mockito and Junit5, as well as continuous integration (CI) tests.
# What I did
- User Registration: Users can create an account by entering an ID, their name, age, and registration data.
- Task Creation: Users can create tasks by entering a title, description, due date, and category.
- Task Update: Users can update the details of a task, including the title, description, due date, and category.
- Task Deletion: Users can remove a task from their list.
- Task Completion: Users can mark a task as completed.
- Task Filtering: Users can filter tasks based on their categories.
- Testing: Implemented unit tests using Junit5 and Mockito, and set up CI tests to ensure the quality and reliability of the code.

- The Work and Its Execution
- 
# What has been difficult
- Handling user input data: Validation and handling of user input data required careful implementation to ensure data integrity and prevent errors.
- Database management: Establishing a database connection, performing CRUD operations, and handling data required attention to detail.
- Implementing tests: Utilizing testing frameworks such as Mockito and Junit5, as well as setting up CI tests, were challenging but crucial for the project's success.
Describe different solutions you made.
- User input data validation: Implemented methods for validating input data to ensure user-provided data meets the required standards before processing.
- Database Handler Class: Created a separate Database Handler Class responsible for establishing and managing database connections, performing queries, and handling exceptions.
- Testing: Developed unit tests using Junit5 and Mockito to validate the functionality and reliability of the code. 
- Also set up CI tests to automatically test the code in different environments and scenarios.
- Describe something that was troublesome to achieve
- Implementing tests: Designing and implementing effective unit tests using Mockito and Junit5, as well as setting up robust CI tests, were challenging tasks that required thorough understanding and effort.
- Describe if you had to switch solution and why, in that case
- In the beginning, alternative database management systems such as MySQL or MongoDB were considered. However, SQLite was chosen due to its lightweight nature and easy integrations into the project.
## Conclusions

# What went well?
- Successfully implemented all necessary functions and functionalities.
- Achieved a clean and modular code structure, ensuring the reusability and maintainability of the code.
- Efficiently handled user input data, validation, and database management.
- Successfully implemented unit tests using Mockito and Junit5, and set up CI tests to continuously test the code.
# What went badly?
- Some minor bugs arose during development that required additional debugging and correction.
- Implementing and optimizing tests using Mockito, Junit5, and CI was a challenging task, but crucial for the project's success.
# What have I learned?
- Better understanding of database management and CRUD operations.
- Experience in implementing user validation and handling user input data.
- Improved knowledge of creating a user-friendly interface.
- Learned to implement unit tests using Mockito and Junit5 and to set up CI tests, reinforcing the importance of testing in software development.
- What would you have done differently if you redid the project
- If I redid the project, I would consider adding user authentication and authorization to ensure secure user access.
- I would also focus more on testing and debugging during the development process to minimize any bugs or issues, possibly incorporating additional testing frameworks or methods.
# What opportunities do I see with the knowledge I gained during the course ?
- With the knowledge I have gained during the course, I have the opportunity to continue developing and improving this Todo app and potentially publish it on a platform for users to use and benefit from.
- In addition, I can use the acquired knowledge and skills to participate in other development projects and collaborate with other developers to build more sophisticated applications.
- The understanding and skills acquired in testing using Mockito, Junit5, and CI tests can be instrumental in ensuring the reliability and robustness of future software development projects.

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
