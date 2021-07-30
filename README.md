# **Introduction**

Cucumber BDD framework to test the NAB home loan enquiry.The framework is designed with data driven to source different sets of test data and Cucumber BDD for Reporting.

# **Demo**

https://youtu.be/ViCULIUF3fU

# **Requirements**

- Download and Install Java : https://www.java.com/download/ie_manual.jsp
- Download Apache Maven : https://maven.apache.org/download.cgi 
- Download and Install IDE of your choice
- Browser driver - Chrome driver exe : https://chromedriver.chromium.org/downloads
(make sure you have your desired browser driver and class path is your user dir folder where your POM file is.
- Eclipse Plugins for Maven & Cucumber

# **Features**

- Page Object Design Pattern with Selenium PageFactory in Cucumber
- Use of Data Driven Testing in Cucumber using Scenario Outline
- Use of Hooks
- State context sharing between different step definition files and different scenarios
- Reports

# **Used tools and framework**
- Selenium
- Maven repository
- Cucumber-BDD

# **Execution**

1. Maven build

 "mvn clean install" or "mvn clean install -U" will execute tests by default and cucumber BDD report can be found under "projectdir\report\index.html"
 
2. Using IDE

Right click on the TestRunner.java under src\test\java\Runner package and run as JUnit Test

![image](https://user-images.githubusercontent.com/68452571/127596583-2d819ab7-7f34-455c-a9b6-6b56b02733f2.png)

