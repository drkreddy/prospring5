### OUTPUT
```Nov 30, 2018 12:03:54 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
   INFO: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5d099f62: startup date [Fri Nov 30 12:03:54 IST 2018]; root of context hierarchy
   Nov 30, 2018 12:03:54 PM org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor <init>
   INFO: JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
   printing namess
   Ravia
   Raaj
   Printing correctNames
   Ravi
   Raj
   Printing AutowiredNames with qualifier overried
   Ravia
   Raaj

```
### Collections Injection


- BeanConfig: -@ComponentScan("com.radi.spring.dependencyInjection.InjectingCollections") tells spring to look for where the beans can be found

- BeanConfig , names() and names() method creates Beans of type List and provide to container.

- @Resource("names") is preferred for injection collections.

- @Autowired with @Qualifier("names") injects names list to the property.

- @Autowired without @Qualifier uses property name for injection.

    
    
 