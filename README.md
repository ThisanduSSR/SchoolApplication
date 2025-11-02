📘 School Application – Java Inheritance Project
🧠 Overview

This Java project demonstrates the concept of Object-Oriented Programming (OOP) — specifically inheritance, constructors, method overriding, and encapsulation.

It models a school system with three classes:

Person → the base (parent) class

Student → a subclass that inherits from Person

Teacher → another subclass that inherits from Person

Each class represents real-world objects and shows how code reuse and hierarchies work in Java.

✨ Features

✅ Inheritance:
Student and Teacher classes extend the Person class to reuse its data and methods.

✅ Encapsulation:
Private and protected instance variables with public getter/setter methods.

✅ Constructors:
Demonstrates constructor chaining using the super() keyword.

✅ Method Overriding:
Each subclass overrides the toString() method to provide detailed output.

✅ Reusability:
Common data (like name, age, gender) is written once in Person and used in both subclasses.

🧩 Class Descriptions
🧍 Person.java

Base class that stores:

myName – Name of the person

myAge – Age

myGender – Gender ("M"/"F")

Includes:

Constructor

Getters & setters

toString() to print info

🎓 Student.java

Subclass of Person, adds:

idNum – Student ID

fee – Tuition fee

grade – Final grade

👨‍🏫 Teacher.java

Subclass of Person, adds:

salary – Teacher’s salary

subject – Subject taught

💻 Example Output

When running TestSchool.java:

Jack Brooke, age: 27, gender: M
Elisabeth Smith, age: 16, gender: F, ID: 122233, fee: 2500.0, grade: A
Sam Hamilton, age: 34, gender: M, subject: Computer Science, salary: 50000.0

🧠 Key OOP Concepts Used
Concept	Description
Class	Blueprint for creating objects (Person, Student, Teacher).
Object	Instance of a class.
Inheritance	Enables one class to acquire the properties of another (extends).
Encapsulation	Restricts direct access to fields (using getters and setters).
Method Overriding	Allows a subclass to change the behavior of a method defined in the parent class.
Constructor Chaining	Using super() to call the parent constructor.
🧪 How to Run the Project

Open the project in IntelliJ IDEA, VS Code, or any Java IDE.

Make sure all .java files are in the same package or directory.

Compile and run the TestSchool.java file.

The program will display details of a person, student, and teacher.

📁 Optional Extension (Independent Study)

You can extend this project by:

Adding an array of Students inside the Teacher class (e.g., Student[] tutees).

Creating a method in Teacher to print all the students they teach.

Adding a Course class for a more complete school system.

🧑‍💻 Author
Thisandu Ranadheera


🏷️ Tags

Java OOP Inheritance Encapsulation Polymorphism Tutorial Beginner Java
