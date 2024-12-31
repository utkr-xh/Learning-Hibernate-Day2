# Learning-Hibernate-Day2
This Java code demonstrates using Hibernate to create tables as well as insert data into them.

## This Java code demonstrates the following:

*  Hibernate Configuration:
    - Loads configuration from "hibernate.cfg.xml".
    - Defines the entity class Books.</br>
* Session Management:
  - Opens a session to interact with the database.
  - Begins a transaction to ensure data consistency.</br>
* Object Creation:
  - Creates Books objects with sample data (ID, title, author, year, cost).</br>
* Persistence:
  - Persists the Books objects to the database using ss.persist().</br>
* Transaction Commit:
  - Commits the transaction to save the changes permanently.</br>
* Session Close:
  - Closes the session to release resources.</br>
### Note:

This code snippet focuses on the core logic of data insertion.
For production use, you would typically handle exceptions, implement proper logging, and consider using a more robust data population strategy (e.g., reading data from a file or database).

## Code Snippet
![image](https://github.com/user-attachments/assets/f1ce75ee-a69f-40c3-9c91-6e2fd201f3a0)

## Output
![image](https://github.com/user-attachments/assets/4728c3f4-5427-40ca-809a-a39c2eeb6c24)
