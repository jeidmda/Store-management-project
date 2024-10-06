# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![alt text](<Screenshot 2024-10-05 1.25.34 PM.png>)

## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is use to output information for your store in the console.

My project is based on a dealership. A kind of store that sells cars. My dealership sells SUVs, pick up trucks, and sedans. The way I did this was by first creating instance variables for the superclass and for the subclasses. Then I made constructors, accessor, and mutator methods in superclass and subclasses. These are then called out by the instantiated objects made for their classes to then be printed out from a toString method which puts all the if together in a very orderly fashion. After this is a user input system. One where it asks you if you want a Pick up truck, an SUV, or a sedan. First it asks if you want a pick up truck. If the user inputs true, then the code will ask a series of questions which ask the user what kind of stuff they want on their pick up truck. If user input equals false, then the code asks if the user would like an SUV. If the user inputs true, then the code will ask a sereies of questions like for the truck but now for the SUV. If the user inputs false then the code will ask the user if they would like to buy a sedan. If the yser inputs true then the code will asks questions on what kind of sedan the user would like, like the previous questions. If the user inputs false then the code will output a line of code saying "Thank you for shopping at our car dealership!" Each type of vehicle has their own specific questions that are different to the other types of vehicles. If anything else is input for the true or false, then the code will not run and will give a mismatch error.