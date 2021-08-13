# Electricity-Billing-Management-System
# Table of Contents

1. [Demo](##_Demo)
2. [Description](##_Description)
3. [Objective And Aim](##-Objective_And_Aim)
4. [Sections](##-Sections)
5. [Java Classes](##-Java_Classes)
6. [Conclusion](##-Conclusion)
7. [License](##-License)
8. [Credits](##-Credits)
## Demo

Link:https://drive.google.com/file/d/1Tf_RBks2sIJYOblW6AD7ThA4gh8epWUu/view?usp=sharing


![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/Screenshot%20(3044).png)

## Description

Electricity Billing Management System is a Desktop based application developed using Java language with Net beans 12 IDE. The database used for for this project is MySQL.

👉Consumers and Admins can create his/her account.

👉It calculates the units of electricity consumed during the specified time and the amound to be paid for the consumption to the electricity department.



👉We can also update the consumers details through this aplication  

👉It also generate bill for a particular month.


## Objective and Aim 

Consumers can use this application for paying their electricity bill online very easily and comfortably.
It also make the overall billing system easy to access and effective for the users.


## Sections 

### 1. Login Page
         It consists of Username and Password which the existing consumer or admin can use to login into the main Dashboard
         of this application.
         Also new consumers and admins can make their new account by clicking the new user button. 

### 2. Menu
         4 Couumns:-
              1. New Customer:- Admin can create and add the account of a new consumer by filling the necessary details. 
              2. Customer Details:-it shows the customer details having Customer name,Meter number,Address,City,State,Email and 
                 Phone number.
              3. Deposit Details:-Here we can see and search the deposit details by selecting the meter number and 
                 month which includes meter number,month,units, total bill and Status.
              4. Calculate Bill:-Here the Admin can fill the number of units consumed by a particular consumer.
              
 ### 2. Utility                 
           1.Notepad 
           2.Calculator
           3.Web Browser
                
               Admin /Customer can use these options according to his/her requirement.
               
 ### 3. Information
           1.Update Information:-Consumers can update his/her details here.
           2.View Information  :-Consumers can View his/her details here.  
 
 ### 4.User 
           1.Pay Bill:-    Consumers can pay their bill for a particular month by using the Paytm Electricity Bill pay option.
           2.Bill Details:-Consumers can see their Bill details which include meter number, month,units ,total_bill and status.
           
 ### 5.Report
           Generate bill:- Consumers can generate the bill of any particular month here.
           
 ## Java Classes
 
 ### 1. Conn Class
           This class establishes a connection between NetBeans IDE and MySQL.It is done by adding
           MySQL_connector_java_8.0.26.jar file.
 
 ### 2. Login Class
           Here an existing customer/admin can login by entering his/her Username and Password.
       
![Development and Design](  https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/login.Screenshot%20(3032).png)
          
          If a users wants to create their account for the first time then they can click on new user button below.A new window
          will open which is create account window.Users can create their account by entering their Username,name
          password and meter_number.
            
![Development and Design]( https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/create%20account.Screenshot%20(3033).png)
 
 ### 3.Project Class[Main Dashboard]
          This class consists of different options in the header such as:-
               If login as an Admin        If login as a Customer
                  1.Menu                      1.Information
                  2.Utility                   2.user
                  3.Logout                    3.Report
                                              4.Utility
                                              5.Logout
                                              

          
                                      
![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/main%20dashboard.Screenshot%20(3069).png)

   ### 3.New Customer Class
          Here the admin can  add the details of a new customer.It has 7 textfields as follows:-
               1.Name
               2.Meter Number
               3.Address
               4.State
               5.City
               6.Email
               7.Phone Number


![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/New%20customerScreenshot%20(3035).png)

 ### 4.Customer Details Class
          The information taken from New Customer class is shown in this class in a tabular form. 

![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/customer%20details.Screenshot%20(3073).png)

### 5.calculate Bill Class
          Here the Admin can Calculate the bill of a customer by entering the amount of units the customer has consumed for a particular month.


![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/calculatebill.Screenshot%20(3074).png)

### 6.Generate Bill Class
          In this Class the final bill is generated.It has two choose fields namely Meter Number and Month.

![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/generatebill.Screenshot%20(3043).png)

### 7.Pay bill Class
          In this class the users can pay their bill using PAYTM pay bill application.

![Development and Design](https://github.com/Kunal-Kumar-Das191049/Electricity-Billing-Management-System/blob/master/paybill.Screenshot%20(3077).png)

## Conclusion
         This application can help the users to save their time and efforts by paying their electricity bill online
         rather than standing in long queues and waiting for their turn to arrive.
         
         Since it is a paperless mode of transaction so it is also environment friendly as well as clutter free for the customer.
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
