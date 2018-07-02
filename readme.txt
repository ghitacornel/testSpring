PREREQUISITES

- software    design patterns ( https://en.wikipedia.org/wiki/Software_design_pattern )
- PROXY       design pattern ( https://en.wikipedia.org/wiki/Proxy_pattern ) ( https://stackoverflow.com/questions/350404/how-do-the-proxy-decorator-adapter-and-bridge-patterns-differ )
- FACTORY     design pattern ( https://en.wikipedia.org/wiki/Factory_method_pattern )
- SINGLETON   design pattern ( https://en.wikipedia.org/wiki/Singleton_pattern )
- PROTOTYPE   design pattern ( https://en.wikipedia.org/wiki/Prototype_pattern )
- FACADE      design pattern ( https://en.wikipedia.org/wiki/Facade_pattern )
- THREAD POOL design pattern ( https://en.wikipedia.org/wiki/Thread_pool )
- OBSERVER    design pattern ( https://en.wikipedia.org/wiki/Observer_pattern )

- Java Reflection

- java.lang.ThreadLocal
- java.lang.reflect.Proxy

- Javassist ( http://www.javassist.org/ )
- CGLib ( https://github.com/cglib/cglib )

1. A BEAN CONTAINER ACTS AS A REPOSITORY OF BEANS

see beans.names
a bean lookup can be performed using a bean predefined name
a bean lookup can be performed using a bean default provided name/names
a bean lookup can be performed using a bean class
a bean lookup can be performed using a bean parent class
a bean lookup can fail if multiple bean types qualify as result, for further search refinement qualifiers are required

2. A BEAN CONTAINER OFFERS [OUT OF THE BOX]/[PREDEFINED] bean types

see EJB javax.ejb.Stateless
see EJB javax.ejb.Stateful
see EJB javax.ejb.Singleton
see EJB javax.ejb MessageDriven
see Spring org.springframework.stereotype.Component
see Spring org.springframework.context.annotation.Scope
see Spring org.springframework.stereotype.Service
see Spring org.springframework.stereotype.Repository
see Spring org.springframework.stereotype.Controller
see Spring org.springframework.web.context.annotation.RequestScope
see Spring org.springframework.web.context.annotation.SessionScope
see Spring org.springframework.web.context.annotation.ApplicationScope
see CDI javax.enterprise.context.RequestScoped
see CDI javax.enterprise.context.SessionScoped
see CDI javax.enterprise.context.ApplicationScoped
see CDI javax.enterprise.context.ConversationScoped
see CDI javax.enterprise.context.Dependent
see many others

see beans.scopes.prototype
see beans.scopes.singleton

3. A BEAN CONTAINER OFFERS LIFECYCLE CONTROLLING METHODS

see javax.annotation.PostConstruct
see javax.annotation.PreDestroy

see beans.lifecycle.prototype
see beans.lifecycle.singleton

4. A BEAN CONTAINER OFFERS FACTORY DESIGN PATTERN SUPPORT

see Spring org.springframework.context.annotation.Configuration
see Spring org.springframework.context.annotation.Bean
see CDI javax.enterprise.inject.Produces
see CDI javax.enterprise.inject.New

see beans.factories.configuration

A BEAN CONTAINER OFFERS INJECTION OF PROPERTIES

see beans.properties

A BEAN CONTAINER OFFERS DEPENDENCY INJECTION

A BEAN CONTAINER OFFERS ASPECT ORIENTED PROGRAMMING SUPPORT

A BEAN CONTAINER OFFERS EVENT BASED PROGRAMMING SUPPORT
