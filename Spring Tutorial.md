# 什么是Spring

​	是分层的JavaSE/EE full-stack 轻量级开源框架，以IoC（Inverse of Control 控制反转）和 AOP（Aspect Oriented Programming 面向切片编程）为内核，使用JavaBean来替代之前的低效的开发模式。

| 服务器端三层架构 | Spring的技术支持              |
| ---------------- | ----------------------------- |
| 表示层Web        | 提供了与smu等框契的整合       |
| 业务逻辑层       | 管理事务、记录日志等          |
| 持久层Dao        | 整合 Hibemate、 Jdbc Template |

​	**目录结构：** 

在libs目录中有四个 Spring的基础包，分别对应 Spring核心容器的四个模块：

| 基础包                               | 描述                                                         |
| ------------------------------------ | ------------------------------------------------------------ |
| spring-core-4.3.6.RELEASE. jar       | 包含 Spring框架的核心工具类， Spring其它组件都要用到这个包里的类 |
| spring-beans-4.3.6. RELEASE. jar     | 所有应用都要用到的JAR包，它包合访问配置文件、创建和管理Bean以及进行控制反转或者依赖注入操作相关的所有类 |
| spring-context-4.3.6.RELEASE. jar    | 提供了在基础loC功能上的扩展服务，还提供了许多企业级服务的支持 |
| spring-expression-4.3.6.RELEASE. jar | 定义了 Spring的表达式语言。                                  |



### Spring的核心容器

1. BeanFactory

   不常用。

2. **ApplicationContext**

   是前者的子接口，功能更强大，最常用。

   创建 Applicationcontext接口实例，通常采用两种方法，具体如下

   1. 通过 Classpathxmlapplication Context创建
      

   ```java
   Applicationcontext applicationcontext =
   new Classpathxmlapplication Context(String configlocation)
   ```

   Classpathxmlapplication Context 会从类路径 classpath中寻找指定的XML配置文件，找到并装载完成 Application Context的实例化工作。
   2. 通过 Filesystem Xmiapplicationcontextf创建

      不常用。

   ps: web项目中，web服务器实例化ApplicationContext容器时，通常使用ContextLoaderListener来实现。只在web.xml中添加如下代码：

   ```java
   <context-param>
   	<param-name>context Configlocation</param-name>
       <param-value>
   		classpath: spring/application Context.xml
       </param-value>	
   </context-param>
   <listener>   
   	<listener-class>
   		org. springframework web context. Contextloaderlistener
       </listener-class>
   </listener>
   ```

   

   **获取Bean** 

```java
1. Object getBean（String name）；
根据容器中Bean的id或name来获取指定的Bean，获取之后需要进
行强制类型转换。

2. <T> T getBean(Class<T>requiredType);
根据类的类型来获取Bean的实例。由于此方法为泛型方法，因此在获取Bean之后不需要进行强制类型转换。

```





### 依赖注入

​	DI（Dependency Injection）依赖注入和控制反转含义相同，两个角度同一概念。

1. setter方法实现依赖注入

   

2. 构造方法



# Bean

​	Bean 是spring工厂的产品，spring通过xml配置文件来注册和管理bean之间的依赖关系。

​	本质就是java中的类，而spring中的Bean就是对实体类的引用，来生产java类对象，从而实现生产和管理Bean。

​	常用属性：

| 属性  或  子元素名称 | 描述                                                         |
| -------------------- | ------------------------------------------------------------ |
| id                   | 是一个Bean的唯一标识符，Spring容器对Bean的配置、管理都通过该属性来完成。 |
| name                 | Spring容器同样可以通过此属性对容器中的Bean进行配置和管理，name属性中可以为Bean指定**多个**名称，每个名称之间用逗号或分号隔开 |
| class                | 该属性指定了Bean的具体实现类，它必须是一个完整的类名，使用类的全限定名。 |
| scope                | 用来设定Bean实例的作用域，其属性值有： **singleton（单例）**prototype（原型）、 request、 session、 global Session、 application和 websocket其默认值为 singleton。 |



### 实例化

1. 构造器实例化	

2. 静态工厂实例化

3. 实例工厂实例化

   ​	没有static静态方法，需要把工厂也实例化。

   参考附件代码Chapter02。



### 作用域

| 作用域名称                  | 说明                                           |
| --------------------------- | ---------------------------------------------- |
| singleton(单例)      ——默认 | 在容器中，只实例化一次。加载xml时就实例化      |
| prototype(原型)             | 调用多少次bean，就实例化多少次。调用时才实例化 |
| request                     |                                                |
| session                     |                                                |
| globalSession               |                                                |
| application                 |                                                |
| websocket                   |                                                |



### 生命周期

Spring容器可以管理 singleton作用域的Bean的生命周期在此作用域下， Springi能够精确的知道该Bean何时被创建，何时初始化完成，以及何时被销毁。

prototype作用域的Bean, Spring只负责创建，当容器创建了Bean实例后，Bean的实例就交给客户端代码来管理， Spring容器将不再跟踪其生命周期。



### 装配方式

1. 基于XML的装配(容易导致配置文件臃肿)
   1. 设值注入 Setter Injection
      1. Bean类必须有无参构造方法
      2. Bean类必须为属性提供setter方法
      -  配置文件中使用<property>为属性注入值
   2. 构造注入 Constructor Injection
      1. Bean类必须有有参构造方法
      -  配置文件中使用<constructor-arg>为属性注入值
   
2. **基于注解的装配**

   @ Component：用于描述 Spring中的Bean，它是一个泛化的概念，
   仅仅表示一个组件。
   ④ Repository：用于将数据访问层（DAO）的类标识为 Spring中的Bean.
   Service：用于将业务层（ Service）的类标识为 Spring中的Bean
   Controler：用于将控制层（ Controller）的类标识为 Springe中的
   Bean.
   Autowired：用于对Bean的属性变量、属性的 setter/方法及构造方法进行标注，配合对应的注解处理器完成Bean的自动配置工作。
   Resource：其作用与 Autowired-一样。 Resourcel中有两个重要属性：name和type. Spring将name属性解析为Bean实例名称，type属性解析为Bean实例类型。
   Qualifier：与@ Autowired注解配合使用，会将默认的按Bean类型装配修改为按Bean的实例名称装配，Bean的实例名称由@ Qualifier
   注解的参数指定。

   ​	

3. 自动装配

    不常用 	autowire



