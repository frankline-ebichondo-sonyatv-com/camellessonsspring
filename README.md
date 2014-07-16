camellessonsspring
==================

The camellessons exercise in spring

So apparently:

1. You can configure the routes with only the spring-dsl and eliminate the need for the instead of having a simpleroutebuilder

2. Configure  activeMQ in the xml instead of configuring it in the main class

3. Any bean can be a processor, you only need to specify the class and the method to do your processing : Not proven

This list is by no means final

Running
-------
1. Install mvn and git and obtain the code
2. Make sure activemq is running
3. run mvn clean install camel:run
