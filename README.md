# Schedu v1.0 (Schedule Generator)
 Schedule Generator based on availability, store hours and shifts needed.

[Demo](http://13.59.240.180:8080/Schedu/): Login as Manager:	Username: admin
	  					Password: admin
### Problem Statement 
It is hard to believe that in 2017 there are workplaces that still use Excel for creating their schedules. There are few alternative softwares on the market, but most ScheduleGenerators are part of a bigger software package that a company must purchase in order to use just this one function. Schedule Generator will do exactly that, focus on creating employee schedules based on their availability.

Shedu  will automatically generate schedules each week, based on store hours, shifts needed, and employee availability.

### Project Technologies/Techniques 

* Security/Authentication
  * Admin role: create/read/update/delete data, generate schedules
  * User role: submit schedule availability, View schedule
  * All: Do nothing. Login required
* Database (MySQL and Hibernate)
  * Store users and roles
  * Store schedule information
* Web Services or APIs used - Google Calendar
*  AML - Amazon Machine Learning Services (independent research topic)
* Logging
  * Configurable logging using Log4J. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Site and database hosted on AWS
* Unit Testing
  * JUnit tests to achieve 80% code coverage
  
  ### Design
  
  * [Application Flow](applicationFlow.md)
  * [Screen Design](Skedu.rp)
  * Database Design
  
  ### [Time Log](TimeLog.md) 
  ### [Project Plan](ProjectPlan.md) 
  
