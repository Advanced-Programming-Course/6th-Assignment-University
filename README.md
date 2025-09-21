# Class Order to Complete

1. Human  
2. Student  
3. Professor  
4. Main  

- The classes **Professor** and **Student** inherit from the **Human** class.  

---

## Question 1
In the `Human` class, modify the `staticPrint()` method so that its output cannot be changed in classes that implement or extend `Human`.  

---

## Question 2
Modify the `Student` class so that when the `sayMyName()` method is called, its `fullName` attribute is printed in the output.  

---

## Question 3
Add the following attributes with proper **Setters** and **Getters** to the `Student` class:  
- `studentNumber`  
- `majorName`  
- `universityName`  

---

## Question 4
Add the following attributes with proper **Setters** and **Getters** to the `Professor` class:  
- `professorFaculty`  
- `numberOfCourse`  
- `professorSpecialty`  

---

## Question 5
Modify the `Professor` class so that when the `sayMyName()` method is called, it prints both its `fullName` and `professorFaculty` attributes.  

---

## Question 6
After completing the `Student` and `Professor` classes, create an instance of each one and use the `instanceof` keyword to check whether these two instances are really instances of the `Human` class.  

---

## Question 7
Write the following code:  
```java
Human human = new Student();

```
What is the output of human.sayMyName()?


## Question 8

Now write this code:

```java
Human human = new Professor();
```
What is the output of human.sayMyName()?

---

## Question 9

What conclusion can be drawn from these two examples?

---
