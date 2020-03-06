![AppVersion-version](https://img.shields.io/badge/AppVersion-1.0.0-brightgreen.svg?style=flat)
![GitHub contributors](https://img.shields.io/github/contributors/ashishlahoti/springboot-demo)
![GitHub last commit](https://img.shields.io/github/last-commit/ashishlahoti/springboot-demo)
![GitHub Release Date](https://img.shields.io/github/release-date/ashishlahoti/springboot-demo)
![GitHub All Releases](https://img.shields.io/github/downloads/ashishlahoti/springboot-demo/total)

# Spring Boot Starter
This springboot starter project is using jpa and web modules of spring boot to interact with database and exposing REST endpoints for distribution. It is using some userful libraries which works very well with springboot and makes your development easy.

### Database Encyption
Database password encryption in application.properties / application.yml
If you want to configure encrypted password in the application.properties or application.yml file then you need to configure DataSource bean by yourself. See **[PersistenceConfig.java](./src/main/java/com/abc/demo/config/PersistenceConfig.java)**. where you can decrypt the password using your own implemention and configure custom DataSource bean.
   
### Lombok
Using Lombok library is very userful which auto generates getter/setter and implements toString() and hashCode() methods of your model libraries at compile time. It keeps the model classes neat and clean. See the usage of @Data annotation in entity **[User.java](./src/main/java/com/abc/demo/dao/entity/User.java)** and model classes.
>You need to install lombok plugin in IDE tool. For eclipse download the [lombok.jar](https://projectlombok.org/download) 
From terminal execute the jar
```
$ java -jar lombok.jar
```

### Swagger
Using Swagger library is very useful if you are creating REST endpoints. It generates a GUI for you to execute GET, POST, PUT, DELETE HTTP endpoints. Isn't that cool. GUI is accessible using following URL:- http://localhost:8080/swagger-ui.html

### Mapstruct
Mapstruct library is one of the best model-mapping library available in the market based on performance. It is useful to auto generate model mapping (e.g. DTO to entity, entity to DTO) classes at compile time and keeps your source code neat and clean. See how @Mapper(componentModel="spring") annotation is being usage in **[UserModelMapper.java](./src/main/java/com/abc/demo/model/mapper/UserModelMapper.java)** which generates UserModelMapperImpl.class file at compile time and also create a bean with name userModelMapper. Later this model mapper dependency is injected in **[UserServiceImpl.java](./src/main/java/com/abc/demo/service/UserServiceImpl.java)** using @Autowired annotation for model-mapping.
