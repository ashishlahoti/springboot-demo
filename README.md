# springboot-demo
This springboot demo project is using jpa and web modules of spring boot to interact with database and exposing REST endpoints for distribution. It is using some userful libraries which works very well with springboot and makes your development easy.

1. Database password encryption in application.properties / application.yml
If you want to configure encrypted password in the application.properties or application.yml file then you need to configure DataSource bean by yourself. See __[PersistenceConfig.java](./src/main/java/com/abc/demo/config/PersistenceConfig.java)__. where you can decrypt the password using your own implemention and configure custom DataSource bean. 

2. Using Lombok library is very userful which auto generates getter/setter and implements toString() and hashCode() methods of your model libraries at compile time. It keeps the model classes neat and clean. See the usage of @Data annotation in entity __[User.java](./src/main/java/com/abc/demo/dao/entity/User.java)__ and model classes.

3. Using Swagger library is very useful if you are creating REST endpoint. You can visualize and execute api from following url
http://localhost:8080/swagger-ui.html

4. Mapstruct library is one of the best model-mapping library available in the market based on performance. It is useful to auto generate model mapping (e.g. DTO to entity, entity to DTO) classes at compile time and keeps your source code neat and clean. See how @Mapper(componentModel="spring") annotation is being usage in __[UserModelMapper.java](./src/main/java/com/abc/demo/model/mapper/UserModelMapper.java)__ which generates UserModelMapperImpl.class file at compile time and also create a bean with name userModelMapper. Later this model mapper dependency is injected in __[UserServiceImpl.java](./src/main/java/com/abc/demo/service/UserServiceImpl.java)__ using @Autowired annotation for model-mapping.
