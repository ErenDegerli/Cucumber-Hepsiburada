# Hepsiburada Test Case

This is the task prepared for Hepsiburada test case request. It includes the steps of visiting homepage, searching products, choosing a product from the list and checking the details of the specific one,
enterin the "Comments" tab, voting comments and getting the final thanks message. Please check the instruction below for running the script. 

## Running the tests

In order to run the test please use the code below on the command prompt

##### **Run mvn test -Dcucumber.options="classpath:features/"**

### Break down into end to end tests

Explain what these tests test and why
Cucumber is used in this case due to the easing mechanism of the approach itself. All the steps are created separately, dynamically and understandably.
In the StepDefs class, the plain language can be seen and each clause are applied one by one to make it easier to understand and maintain. 

```
 User should search for "{ProductName}"
```

### And coding style tests

There are OOP and POM principles are used in this coding. 

```
OOP can be seen with the PageBase, Base and TestBase classes
POM can be seen with the implementation of the webelements on their own specific webpages such as HomePage, ResultPage etc.
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Eren Can Degerli** - *Initial work*