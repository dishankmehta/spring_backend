## spring_backend
Basic Spring Boot backend

Open the project in your favorable IDE and run the DemoApplication.java class to start the spring boot initialization. 
All the API calls are on the url: http://localhost:8080/screen which is the base url for the requests.

For the database transaction purposes JdbcTemplate is used and hence the database used is MySQL database of WAMP Server's
phpmyadmin database. The database schema is as follows and all the sql statements are also included for the ease of use.

All the attributes in the database should match the exact names mentioned here since the AppConfig file in the com.example.demo
package uses them to initialize the spring data source.

Database Name: screentest

Table Name: screen
Fields:     id -----> INT (20)
            screenTitle ------> VARCHAR (30)
            screenData ------> VARCHAR (50)
            
Query: CREATE TABLE screen (id INT(20), screenTitle VARCHAR(30), screenData VARCHAR(50));

Insert data query: INSERT INTO `screen`(`id`, `screenTitle`, `screenData`) Values (1, "Screen 1", "Screen 1 Data");
                   INSERT INTO `screen`(`id`, `screenTitle`, `screenData`) Values (2, "Screen 2", "Screen 2 Data");
                   INSERT INTO `screen`(`id`, `screenTitle`, `screenData`) Values (3, "Screen 3", "Screen 3 Data");

Make sure that the wamp server is running while making the requests otherwise you will encounter errors.
