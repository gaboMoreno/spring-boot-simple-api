# spring-boot-simple-api

Simple CRUD api of students made with spring boot

## Step to execute 

1. Install Java 8+ on your machine: https://www.java.com/es/download/
2. Install gradle: https://gradle.org/install/
3. From the terminal or cmd, run the following command: 

Windows:
```shell
  C:\Users\userX\testX\spring-boot-simple-api> gradlew bootRun
```
Linux/MacOS:
```shell Linux
  foo@bar:~$ gradlew bootRun
```


## Avaliable Endpoints


### Add a student

- __HTTP verb__: POST
- __URL__: http://\<host>:\<port>/student
- __Params__:  A json object with the following format:
    ```Typescript
       {  
        "id": number,  
        "name": string,  
        "lastName": string,  
        "address": string,
        "phone": string,
        "email": string 
      }   
    ```
- __Success Response__: It returns the same json object that was sent.
- __Request Example__: 

```shell
  foo@bar:~$ curl --location --request POST 'http://localhost:9000/student' --header 'Content-Type: application/json' --data-raw '   {
        "id": 2,
        "name": "Harry",
        "lastName": "Potter",
        "address": "Heredia",
        "phone": "12345678",
        "email": "test@magic.com"
    }   '
    {"id":2,"name":"Harry","lastName":"Potter","address":"Heredia","phone":"12345678","email":"test@magic.com"}   
```




