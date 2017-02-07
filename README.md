# AWS Lambda Function in Java
AWS Lambda lets you run code without provisioning or managing servers. You pay only for the compute time you consume - there is no charge when your code is not running. With Lambda, you can run code for virtually any type of application or backend service - all with zero administration. Just upload your code and Lambda takes care of everything required to run and scale your code with high availability. You can set up your code to automatically trigger from other AWS services or call it directly from any web or mobile app.

# Read More about Lambda functions
[AWS Lambda Getting Started](https://docs.aws.amazon.com/lambda/latest/dg/getting-started.html)
[AWS Lambda Deployment](https://docs.aws.amazon.com/lambda/latest/dg/create-deployment-pkg-zip-java.html)
[AWS Java SDK](https://aws.amazon.com/sdk-for-java/)

# Starter Package Structure
```bash
.
├── README.md
├── build.gradle
├── event
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com.mydomain
    │   │       ├── LambdaHandler.java
    │   │       └── model
    │   │           ├── ServerlessRequest.java
    │   │           └── ServerlessResponse.java
    │   └── resources
    │       └── application.properties
    └── test
        ├── java
        ├── mock
        │   └── event
        │       └── api-gateway-event.json
        └── resources

```
LambdaHandler.java: is contains the AWS Lambda Handler Function.
ServerlessRequest.java: AWS Lambda Request Object
ServerlessResponse.java: AWS Lambda Response Object
api-gateway-event.json: A sample Lambda Event from Amazon API Gateway 

# Building Your first AWS Lambda Deployment Package

Use Gradle build / deployment management tool, in order to build your package:
```bash
# Checkout this code
git clone https://github.com/rezamt/aws-lambda-java-starter.git

# Building Lambda Zip file
gradle build

# Deployment package (will be deployed to AWS)
ls -rtl ./build/lib/aws-lambda-java-starter-1.0-SNAPSHOT.jar

```
# Deployment to AWS
In this Getting Started section, you do the following:

Set up an AWS account and AWS Command Line Interface (AWS CLI). Most tutorials use the AWS CLI commands.
Create and test a simple Hello World Lambda function.
To get started, complete the steps in the following topics:

Step 1: [Set Up an AWS Account and the AWS CLI](https://docs.aws.amazon.com/lambda/latest/dg/setup.html)
Step 2: [Create a HelloWorld Lambda Function and Explore the Console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html)
Step 3: [Create a Simple Microservice using Lambda and API Gateway](https://docs.aws.amazon.com/lambda/latest/dg/with-on-demand-https-example-configure-event-source_1.html)

# AWS Managed Services Integrated IDE (Eclipse)
This section desribes how to install or upgrade the AWS Toolkit for Eclipse.
[Readmore](https://docs.aws.amazon.com/toolkit-for-eclipse/v1/user-guide/setup-install.html)

Note: If you are IntelliJ Expert, you just need to checkout project in you IntelliJ Smart IDEA.

# Additional Notes
This function is designed to handle AWS API Gateway Events, you can change the Lamabda handler implementation for S3 Events, etc.
