## My solutions for SQL exercises

### Task 1

You have a table called users with columns id, name, and email. You want to select all the users who have a Gmail address.

    SELECT * FROM users 
      WHERE email LIKE '%@gmail.com';

### Task 2

You have a table called orders with columns id, customer_id, date, and total_price. You want to select the total price 
for each customer, sorted by customer ID in ascending order.

    SELECT  customer_id, 
      SUM(total_price) AS total_price 
      FROM orders 
      GROUP BY customer_id 
      ORDER BY customer_id;

### Task 3

You have a table called products with columns id, name, and price. You want to update the price of a product with ID 1 to 10.

    UPDATE products 
      SET price = 10 
      WHERE id = 1;

### Task 4

Situation: You have a table called employees with columns id, name, department, and salary. You want to calculate the average salary 
for each department, and select only the departments where the average salary is greater than $50,000.

    SELECT department, AVG(salary) 
      FROM employees 
      GROUP BY department 
      HAVING AVG(salary) salary > 50000;

### Task 5

You have a table called customers with columns id, name, email, and phone. You want to insert a new customer with the 
name "John Doe", email "johndoe@example.com", and phone number "555-1234".

    INSERT INTO customers (name, email, phone)
      VALUES ('John Doe', 'johndoe@example.com', '555-1234');

### Task 6

Create a table "students" with columns "id", "name", "age", "gender", and "address".

    CREATE TABLE students (
      id INT PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(30),
      age INT,
      gender ENUM('male', 'female'),
      address VARCHAR
    );

### Task 7

Update the age of the student with id=1 to 21.

    UPDATE students 
      SET age = 21 
      WHERE id = 1;

### Task 8

Delete the student with id=1.

    DELETE FROM students 
      WHERE id = 1;

### Task 9

Select all students who are older than 18.

    SELECT * FROM students 
      WHERE age > 18;

### Task 10

Select the name and address of all female students.

    SELECT name, address 
      FROM students 
      WHERE gender = 'female';

### Task 11

Select the average age of all students.

    SELECT AVG(age) 
      FROM students;

### Task 12

Select the number of male and female students.

    SELECT COUNT(id), gender 
      FROM students 
      GROUP BY gender;

### Task 13

Select the top 3 oldest students.

    SELECT * FROM students 
      ORDER BY age 
      DESC LIMIT 3;

### Task 14

Select the name and age of the youngest male student.

    SELECT name, age 
      FROM students 
      WHERE gender = 'male' 
      ORDER BY age 
      LIMIT 1;
