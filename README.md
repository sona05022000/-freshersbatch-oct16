# Employee-Management-System
# Table of Contents

1. [Demo](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/README.md#demo)
2. [Description](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/README.md#description)
3. [Objective And Aim](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/README.md#objective-and-aim)
4. [Sections](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/README.md#sections)
5. [Java Classes](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System#java-classes)
6. [Conclusion](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System#conclusion)
7. [License](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/README.md#license)
8. [Credits](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/README.md#credits)
## Demo

Link:https://drive.google.com/file/d/1Tf_RBks2sIJYOblW6AD7ThA4gh8epWUu/view?usp=sharing


![Development and Design](https://github.com/Kunal-Kumar-Das191049/Employee-Management-System/blob/master/demo.png)

## Description

Employee Management System is a Desktop based application developed using Java language with Net beans 12 IDE.The concept used is swing and database used for for this project is MySQL.

👉Admins can ADD details of employees.

👉Admins can VIEW the details of any employee by using the Employee ID of that particular employee.



👉It can also UPDATE details of any employee.

👉Admin can also PRINT details/records of any employee.

👉Admin can REMOVE details/records of any employee by using Employee ID of that particular employee.


## Objective and Aim 

Organizations can use this Application for maintaining the records of employees rather than using using pen,paper and registers. It is very EASY to handle and EFFECTIVE for any organization to keep and maintain the records/details of Employees by using this Desktop based application.   


## Sections 

### 1. Login Page
         It consists of Username and Password which the existing admin can use to login into
         the main Dashboard of this application.
         
         

### 2. Employee Details
        It Consists of 4 Columns:-
              1. Add 
                 
              2. View
                 
              3. Remove
               
              4. Update
                
              
 ### 2. Add Employee                
            Admin can add details of a new employee by filling the 
            necessary details like:-
            Name              Job Post          Phone
            Address           Employee ID       Education
            Age               Father's name     Aadhar No
            Email ID          Date Of Birth 
                       
 ### 3. View
            It consists of Employee ID which the admin can enter to view details of a particular employee in the Print window.
 
 ### 4.Remove
            Here the Admin can remove records of any Employee by entering their Employee ID.
           
 ### 5.Update
            Here the Admin can Update the details of any Employee by entering the Employee ID in the Search Window.
       
 ## Java Classes
 
 ### 1. Conn Class
           This class establishes a connection between NetBeans IDE and MySQL.It is done by adding
           MySQL_connector_java_8.0.26.jar file.
 ### 2. Front_Page Class
           It is the first window/page of this application consists of a blink string
           "EMPLOYEE MANAGEMENT SYSTEM" and one button i.e"CLICK HERE TO CONTINUE".
 ![Development and Design](https://github.com/Kunal-Kumar-Das191049/Employee-Management-System/blob/master/Front%20page.png)
 ### 3. Login Class
            It consists of Username and Password which the existing admin can use to login into
            the main Dashboard of this application.
            
            Username and Password can be changed in the database.
         
       
![Development and Design](https://github.com/Kunal-Kumar-Das191049/Employee-Management-System/blob/master/login.png)
 
 ### 3.Details Class[Main Dashboard]
          This class consists of different options in the header such as:-
                  
                  1.Add                   
                  2.View                   
                  3.Remove                    
                  4.Update                           
                                       
                                              

          
                                      
![Development and Design](https://github.com/Kunal-Kumar-Das191049/Employee-Management-System/blob/master/Main%20Dashboard.png)

   ### 3.Add_Employee Class
          Here the admin can  add the details of a new customer.It has 11 textfields as follows:-
               1.Name                    8.Date of Birth
               2.Address                 9.Phone
               3.Age                     10.Education
               4.Email ID                11.Aadhar No
               5.Job Post
               6.Employee ID
               7.Father's name


![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/New%20customerScreenshot%20(3035).png)

 ### 4.Customer Details Class
          The information taken from New Customer class is shown in this class in a tabular form. 

![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/customer%20details.Screenshot%20(3073).png)

### 5.calculate Bill Class
          Here the Admin can Calculate the bill of a customer by entering the amount of units the customer 
          has consumed for a particular month.


![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/calculatebill.Screenshot%20(3074).png)

### 6.Generate Bill Class
          In this Class the final bill is generated.It has two choose fields namely Meter Number and Month.

![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/generatebill.Screenshot%20(3043).png)

### 7.Pay bill Class
          In this class the users can pay their bill using PAYTM pay bill application.

![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/paybill.Screenshot%20(3077).png)

## Conclusion
         This application can help the users to save their time and efforts by paying their electricity
         bill online  rather than standing in long queues and waiting for their turn to arrive.
   
         
         Since it is a paperless mode of transaction so it is also environment friendly as well as clutter
         free for the customer.
## License
   ### MIT LICENSE
link:https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/LICENSE
        
        MIT License

Copyright (c) 2021 Kunal Kumar Das

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

## Credits
   * Google Images Download.
   * Net Beans IDE
   * MY SQL
        
        This project Wouldn't have been possible without these tools.It Saved my enormous  amount of time while collecting the data. 
