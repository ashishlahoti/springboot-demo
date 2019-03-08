# springboot-demo
SpringBoot Demo

1. Database password encryption in application.properties / application.yml
If you want to configure encrypted password in the application.properties or application.yml file then you need to configure DataSource bean by yourself. See __[PersistenceConfig.java](./src/main/java/com/abc/demo/config/PersistenceConfig.java)__. where you can decrypt the password using your own implemention and configure custom DataSource bean. 
