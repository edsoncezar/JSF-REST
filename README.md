# JSF-REST

Developing Your First Spring Boot Application a simple “Hello World!” web application that highlights some of Spring Boot’s key features. We use Maven to build this project, since most IDEs support it.

The spring.io web site contains many “Getting Started” guides that use Spring Boot. If you need to solve a specific problem, check there first.

You can shortcut the steps below by going to start.spring.io and choosing the "Web" starter from the dependencies searcher. Doing so generates a new project structure so that you can start coding right away. Check the Spring Initializr documentation for more details.

Before we begin, open a terminal and run the following commands to ensure that you have valid versions of Java and Maven installed:

$ java -version java version "1.8.0_102" Java(TM) SE Runtime Environment (build 1.8.0_102-b14) Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode) $ mvn -v Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00) Maven home: /usr/local/Cellar/maven/3.3.9/libexec Java version: 1.8.0_102, vendor: Oracle Corporation

Prerequisites for this project:

If you have Eclipse, download the STS plug-in from here https://marketplace.eclipse.org/content/spring-tools-aka-spring-ide-and-spring-tool-suite

If you don’t have Eclipse, download STS from here https://spring.io/guides/gs/sts/

Download the latest JDK from here http://www.oracle.com/technetwork/java/javase/downloads/index.html

Also for testing please download and install SOAPUI tool from here https://www.soapui.org/downloads/soapui.html

The first example I am going to explain is about HTTP GET request, second example will be about HTTP POST request, third example about HTTP PUT request and fourth example is for HTTP DELETE request. In these entire examples I am going to use JSON Representation.

Before checkout this project create a folder under C drive like C:\Projects

Used JBoss EAP 7.0

I chose a modular architecture for example only

Start the program http://localhost:8080/Rest-JSF-0.0.1-SNAPSHOT/
