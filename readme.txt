PREREQUISITES

- software    design patterns ( https://en.wikipedia.org/wiki/Software_design_pattern )
- PROXY       design pattern  ( https://en.wikipedia.org/wiki/Proxy_pattern ) ( https://stackoverflow.com/questions/350404/how-do-the-proxy-decorator-adapter-and-bridge-patterns-differ )
- FACTORY     design pattern  ( https://en.wikipedia.org/wiki/Factory_method_pattern )
- SINGLETON   design pattern  ( https://en.wikipedia.org/wiki/Singleton_pattern )
- PROTOTYPE   design pattern  ( https://en.wikipedia.org/wiki/Prototype_pattern )
- FACADE      design pattern  ( https://en.wikipedia.org/wiki/Facade_pattern )
- THREAD POOL design pattern  ( https://en.wikipedia.org/wiki/Thread_pool )
- OBSERVER    design pattern  ( https://en.wikipedia.org/wiki/Observer_pattern )

- Java Reflection

- java.lang.ThreadLocal
- java.lang.reflect.Proxy ( for old school interface-implementation approach )

- Javassist ( http://www.javassist.org/ )
- CGLib ( https://github.com/cglib/cglib )

1. A BEAN CONTAINER ACTS AS A REPOSITORY OF BEANS

see package beans.names

a bean lookup can be performed using a bean predefined name
a bean lookup can be performed using a bean default provided name/names
a bean lookup can be performed using a bean class
a bean lookup can be performed using a bean parent class
a bean lookup can fail if multiple bean types qualify as result, for further search refinement qualifiers are required

2. A BEAN CONTAINER OFFERS [OUT OF THE BOX]/[PREDEFINED] BEAN TYPES

examples
- EJB javax.ejb.Stateless
- EJB javax.ejb.Stateful
- EJB javax.ejb.Singleton
- EJB javax.ejb MessageDriven
- Spring org.springframework.stereotype.Component
- Spring org.springframework.context.annotation.Scope
- Spring org.springframework.stereotype.Service
- Spring org.springframework.stereotype.Repository
- Spring org.springframework.stereotype.Controller
- Spring org.springframework.web.context.annotation.RequestScope
- Spring org.springframework.web.context.annotation.SessionScope
- Spring org.springframework.web.context.annotation.ApplicationScope
- CDI javax.enterprise.context.RequestScoped
- CDI javax.enterprise.context.SessionScoped
- CDI javax.enterprise.context.ApplicationScoped
- CDI javax.enterprise.context.ConversationScoped
- CDI javax.enterprise.context.Dependent
- see many others

see package beans.scopes.prototype
see package beans.scopes.singleton

3. A BEAN CONTAINER OFFERS LIFECYCLE CONTROLLING METHODS

examples
- javax.annotation.PostConstruct
- javax.annotation.PreDestroy
- javax.ejb.Startup
- org.springframework.context.annotation.Lazy

see package beans.lifecycle.prototype
see package beans.lifecycle.singleton

4. A BEAN CONTAINER OFFERS FACTORY DESIGN PATTERN SUPPORT

examples
- Spring org.springframework.context.annotation.Configuration
- Spring org.springframework.context.annotation.Bean
- CDI javax.enterprise.inject.Produces
- CDI javax.enterprise.inject.New

see package beans.factories.configuration

A BEAN CONTAINER OFFERS INJECTION OF PROPERTIES

property values can be provided via XML files
property values can be provided via PROPERTIES files
property values can be provided via ENVIRONMENT variables

examples
- Spring org.springframework.beans.factory.annotation.Value

see package beans.properties

A BEAN CONTAINER OFFERS DEPENDENCY INJECTION

A BEAN CONTAINER OFFERS ASPECT ORIENTED PROGRAMMING SUPPORT

A BEAN CONTAINER OFFERS EVENT BASED PROGRAMMING SUPPORT
