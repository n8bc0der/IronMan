# IronMan
Simple Social Network App Hands On
API: Spring( core, jdbc, mvc, security, boot), hibernate, servlet, jsp.
Build tool: Maven
Server: Tomcat
DB: MySql 
1. Brief Description - IronManSocial is a basic Maven based project with sub-modules for Integration,Core,Views,Common.
   Parent project  : ironManSocial  -> has the main pom defined with submodules.
   Submodules:
   Integration module: for persistence layer
   Core module: for business logic
   Views module: for views and controllers
   Common module: for common services and utilities.
   
   Interdependence of modules:
   View <- Core <- Integration
  
2. Relevant update - changed the Maven Project to Multi-Module Maven Project 

3. MySQL version - 8.0.19
4. Hibernate version - 5.4.12.Final
5. Maven details 
    - parent pom project has deps to be shared among all modules.
    - packaging of all except Views ( dynamic web module) is of type JAR
6. Tomcat version - 8

