# Java Codes - Different Java Codes.

### Included topics :
1. Java core.
2. Java polymorphism.
3. Java file handling. 
4. Java multithreading.
5. Java object oriented programming. 

**Note**: Program links are given in front of questions directly.


<p>
<img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
</p>

## Questions 
1. calendar - Date and weekday finder in Java. ->[Calendar Program](https://github.com/ishanjogalekar/Java-Programs/blob/main/1.CalendarFinder.java)
2. BMI calculator. ->[BMI calculator](https://github.com/ishanjogalekar/Java-Programs/blob/main/2.BMIcalculator.java)
3. Vowelgram in Java. ->[Vowelgram](https://github.com/ishanjogalekar/Java-Programs/blob/main/3.Vowelgram.java)
4. Hostel registration program based on CGPA of student in Java (Multi-threading concepts and file handling with .txt file). :- Create classes Students and HostelBlocks with necessary details.<br/> a)Store the objects as collections in a File.<br/>  b)Create threads for Hostel_Incharge to allocate rooms based on **CGPA**.<br/> c)If incharges are trying to allocate the same rooms, handle the situation using inter thread communication. ->[Hostel Registration](https://github.com/ishanjogalekar/Java-Programs/blob/main/4.Hostel_registration.java)
5. Fibonacci Series in Java. ->[Fibonacci series](https://github.com/ishanjogalekar/Java-Programs/blob/main/5.Fibonacci.java)
6. Define an abstract class called Travel **[defined in package1]** with few appropriate data members and methods for getting and displaying the same,<br/>
a)create two subclasses called  *InternationalTravel*  and  *NationalTravel*  with new necessary data members respectively.<br/> 
b)Create at least three objects for both of the subclasses and just display the info in **package2** based on your travel experience so far.<br/> 
c)Also create a method which scans the places which you would like to travel along with tentative year, in which you may travel and display that as well **[Future plans]**. ->[Travelling Program](https://github.com/ishanjogalekar/Java-Programs/blob/main/6.Travel_program.java)
7. Create a class called *Student* with Data members : <br/> 
(A) Regno <br/>
(B) Name <br/> 
(C) **static data member** named as Univ_name and static counter variable to store number of objects created and <br/> 
**Methods** : <br/>
(a) GetMethod <br/>
(b) PrintMethod <br/>
(c) Constructor <br/>
(d) Parametrized constructor <br/>
Also create a class called Courses with details like Course code,name,slot and venue along with necessary methods.<br/>
(I)Main method has to be provided in Registration class <br/> 
(II) create 4 course objects with two A1 slot courses, two B1 slot courses <br/>
(III)create two students objects and get display all course details to them and inform them to choose two subjects <br/>
(IV) if the selected courses have same slots, ask student to choose without clashing <br/>
(V) print the selected course in a table format with all necessary details. <br> ->[Students' Subject program](https://github.com/ishanjogalekar/Java-Programs/blob/main/7.Student_subjects.java)
8. Design a class called Participants with properties like *Name,Phno,Branch and University, TestResult_Classification[L1,L2,L3,L4,L5].* <br/>
Create a static method to display a message as follows based on the selection criteria,<br/>
(i) If student test result classification is **L1**, congratulate the student and inform that he/she has been selected for both Full time intership as well as Full time job. <br/>
(ii) If student test result classification is **L2 or L3**, inform the student that he/she has been selected for Full time intership and Job may be offered based on intership Performance. <br/>
(iii) If student test result classification is **L4 or L5,** inform that he/she has been selected for Part time intership of 21 days.<br/>
*Note*: 
A)Don’t use if statement for conditional check, instead use Switch Case statement.<br/>
B)Create atleast three Participants objects of array and then invoke static method to display the message.<br> ->[Internship result program](https://github.com/ishanjogalekar/Java-Programs/blob/main/8.TestResult.java)
9. Create a class person with datamembers like name,age, phno with methods getvalues and printvalues,<br/> 
I)store the class in a package called *pack1*.  
II)Define a class named student in subpackage *SubPack1* and *extend* the class defined as *person*.  
II)Use this class in a program of different package *Pack2*, create an **object** and invoke the methods defined in pack1 class file.<br> ->[subpackages in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/9.packages_subpackages.java)
10. Create a program to take input from user as 1/2/3, <br/>
i)If user enters 1, display info about Arithmetic Exception, <br/>
ii)If enters 2 and 3 for Null pointer exception and Array index out of bound exception, respectively. <br/>
Use: try, Catch block for each exception individually.<br> ->[Exceptions handling try-catch in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/10.ExceptionExamples.java)
11. Throw program example in Java. ->[Throw in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/11.Throwexample.java)
12. **Five events** -  E1, E2, E3, E4 and E5 are going to be organized for Rivera in VIT, <br/> 
Registration is open for all B.Tech students. With the *total strength of 1000 students*, <br/> 
Simulate the registration for each event by generating 1000 random numbers in the range of 1 – 5.(1 for event E1 like wise).<br/> 
I)Store the values in an array.  
II)Create six threads to equally share the task of counting the number of registration details for all the events.  
III)Use synchronized method or synchronized block to update the count variables. 
IV)The main thread should receive the final registration count for all events and display the list of students who have not registered in any event.<br> ->[Event handling using multi-threading in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/12.multithreadevent.java)
13. **Java Famous problem - Roti Problem** <br/>
In a family, Mom prepares roti for her children.Mom makes roti and stacks it up in a vessel, and Children eats from it. <br/>
I)The max capacity of the vessel is 10. <br/>
II)If roti empties, Children wait for mom to prepare new roti. <br/>
Develop a program for the given scenario using **inter thread communication concept** in Java programming.<br> ->[Roti problem in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/13.Rotiproblem.java)
14. Write your information *[as string as well as MyInfo Class object]* like regno, name, cgpa and phno into a file <br/>
a)Read from the file and print in the console. <br/> 
b)Use Serialization and Deserialization in the program. <br> ->[My Information using .txt files in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/14.MyInfo.java)
15. Traverse a file (.txt) and count the words **CSE1007** and **JAVA**, print the count of these words (Total count of "CSE1007" like this) in console.<br/>
*Note* - Also include other words in that file.<br> ->[Count words in .txt file in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/15.Count_word_in_file.java)  
16. **OddEvenTest** :- Checking number is *odd or even* using Java recursive approch & User defined methods. ->[Odd & Even no using users defined method](https://github.com/ishanjogalekar/Java-Programs/blob/main/16.OddEvenTest.java)
17. Maximum number in array using **User defined method** in Java. ->[Maximum number using user defined method](https://github.com/ishanjogalekar/Java-Programs/blob/main/17.Maxnumber_in_array.java)
18. Checking number is *strong* or not in Java <br/> 
**Note** - Strong number is a number whose sum of all digits’ factorial is equal to the number ‘n’. example : 145 = 1! + 4! + 5! <br> ->[Strong number](https://github.com/ishanjogalekar/Java-Programs/blob/main/18.Strong_num.java)
19. Make 2 **linked list** add numbers in it. print multiplication of corresponding index numbers in another linked list. ->[Multiplication in 2 linked lists](https://github.com/ishanjogalekar/Java-Programs/blob/main/19.Linked_list.java)
20. Java Program to add two integers but take integers **input as String**.Convert String to int *(without type conversion)* and add integers. ->[Add 2 integers as strings in Java](https://github.com/ishanjogalekar/Java-Programs/blob/main/20.String_Into_int.java)
21. Java Magic Number program. <br/>
Magic number is -> Consider an example ,  325 is a magic number because the sum of its digits (3+2+5) is 10, and again sum up the resultant (1+0), <br/>
we get a single digit (1) as the result. Hence, the number 325 is a magic number.**Some other magic numbers are 1234, 226, 10, 1, 37, 46, 55, 73, etc.** <br>
->[Magic number](https://github.com/ishanjogalekar/Java-Programs/blob/main/21.Magic_number.java) <br/>
22. Print missing alphabets in String. <br/>
Example: If "Ishan" is String then missing alphabets are : {b c d e f g j k l m o p q r t u v w x y z} consider only lower case. <br/>
->[Missing alphabets in string](https://github.com/ishanjogalekar/Java-Programs/blob/main/22.missing_alphabets.java) <br/>
23. Find largest digit in number. <br/>
Example: If number is "128" then largest digit is: 8  <br/>
->[Largest digit in number](https://github.com/ishanjogalekar/Java-Programs/blob/main/23.largest_digit_in_number.java) <br/>
24. Find smallest and largest digit in number using **Math Package**. <br/>
Example: If number is "128" then  smallest digit is : 1 and largest digit is: 8  <br/>
->[Smallest and Largest digit in number](https://github.com/ishanjogalekar/Java-Programs/blob/main/24.smallest_largest_digit.java) <br/>
25. Sort Hash-map using Tree-map with respective to keys in Hash-map.<br/>
->[Sort Hash-map](https://github.com/ishanjogalekar/Java-Programs/blob/main/25.sort_hashmap.java) <br/>
26. Given an array of integers nums containing n + 1 integers where each integer is in the range [1,n] inclusive.There is only one repeated number in nums, return this repeated number.
```
Input: nums = [1,3,4,2,2]
Output: 2
```
->[Find Duplicate Number](https://github.com/ishanjogalekar/Java-Programs/blob/main/26.%20Findduplicate.java) <br/>

27. Given number N and K ,  weird nucountmbers netween 1 to N. Weird number is number is not divisible by K and sum of digits is divisible by K.
```
Input:  N = 11 , K = 2
Output: 1
```
->[Weird-Number](https://github.com/ishanjogalekar/Java-Programs/blob/main/27.weird_num.java) <br/>

28. Find and remove third consonant in String from the end of string.
```
Input: String = asdfguihj
Output: g
```
->[Remove Consonant](https://github.com/ishanjogalekar/Java-Programs/blob/main/28.Remove_Third_Consonant.java) <br/>

29. Complementary DNA (**Codewars question**) - Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (String); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all.
```
Input: "ATTGC"
Output: "TAACG"

```
->[*Question link*](https://www.codewars.com/kata/554e4a2f232cdd87d9000038)
<br>
->[Complementary DNA](https://github.com/ishanjogalekar/Java-Programs/blob/main/29.DnaStrand.java)</br>

30. Find the next perfect square (**Codewars question**) - Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative. 
```
Input: 121
Output: 144
```
->[*Question link*](https://www.codewars.com/kata/56269eb78ad2e4ced1000013/java)
<br>
->[Next Square](https://github.com/ishanjogalekar/Java-Programs/blob/main/30.NumberFun.java)</br>
31. Get the Middle Character (**Codewars question**) - You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
```
Input: test
Output: es
```
->[*Question link*](https://www.codewars.com/kata/56747fd5cb988479af000028)
<br>
->[Middle char](https://github.com/ishanjogalekar/Java-Programs/blob/main/31.getMiddle.java)




---

## AES Cryptography:
AES cryptography using Java XML JAR. <br/>
AES is symmetric cryptography technique or algorithm
->[**AES Cryptography**](https://github.com/ishanjogalekar/Java-Programs/tree/main/AES_cryptography)
**Note** - Check AES_cryptography folder within main brach for project.

---

## Project :- SPA (Single Page Application)
[**SPA Project**](https://github.com/ishanjogalekar/Java-Programs/tree/main/SPA%20project)
<p>
<img alt="Spring" src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot" />
<img alt="Maven"  src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
<img alt ="Intellij Idea"src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
<img alt="MySql" src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
<img alt="HTML"  src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white" />
<img alt="CSS"   src="https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white" />
<img alt="Bootstrap" src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white" />
<img alt="FontAwesome" src="https://img.shields.io/badge/Font_Awesome-339AF0?style=for-the-badge&logo=fontawesome&logoColor=white"/>
 </p>

I) Spring Boot application using Maven. <br/>
II) *pom.xml* contains all dependencies. <br/>
III) Also used *MySql* as relation database. <br/>
IV) Devloped in *Intellij Idea* IDE. <br/>
**Note** - Check SPA folder within main brach for project.

---
