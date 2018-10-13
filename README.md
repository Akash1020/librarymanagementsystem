# Library Management System
Java based web application created with Java, JSP/Servlets, JDBC, Apache Tomcat and Java Mail.
Core Modules:
The core requirements of this application are split across four modules
•	Admin Functionality
•	Student Login
•	Issue Books 
•	Email Functionality

### Admin Functionality: 
An admin visits a login page and enters the following details: a username and a password which are already pre-defined. On submitting this information, the system will direct the admin to the dashboard where there are buttons to Add, Update and Delete a book.
•	Add A Book: The Admin can add a book by entering the required details. 
•	Update a Book: The Admin can update a book based on the id value of the book.
•	Delete A Book: The Admin can delete a book based on the book id.

### Student Login Functionality:
A student visits a login page and enters the following details: a username and a password which are already defined in the database. On submitting this information, the system checks with the data in the database and authenticates the student to login.

### Issue Book Functionality:
Student home page contains buttons that direct the students to view available books, and view issued books pages. For view the available books: it displays a list of all the available books in the library that has book id, book name, publication date and Author as fields. Also, for each book an option will be displayed whether to Issue the book or not. In the end the user will receive a confirmation email after successfully issuing the books. For viewing the issued books record: it contains a form that has book id, book name, author and publication date as fields.

### Email Functionality: 
For each book an option will be displayed whether to Issue the book or not. In the end the user will receive a confirmation email after successfully issuing the books. This robust application that is secure against XSS, SQLi and sends e-mails to the employees on leave approval using SMTP.

### Validations: 
Also, application includes input form validation, guarded views, and preventing form resubmission on pressing back button. Also, checks the password strength (has to minimum 8 characters long, alphanumeric).

## Deploying the application
•	Hosted the database in the cloud by creating a db instance in Amazon RDS. 
•	Managed RDS DB from MySQL workbench connection.
•	Connected to RDS DB from the application using JDBC.
•	Hosted WAR file on AWS using Elastic BeanStalk service.



