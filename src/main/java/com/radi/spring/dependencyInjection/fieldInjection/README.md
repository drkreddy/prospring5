### OUTPUT
```Nov 30, 2018 11:15:40 AM org.springframework.context.support.AbstractApplicationContext prepareRefresh
   INFO: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5d099f62: startup date [Fri Nov 30 11:15:40 IST 2018]; root of context hierarchy
   Nov 30, 2018 11:15:41 AM org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor <init>
   INFO: JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
   Message from provider: Value at field message
```

### In this example: 

- OracleBeanConfig: -@ComponentScan("com.radi.spring.dependencyInjection.fieldInjection") tells spring to look for where the beans can be found

- Autowired at field level in OracleMessageReader.provider

- @Value annotation is is used to pass values at field level. MessageProviderImpl.message

### Field Injection
 - Adds dependency on Springframework and can not be instantiated independently.
 - Difficult for tests as dependencies has to be injected manually.

    #### Reading values from config
    
    - MessageConfig  of type @Component("messageConfig") holds the all configuration values.
    - in MessageProviderImpl use @Value("#{messageConfig.message}") to inject values from config.
    

    
    
 