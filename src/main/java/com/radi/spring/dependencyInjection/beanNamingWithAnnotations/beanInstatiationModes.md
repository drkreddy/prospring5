### Bean Instantiation Modes:
##### Singleton:-
  - Shared Object with no state.
  - Shared Object with read-only state.
  - Shared Object with shared state.
  - High-throughput  objects with writable state.
##### Prototype:-
  - Objects with writable state.
  - Objects with private state.

##### Bean Scopes:-
 1) Singleton:  (default)
 2) Prototype:
 3) Request:  ( create for each http request and destroyed when request completes)
 4) Session: beans with session scope will be instantiated for every HTTP session and then destroyed when the session is over
 5) Thread
 6) Custom
 Custom bean scope that can be created by implementing the interface org.springframework.beans.factory.config.Scope and registering the custom scope in Spring’s configuration (for XML, use the class org.springframework.beans.factory.config.CustomScopeConfigurer).

