# Spring-Boot-Example

Initialization-Example-01
- 하나의 package로 묶어 실행합니다. 
- 공식 가이드 문서를 참고 : https://spring.io/guides/gs/accessing-data-mysql/ 

Initialization-Example-02
- application을 제외한 class 파일을 package화 하였습니다.

Initialization-Example-03
- application을 포함한 class 파일을 package화 하였습니다.

Initialization-Example-04
- DML 구문 (select, inser, update, delete) 예제를 추가하였습니다.
- application.properties

Initialization-Example-05
- jsp 예제를 추가하였습니다.
- https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-web-jsp
- pom.xml
- application.properties

Initialization-Example-06
- html 예제를 추가하였습니다.
- pom.xml
- application.properties

# JPA-Postgresql-Example

JPA-Postgresql-Example-01
- Postgresql 연동 세팅을 추가하였습니다.
- CRUD 등은 진행하지 않았습니다.
- java.lang.reflect.invocationtargetexception: null
- https://stackoverflow.com/questions/49680199/java-lang-reflect-invocationtargetexception-null

JPA-Postgresql-Example-02
- Postgresql 연동 세팅을 추가하였습니다.
- Select(findAll())을 진행하여 실제 데이터를 조회하였습니다.

JPA-Postgresql-Example-03
- User 테이블과 Board 테이블을 조인하여 출력하였습니다.

# Springboot-Recipe

Springboot-Recipe-01
- 메이븐 빌드파일 pom.xml을 만들고, 필요한 의존성을추가한다. 
- 애플리케이션을 실행하기 위해, 애플리케이션을 부트스트랩할 main 함수가 포함된 자바 클래스를 생성한다.  

Springboot-Recipe-02
- 그래들 빌드 파일인 build.gradle을 생성하고 필요한 의존서을 추가한다.
- 애플리케이션을 실행하기 위해, 애플리케이션을 부트스트랩할 main 함수가 포함된 자바 클래스를 생성한다.  

Springboot-Recipe-03
- 스프링 부트에서 클래스를 빈으로 사용하고 싶다.
- 문제점을 해결하려면 자동으로 클래스를 감지하고 객체를 생성해주는 @ComponentScan을 활용한다. 이는 @Autowired나 @value로 주입되는 의존성이나 속성을 함께 사용할 수 있다. 또는 생성될 때 빈의 생성자를 사요해 더 많이 제어하도록 @Bean 애노테이션이 추가된 함수를 사용할 수 있다.
- @SpringBootApplication에는 @ComponentScan과 @Configuration이 포함되어 있다. 이 의미는 @Component 애노테이션이 추가된 클래스는 자동으로 감지돼 스프링 부트에 의해 객체화된다는 것이다. 또한 선언할 빈을 정의한 @Bean 함수 사용도 가능하다.
- @SpringBootApplication 애노테이션은 소위 말하는 합성 애노테이션이며 이전에 필요로 했던 애노테이션으로 구성되어 있다.  
  - @Target({ElementType.TYPE{})
  - @Retention(RetentionPolicy.RUNTIME)
  - @Documented
  - @Inherited
  - @SpringBootConfiguration
  - @EnableAutoConfiguration
  - @ComponnentScan
  - public @interface SpringBootApplication { ... }  

Springboot-Recipe-04
- 특정 로거로 로그 수준을 구성하고자 한다.
- 스프링 부트를 사용해 로깅 프레임워크 및 구성을 진행할 수 있다.  

Springboot-Recipe-05
- 스프링 부트를 사용해 스프링 MVC 애플리케이션을 만든다.
- 스프링 부트는 스프링 MVC에 필요한 컴포넌트를 사용하기 위해 자동 진행할 것이다. 
- 이를 활성화하려면 스프링 부트가 클래스패스에서 스프링 MVC 클래스를 감지할 수 있어야 하는데, 의존성에 spring-boot-starter-web을 추가해야 한다.  
