# Holiday Extras API Project

This is the project for the Web Development API Task for holidayextras. The project has been built using Spring Boot and using a "micro services" architecture. The other services are required to build this App, these are listed in the prerequisites. The App has an in memory JPA Database, which is used for the API testing.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. This project is deployed on an AWS instance here:

* [AWS - Swagger UI](http://www.jamesknights.co.uk/holiday-extras-api/swagger-ui.html)

* Download/Clone the Services in the Prerequisites

Use your IDE (Netbeans I recommend), build the microservices in this order: 

```
common-java
common-event
common-model
common-service
common-utility
common-password
common-user
application
```

The App is packaged as a WAR file, so it can be run on a Tomcat container. 

### Prerequisites

For the App to run, you will need to Download/Clone these services

* Download/Clone the App Services
** common-event
** common-java
** common-model
** common-services
** common-password
** common-user
** common-utility


## Testing

Each Service has JUnit tests which are run on build, swagger is used for the testing of the API - you can visit that here on the AWS instance: 

### AWS Hosted App

* [AWS - Swagger UI](http://www.jamesknights.co.uk/holiday-extras-api/swagger-ui.html)


```
Within the API are these particular methods: 

* /createUser - POST [Creates Users - within Swagger UI the parameters are prepopulated for ease of testing] - Returns User Object
* /findUser - GET [Finds users from their uId (User Identification)] - Returns User Object
* /updateUser - POST [this accepts JSON of the information you wish to change, which are: "emailAddress", "forename", "lastname" - an example would be {"emailAddress" : "new@email.com"}] - Returns Boolean
* /deleteUser - POST [Deletes a user from their uId] - Returns Boolean
* /login - POST [Logins in a user, using from their email address and their password] - Returns User Object
* 

## Deployment

Deployment has already been done on AWS - however, this project is packaged as a War. If you need to change this, you'll need to change Application.java in application to the standard Spring Boot

## Built With

* [Swagger](https://swagger.io/) - API Tooling
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](https://projects.spring.io/spring-boot/) - For the Application

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
