# employee-portal
<b>Employee Portal</b>

The is an application with basic features like :
1. Retrieving and viewing a list of employees.
2. Sorting by salary, name, hiredate
4. Filtering of employee records.
3. Viewing any single employee in detail.

Some assumptions/notes about the design/code
1. Since data was small and less attributes were there about Employee so instead of making another hit to get employee detail
used stored data in employee list and shown in same table only.
2. For the cases having more employee details , methods are already written there on UI and backend side just not called currently.
Those can be called and details can be shown in a popup or new section too.
3. For features like sorting, filering, pagination currently used angular mat table features as data was small for UI operations.
as per requirement we can have these things configured in our APIs using Spring-data-JPA methods

This repository contains following :
1. employee-portal-api (Spring boot rest api)
2. employee-portal-ui (Angular 6 UI app)
3. Planning docs (Class diagram , sequence diagram , API doc generated via swagger)
4. Screen Designs (Screenshot of working app with all features)

Tech-stack :

UI
A single-page-application based on Angular 6.

API
RESTful API using Java-Spring, Spring boot.
Used in memory DB H2 config via spring boot to store employee data.

<b>How to use/test the code?</b>

<b>Getting Started</b>

<b>Pre Requisites</b>
jdk1.8.0
angular CLI 6
maven

<b>To Test</b>
1. Go to employee-portal-api/RUN_API.bat and wait for it to build and deploy API
2. You can test API is working via http://localhost:9090/employees
3. You can see API docs via http://localhost:9090/swagger-ui.html
3. Go to employee-portal-ui/RUN_UI.bat and wait for it to build and deploy UI application
4. http://localhost:4200/
5. You will see the app running.

<b>To Use</b>
1. You can import api project as an existing maven app in eclipse
2. You can open ui project in ide like visual studio code 

### Design

* Screen Designs
 * [Employees List](ScreenDesigns/EmployeesList.png)
 * [Employees List Sorted By Hire Date](ScreenDesigns/EmployeesListSortedByHireDate.png)
 * [Employees List Sorted By Salary](ScreenDesigns/EmployeesListSortedBySalary.png)
 * [Employee List Sort By Name](ScreenDesigns/EmployeeListSortByName.png)
 * [Employee List Filtered](ScreenDesigns/EmployeeListFiltered.png)
 * [Employee Detail](ScreenDesigns/EmployeeDetail.png)

### Project Planning docs

* [Class Diagram](PlanningDocs/Class-Diagram.jpg)
* [Sequence Diagram](PlanningDocs/Sequence-Diagram.png)

For any questions/comments feel free to reach me at <b>rohitforambition@gmail.com</b>
<b>Author</b>
Rohit Saxena.
