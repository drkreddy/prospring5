#### Bean Naming with Annotation Configurations
- If not specified anything in @Component  , className with first character to lowercase is used.
- If @Component(“nameO”) is used nameO is used for bean name.
- If @Bean(name={“name1”,”name2”,”name3”} used in @Configuration class, then first name1 will become id  and rest of the names become alias.
- To get alias’s for a bean used : _context.getAliases(bean.getKey()) from Map<String, Simple> beans= context.getBeansOfType(Simple.class);_

### output
```d: ac
 aliases: [def, simple4, simple2, simple1]
 ```
 