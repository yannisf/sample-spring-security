sample-spring-security
======================
This is a sample application that integrates Spring Security, REST controllers and AngularJS. 

Spring Security uses namespace configuration, form authentication with a local user detail service. 

The application includes an unsecured landing page, a login form and a secured AngulaJS single page application
under the secure folder. The application provides two controls, a **View** and and **Edit** button that send a GET
and a POST request to a REST resource. **View** requires *ROLE_USER* while **Edit** requires *ROLE_ADMIN*. 

You will notice that the **Edit** control is not available to *ROLE_USER*. It is actually hidden. One may choose to 
unhide it (e.g. using Firebug) and press it. You will notice then that request will be sent to the server but the 
server will reply with access denied.

Requirements
------------
* Java 8
* Maven 3

Start the application
---------------------
The application may be run using the Maven Tomcat plugin like so:
~~mvn clean package tomcat7:run~~
