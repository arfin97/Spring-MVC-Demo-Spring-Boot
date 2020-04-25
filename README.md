# Spring-MVC-Demo-Spring-Boot
## Video: https://www.youtube.com/watch?v=hPFpTdmE2zk
## TomCat Download: https://tomcat.apache.org/download-90.cgi

# Configuration: 
## Module 1: External Tomcat Configuration.

1. Download external Tomcat server.
2. Configure Application Server of InilliJ and add the external Tomcat to the IDE.
3. Download a spring boot project with web dependencey.
4. Edit the configuration file
a. Packaging to WAR
b. Add tom-cat starter dependency with scope
5. Edit the build configuration and add the external tomcat and war file artifact to build the project.
6. Run the project. If you see the default error page you have successfully configured the external tomcat. 

## Module 2: JSP page configuration.
1. Add inside main directory the folders: webapp,  WEB-INF,  JSP,  greetings.jsp
2. Add the folder prefix and suffix properties into the application.properties file.
3. Extend the application main class to SpringBootServletIntilizer.
4. Add a controller to show the greetings.jsp file.
5. If you successfully see the jsp file. You have file
