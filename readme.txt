PREREQUISITES

- software    design patterns ( https://en.wikipedia.org/wiki/Software_design_pattern )
- PROXY       design pattern  ( https://en.wikipedia.org/wiki/Proxy_pattern ) ( https://stackoverflow.com/questions/350404/how-do-the-proxy-decorator-adapter-and-bridge-patterns-differ )
- FACTORY     design pattern  ( https://en.wikipedia.org/wiki/Factory_method_pattern )
- SINGLETON   design pattern  ( https://en.wikipedia.org/wiki/Singleton_pattern )
- PROTOTYPE   design pattern  ( https://en.wikipedia.org/wiki/Prototype_pattern )
- FACADE      design pattern  ( https://en.wikipedia.org/wiki/Facade_pattern )
- THREAD POOL design pattern  ( https://en.wikipedia.org/wiki/Thread_pool )
- OBSERVER    design pattern  ( https://en.wikipedia.org/wiki/Observer_pattern )
- MVC Model View Controller   ( https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller )

- Java Reflection

- java.lang.ThreadLocal
- java.lang.reflect.Proxy ( for old school interface-implementation approach )

- Javassist ( http://www.javassist.org/ )
- CGLib ( https://github.com/cglib/cglib )

1. A BEAN CONTAINER ACTS AS A REPOSITORY OF BEANS

Usually :
- A bean lookup can be performed using a bean predefined name.
- A bean lookup can be performed using a bean default provided name/names.
- A bean lookup can be performed using the bean class.
- A bean lookup can be performed using any bean class implemented interfaces.
- A bean lookup can be performed using any bean class extended parent classes.
- A bean lookup can fail if multiple bean types qualify as result, for further search refinement qualifiers are required.
Yet not all containers allow such behaviors, or allow them to a certain degree.

see package beans.names

examples
- EJB container automatically registers beans in a JNDI register under well defined and multiple names.
- Spring container automatically register beans by name.

2. A BEAN CONTAINER PROVIDES [OUT OF THE BOX]/[PREDEFINED] BEAN TYPES

Each container usually offers its very specific bean types.
Even if different containers use the same bean type name, they might use the same name for different scopes and even
different behaviors. Example : EJB Singleton vs Spring Singleton.

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
- see many others, such predefined bean types differ from one container to another

see packages beans.scopes.*

3. A BEAN CONTAINER DEFINES SPECIFIC LIFECYCLE FOR EACH PROVIDED BEAN TYPE AND PROVIDES LIFECYCLE CONTROLLING METHODS

Each container usually defines a very specific lifecycle for each provided bean type.
Yet a common pattern occurred. See javax.annotation.PostConstruct and javax.annotation.PreDestroy.
Some container specific lifecycle control methods are javax.ejb.Startup or org.springframework.context.annotation.Lazy.

see packages beans.lifecycle.*

4. A BEAN CONTAINER PROVIDES FACTORY DESIGN PATTERN SUPPORT

examples
- Spring org.springframework.context.annotation.Configuration
- Spring org.springframework.context.annotation.Bean
- Spring xml bean definitions
- CDI javax.enterprise.inject.Produces
- CDI javax.enterprise.inject.New

see package beans.factories

5.A BEAN CONTAINER PROVIDES DEPENDENCY INJECTION

bean dependencies can be resolved by the container by the means of :
- dependency request markers
- constructors
- setters
- fields

Dependency request markers are container specific Java annotations that informs the container
that the specific marked field / setter / constructor is to be used in the process of dependencies injection.

    Dependency constructor injections are usually realized through the means of a single well defined class constructor.
    This constructor has marked for injection constructor parameters.
    The container will create the specific bean and solve its dependency solely through the use of a such specific constructor.

    Dependency setter injections are realized through the means of well defined setter methods marked with dependency request markers.
    The container will create by any means instances of the bean.
    The container ensures bean dependencies are resolved through the provided setters only.

    Dependency field injections are realized though the means of dependency request markers placed directly on class fields.
    Such fields can be private ( and even final for some containers ).
    Usually the container will provide injection via Java reflection, but can use other means also.

    Generally it is accepted that container will resolve all bean dependencies before invoking any kind of @PostConstruct provided method.
    Combinations of such injection methods (constructor/setter/field) [are]/[are not] allowed depending on the container.
    Order of resolving dependency injection is container specific.
    Combinations of declared in class or in an external configuration file of such dependencies [are]/[are not] allowed depending on the container.
    Usually containers expect from their managed beans to define a no private no arguments constructor.

    Providing accessor methods to injected properties is a bad choice.
    Such properties are managed solely by the container hence any class that requires references to such container beans
    should obtain them by asking directly the bean container and not through any other means.

    Cyclic bean dependencies are allowed or not depending on the container.
    For example EJB container allows it, but Spring and CDI containers do not.

    Self injecting beans are generally allowed by all containers.
    Usually this behavior is accepted combined with transactional aspects.

    Injecting different types of beans into other different types of beans must be treated carefully.
    It can lead to "unexpected" behaviors. Read container documentation.

    Container injected bean dependencies can be actual bean instances or proxies.
    No assumption is to be made on if a provided by the container dependency is a proxy or an actual class instance.
    NO assumption is to be made on how such proxies are created or when.
    Always read container provided documentation regarding this aspects.

    Some containers allow injection of values into managed beans methods parameters.
    For example REST controllers with injected HTTP requests or sessions.

    Never assume that two different containers can easily be integrated.
    Always read documentation. Sometimes dedicated documentation is provided on this aspect.

see ( http://www.baeldung.com/spring-annotations-resource-inject-autowire )or google it for ( @Autowired vs @Inject vs @Resource )

examples
- Spring org.springframework.beans.factory.annotation.Autowired
- CDI javax.inject.Inject
- EJB javax.annotation.Resource
- EJB javax.ejb.EJB

see
- Spring org.springframework.beans.factory.annotation.Qualifier
- CDI javax.inject.Qualifier

see package beans.injection.*

6. A BEAN CONTAINER CAN PROVIDE INJECTION OF PROPERTIES

Property values can be provided via XML files.
Property values can be provided via PROPERTIES files.
Property values can be provided via ENVIRONMENT variables.

examples
- Spring org.springframework.beans.factory.annotation.Value

see packages beans.properties.*

7. A BEAN CONTAINER CAN PROVIDE ASPECT ORIENTED PROGRAMMING ( AOP ) SUPPORT

see ( https://en.wikipedia.org/wiki/Aspect-oriented_programming )

AOP is possible through the usage of PROXY design pattern over container managed beans.
AOP allows for defining interceptor mechanisms. Interceptor mechanisms are a separate part of JEE specifications.
Each container can offer AOP through specific mechanisms and with specific flavors.
AOP allows adding support for declarative logging or declarative security.
Combined it with usage of ThreadLocal and support for declarative business transactions can be defined.

For order of execution when multiple aspects are triggered read container provided documentation.
Some containers provide AOP support but also make heavy use of AOP (e.g. EJB).

see package beans.aop.*

8. A BEAN CONTAINER CAN PROVIDE EVENT BASED PROGRAMMING SUPPORT

Note that this behavior is a lightweight alternative to message queues.
Note that not all containers offer such functionality.
Note that this functionality is offered by the container through a specific container API.

see beans.events.*

9. A BEAN CONTAINER CAN PROVIDE TIME BASED EVENT GENERATION SUPPORT

This kind of support can come in different flavours and can be used through different API.

see beans.timers.*