# Application Flow for Schedu v1.0


### User Sign up

1. Users cannot sign up. All users are given username and password from their employer.
1. They can change their password after the first time they log in.

### User Log In

1. User chooses Log in from the welcome page.
1. User enters username and password on form and submits.
1. If user is authenticated, the server will handle allowing access to edit
pages.  JDBCRealm used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### User Page after log in

1. Three options are given: My Availability, My Schedule, My Profile.
1. When user selects My Availability, the user chooses hours that they are avialable. And have the
option to set it as permanent or temporarly.
1. When user selects My Schedule, the user can see the latest schedule and up to 1 previous schedule.
1. When user selects My Profile, the user can only READ their information. EmployeeID, Name, Job Title, Store Location cannot be changed. User is allowed to change their password and username only.


### Admin Page after log in
1. Four options are given:  My Stores, My Employees, My Schedules and My Profile(same as user profile).
1. My Stores
        - List of all the stores with their hours of operation.
        - When admin clicks on the store. Admin can change hours of operation and shifts needed.
                                                            - Shifts needed. Admin can add shifts for each day.
                                                            for example "Bartender 10:00am - 03:00pm, Bartender 03:00pm - 11:00pm,
                                                            Server 03:00pm - 11:00pm".
1. My Employees
         - List of all employees.
         - When admin clicks on Employee Name
                 - Information about employee is presented. Admin can change EmployeeID, name, job title, store location
                   performance. (Performance is dropdown 1 to 5 stars, employees with higher stars will be shceduled first).
                   Admni can also change employees availability.
        - Create New Employee Button is available for admin to create new employees.
        
1. My Schedules
        - Shows the most current schedule.
        - Generate Schedule button is available. Admin must select week and click Generate Schedule.
        - Admin can edit schedule. Add/Remove shifts.
        - If admin schedules employee that is not available during scheduled time WARNING message appears, but admin has the option to "Add anyway".
        - Print Schedule button is available.
        - Copy Shcedule button is available.


### About

1. Information about the application and the developer.
1. Consider making contact info configurable.









