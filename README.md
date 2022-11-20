# SnailsortAPI
SnailsortAPI for BNP Paribas Fortis

Welcome,

this app is a Snail Sort exercise implemented with spring-boot mvc and hosted on github.
There is the link to Git Lab repository : 

To compile and run this code :
1) Fork and clone the project and open it with your IDE
2) Open a terminal in the root directory of the project
3) Then run this command : mvn spring-boot:run

Notes : For the POST method /createObject, the Data structure of the body is 
                                                             -> sample { "id" : "1", 
                                                                         "tabTort" : "[1,2,3,4,5,6,7,8,9]", 
                                                                         "tortTab" : "[[1,2,3],[4,5,6],[7,8,9]]" }
