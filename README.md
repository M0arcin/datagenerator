# Data generator

This service generates randomized data set about locations and converts it from JSON to CSV. It consists of **two microservices** made with Spring Boot that uses Java 13. 

## Getting Started

To use this microservice clone or download this repo. After you unpack it, open the cmd or any console emulator you are using and go to the first microservice location - for example

> cd C:\Users\m0arc\IdeaProjects\datagenerator\randomValuesGenerator

After doing this run

> mvnw.cmd clean install

and then 

> mvnw spring-boot:run

Congrats! You got the first microservice running! Now let's open another console window and do the same thing but with the second microservice.

> cd C:\Users\m0arc\IdeaProjects\datagenerator\CSVConverter

> mvnw.cmd clean install

> mvnw spring-boot:run

Now you got both microservices running you can proceed to their own sections!

## Microservice #1

The first one is called **random value generator** and it's running on port 8080. There is a database connected with prepared location data. This microservice randomly chooses a list of data to display and return it in JSON format on its only endpoint. To access it, go to 

### **http://localhost:8080/generate/json/{size}**

and instead of {size} put a number of amount of data set you to wish to generate.

## Microservice #2

###### You won't be able to access its endpoints without the first microservice running!

The second microservice is called **CSVConverter** and it's running on port 8081. The way it works is quite simple. 
It sends a request to the first microservice (currently it asks for 10 sets of data but it can be changed inside code) and convert it to CSV file.
When going to an endpoint, you can download such a file and display it in notepad/excel or whatever text editor you wish to you. 
It has two endpoints:

### **http://localhost:8081/converter/csv**

It returns CSV file with data in a format of ‘type, _id, name, type, latitude, longitude’. 
The first line display columns and every other line represent one object.

### **http://localhost:8081/converter/csv/{attributes}**

This endpoint works exactly like the previous one although it put you in charge of selecting attributes! 
There are 15 attributes to choose from:
- _type 
- id 
- key 
- name 
- fullname 
- iata_airport_code 
- type 
- country 
- latitude 
- longitude 
- location_id 
- ineurope 
- countrycode 
- corecountry 
- distance

Order or letter case doesn't matter but **remember to separate them by using comma!**

Thanks for your time, if you have any questions please contact me via Github email or discord (M0arcin#7356)
