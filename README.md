## spring-reigstration
# Login Registration Backend Project
- This is personal practice project.
- 
#Included with
 - Spring Boot
 - Spring Security
 - Java Mail
 - Email verification with expiry
 - Spring Boot
 
 #CURL
```sh
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": <first name>,
    "lastName": <last name>,
    "email": <email>,
    "password": <password>
}'
```
