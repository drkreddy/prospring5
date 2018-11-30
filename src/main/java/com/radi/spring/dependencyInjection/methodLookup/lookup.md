### OUTPUT
```Nov 30, 2018 12:55:30 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
   INFO: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5d099f62: startup date [Fri Nov 30 12:55:30 IST 2018]; root of context hierarchy
   Nov 30, 2018 12:55:30 PM org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor <init>
   INFO: JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
   abstractLookupBean: Singer Instances the Same? false
   com.radi.spring.dependencyInjection.methodLookup.Singer@400cff1a
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@275710fc
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@525f1e4e
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@75f9eccc
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@52aa2946
   I am sining song
   100000 gets took 1 ms
   standardLookupBean: Singer Instances the Same? true
   com.radi.spring.dependencyInjection.methodLookup.Singer@5d47c63f
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5d47c63f
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5d47c63f
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5d47c63f
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5d47c63f
   I am sining song
   100000 gets took 1 ms
   singletonLookupBean: Singer Instances the Same? true
   com.radi.spring.dependencyInjection.methodLookup.Singer@5ea434c8
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5ea434c8
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5ea434c8
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5ea434c8
   I am sining song
   com.radi.spring.dependencyInjection.methodLookup.Singer@5ea434c8
   I am sining song
   100000 gets took 1 ms
   Nov 30, 2018 12:55:30 PM org.springframework.context.support.AbstractApplicationContext doClose
   INFO: Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5d099f62: startup date [Fri Nov 30 12:55:30 IST 2018]; root of context hierarchy
```

### Method Lookup

- Beans are by default singleton. if Singleton wants to have dependency on prototype bean LOOKUP should be used.
- @Lookup will call beanfactory.getBean() and returns new been when ever invoked.
- Dependent bean should be declared with @Scope of prototype
- If @Lookup not used bean holds reference to prototype dependent bean and as this is single ton and uses the same dependency rather than creating new dependent bean every time.
 
- IF you examine output listed above, all the references of singer are different when Lookup is used 

- Since singer has *@Scope("prototype")* , Every bean which uses will be given new instance in the example we can see singletonLookupBean and  standardLookupBean having Singer beans with different hashs'