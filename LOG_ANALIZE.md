Testing started at 오후 1:05 ...
Gradle Daemon started in 9 s 952 ms
> Task :cleanTest
> Task :compileJava UP-TO-DATE
> Task :processResources
> Task :classes
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
13:06:16.778 [Test worker] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:16.795 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
13:06:16.815 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
13:06:16.851 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
13:06:16.874 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest], using SpringBootContextLoader
13:06:16.881 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]: class path resource [com/sisi/ubic/web/domain/posts/PostsRepositoryTest-context.xml] does not exist
13:06:16.883 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]: class path resource [com/sisi/ubic/web/domain/posts/PostsRepositoryTestContext.groovy] does not exist
13:06:16.883 [Test worker] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]: no resource found for suffixes {-context.xml, Context.groovy}.
13:06:16.885 [Test worker] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]: PostsRepositoryTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
13:06:16.990 [Test worker] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.151 [Test worker] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [D:\000UbiC\000SpringBoot\SBBook\build\classes\java\main\com\sisi\ubic\Application.class]
13:06:17.154 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.sisi.ubic.Application for test class com.sisi.ubic.web.domain.posts.PostsRepositoryTest
13:06:17.293 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]: using defaults.
13:06:17.294 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
13:06:17.320 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@2af1db43, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@70ae9330, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@22e82c1d, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@5e846867, org.springframework.test.context.support.DirtiesContextTestExecutionListener@7a0b9b37, org.springframework.test.context.transaction.TransactionalTestExecutionListener@7eb8b055, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@1dd3e35b, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@60e977d6, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@461d9adf, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@7d1ca051, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@7f574d92, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@54abd269]
13:06:17.326 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.326 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.331 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.332 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.333 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.333 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.338 [Test worker] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@4b1b12d6 testClass = PostsRepositoryTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@2a379cc3 testClass = PostsRepositoryTest, locations = '{}', classes = '{class com.sisi.ubic.Application}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@34da440f, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@6d789da2, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@111053d2, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@46045712], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].
13:06:17.339 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.339 [Test worker] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.sisi.ubic.web.domain.posts.PostsRepositoryTest]
13:06:17.376 [Test worker] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=-1}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.7.RELEASE)

2020-01-10 13:06:17.853  INFO 37524 --- [    Test worker] c.s.u.w.d.posts.PostsRepositoryTest      : Starting PostsRepositoryTest on DESKTOP-EI3ALMM with PID 37524 (started by sisi in D:\000UbiC\000SpringBoot\SBBook)
2020-01-10 13:06:17.855  INFO 37524 --- [    Test worker] c.s.u.w.d.posts.PostsRepositoryTest      : No active profile set, falling back to default profiles: default
2020-01-10 13:06:18.961  INFO 37524 --- [    Test worker] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2020-01-10 13:06:19.085  INFO 37524 --- [    Test worker] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 100ms. Found 1 repository interfaces.
2020-01-10 13:06:19.638  INFO 37524 --- [    Test worker] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$64bf7013] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-01-10 13:06:19.952  INFO 37524 --- [    Test worker] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-01-10 13:06:20.238  INFO 37524 --- [    Test worker] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-01-10 13:06:20.471  INFO 37524 --- [    Test worker] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
2020-01-10 13:06:20.624  INFO 37524 --- [    Test worker] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.10.Final}
2020-01-10 13:06:20.627  INFO 37524 --- [    Test worker] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2020-01-10 13:06:21.052  INFO 37524 --- [    Test worker] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2020-01-10 13:06:21.339  INFO 37524 --- [    Test worker] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
Hibernate: drop table posts if exists
Hibernate: create table posts (id bigint generated by default as identity, author varchar(255), content TEXT not null, title varchar(500) not null, primary key (id))
2020-01-10 13:06:22.370  INFO 37524 --- [    Test worker] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@25b5aa9a'
2020-01-10 13:06:22.375  INFO 37524 --- [    Test worker] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-01-10 13:06:23.845  INFO 37524 --- [    Test worker] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-01-10 13:06:23.970  WARN 37524 --- [    Test worker] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-01-10 13:06:24.696  INFO 37524 --- [    Test worker] c.s.u.w.d.posts.PostsRepositoryTest      : Started PostsRepositoryTest in 7.303 seconds (JVM running for 11.964)
Hibernate: insert into posts (id, author, content, title) values (null, ?, ?, ?)
2020-01-10 13:06:25.255  INFO 37524 --- [    Test worker] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
Hibernate: select posts0_.id as id1_0_, posts0_.author as author2_0_, posts0_.content as content3_0_, posts0_.title as title4_0_ from posts posts0_
Hibernate: select posts0_.id as id1_0_, posts0_.author as author2_0_, posts0_.content as content3_0_, posts0_.title as title4_0_ from posts posts0_
Hibernate: delete from posts where id=?
2020-01-10 13:06:25.825  INFO 37524 --- [       Thread-4] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-01-10 13:06:25.826  INFO 37524 --- [       Thread-4] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-01-10 13:06:25.826  INFO 37524 --- [       Thread-4] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
Hibernate: drop table posts if exists
2020-01-10 13:06:25.839  INFO 37524 --- [       Thread-4] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-01-10 13:06:25.866  INFO 37524 --- [       Thread-4] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
Deprecated Gradle features were used in this build, making it incompatible with Gradle 5.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/4.10.2/userguide/command_line_interface.html#sec:command_line_warnings
BUILD SUCCESSFUL in 32s
5 actionable tasks: 3 executed, 2 up-to-date
오후 1:06:26: Tasks execution finished ':cleanTest :test --tests "com.sisi.ubic.web.domain.posts.PostsRepositoryTest.게시글저장_불러오기"'.

Hibernate: 로그보기!

```java
// 트랜잭션 스크립트: 서비스에서 처리
class Main{
    @Transactional
    public Order cancelOrder(int orderId){
        // 1. 데이터베이스로부터 주문 정보:Orders, 결제정보:Billing, 배송정보:Delivery 조회
        OrdersDto order = orderDao.selectOrders(orderId);
        BillingSto billing = billing = billingDao.selectBilling(orderId);
        DeliveryDro delivery = deliveryDao.selectDelivery(orderId);
    
        // 2. 배송 취소를 해야 하는지 확인
        String deliveryStatus = delivery.getStatus();
    
        // 3. if(배송중이라면) --> 배송 취소로 변경
        if("IN_PROGRESS".equal(deliveryStatus)){
            delivery.setStatus("CANCEL");
            deliveryDao.update(delivery);
        }
    
        // 4. 각 테이블에 취소 상태 Update
        order.setStatus("CANCEL");
        orderDao.update(order);
    
        billing.setStatus("CANCEL");
    
        deliveryDao.update(billing);
        
        return order;
    }
}

// 도메인 모델에서 처리
class Main22{
    @Transactional
    public Order cancelOrder(int orderId){
        Order order = ordersRepository.findById(orderId);
        Billing billing = billingRepository.findByOrderId(orderId);
        Delevery deliery = deliveryRepository.findByOrderId(orderId);
        
        delivery.cancel();
        
        order.cancel();
        billing.cancel();
        
        return order;
    }
}
```


"C:\Program Files\Java\jdk-11.0.2\bin\java.exe" -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=64686:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath D:\000UbiC\000SpringBoot\SBBook\build\classes\java\main;D:\000UbiC\000SpringBoot\SBBook\build\resources\main;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-web\2.1.7.RELEASE\fa43baf40bde3ecdb93ac9c545dd39f82ab29c35\spring-boot-starter-web-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.projectlombok\lombok\1.18.8\448003bc1b234aac04b58e27d7755c12c3ec4236\lombok-1.18.8.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-data-jpa\2.1.7.RELEASE\5e4a5d5442f32f5e12b36674a620ec57b0b66c6e\spring-boot-starter-data-jpa-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.h2database\h2\1.4.199\7bf08152984ed8859740ae3f97fae6c72771ae45\h2-1.4.199.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-json\2.1.7.RELEASE\9c12f046a7c4ae110d89163a491ad0d7cf036e79\spring-boot-starter-json-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-aop\2.1.7.RELEASE\4577d056af1f823bb7730c99f43c3268dd697310\spring-boot-starter-aop-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-jdbc\2.1.7.RELEASE\3ea97a134b44a886ff529215e7bec04bfd93fa5b\spring-boot-starter-jdbc-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter\2.1.7.RELEASE\e23f4e9460e0e2220b444e40fc7fd6e95f66e0fe\spring-boot-starter-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-tomcat\2.1.7.RELEASE\11f2a86aefefba72a4efe5ff18f4165a4b4e78b\spring-boot-starter-tomcat-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.hibernate.validator\hibernate-validator\6.0.17.Final\af73055fc4a103ab347c56e7da5a143d68a0170\hibernate-validator-6.0.17.Final.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-webmvc\5.1.9.RELEASE\b9d4a2140488f0e6f9aa231e7938ae18da77b637\spring-webmvc-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-web\5.1.9.RELEASE\9fe4390420fdd0b63dc4ed90d9027dafa9f74f80\spring-web-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\javax.transaction\javax.transaction-api\1.3\e006adf5cf3cca2181d16bd640ecb80148ec0fce\javax.transaction-api-1.3.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\javax.xml.bind\jaxb-api\2.3.1\8531ad5ac454cc2deb9d4d32c40c4d7451939b5d\jaxb-api-2.3.1.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.hibernate\hibernate-core\5.3.10.Final\e608b854325005edbf43cb2b6041fdafd3f2eb57\hibernate-core-5.3.10.Final.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.data\spring-data-jpa\2.1.10.RELEASE\12639406aa28c3a5195a1a4c9077fe562f54bc31\spring-data-jpa-2.1.10.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-aspects\5.1.9.RELEASE\a8aec853c345ed54a99627cee9f755ce7dbb734\spring-aspects-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-autoconfigure\2.1.7.RELEASE\2c9d3e2c6ea3cb435e99e2973009636b62a9d816\spring-boot-autoconfigure-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot\2.1.7.RELEASE\1599a2ad1fc6d36dbfc2a7c0dd5dab3a0bb27c61\spring-boot-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-logging\2.1.7.RELEASE\6e829f739992a7f368c0af44a08ed89ad2a1972f\spring-boot-starter-logging-2.1.7.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\javax.annotation\javax.annotation-api\1.3.2\934c04d3cfef185a8008e7bf34331b79730a9d43\javax.annotation-api-1.3.2.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-context\5.1.9.RELEASE\c37f8fe15a5ae4ea1f351bd46167fd492a84eefa\spring-context-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-aop\5.1.9.RELEASE\bc2312ffad02251b9d472e4a7c0e472a58f50fbf\spring-aop-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-orm\5.1.9.RELEASE\220169d217f7114706141fc0afba425a5b368dce\spring-orm-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-jdbc\5.1.9.RELEASE\3fd70356ba8d7c00c4081c1a207766352624414e\spring-jdbc-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework.data\spring-data-commons\2.1.10.RELEASE\c73a76070181b59b19df6893e1ca729263a69b47\spring-data-commons-2.1.10.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-tx\5.1.9.RELEASE\a9125e2c8eeb193030f3972c6293616943c55ef2\spring-tx-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-beans\5.1.9.RELEASE\5a03b3983108d73978aec2fa3e681aedad6782c\spring-beans-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-expression\5.1.9.RELEASE\db3a2468c1b7d697ec3b3ec6e5652dc282994fe3\spring-expression-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-core\5.1.9.RELEASE\dc3815439579b4fa0c19970e6b8e5d774af8d988\spring-core-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.yaml\snakeyaml\1.23\ec62d74fe50689c28c0ff5b35d3aebcaa8b5be68\snakeyaml-1.23.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jdk8\2.9.9\4b04126963103216c9c43b0f34bbc36315654204\jackson-datatype-jdk8-2.9.9.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jsr310\2.9.9\a33df137557793b0404a486888dbe049f7abeeeb\jackson-datatype-jsr310-2.9.9.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.module\jackson-module-parameter-names\2.9.9\a92facb55a2538e7b2fe14294570a18b823ad431\jackson-module-parameter-names-2.9.9.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.9.9\d6eb9817d9c7289a91f043ac5ee02a6b3cc86238\jackson-databind-2.9.9.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.apache.tomcat.embed\tomcat-embed-websocket\9.0.22\45974d3443cc15ad9d10239d762d5e15759e6364\tomcat-embed-websocket-9.0.22.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.apache.tomcat.embed\tomcat-embed-core\9.0.22\79f39903498b28adacb18fe2ea046edd306295a6\tomcat-embed-core-9.0.22.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.apache.tomcat.embed\tomcat-embed-el\9.0.22\4da4b778b635a7e78ca7cd7288253e2e47b88a9f\tomcat-embed-el-9.0.22.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\javax.validation\validation-api\2.0.1.Final\cb855558e6271b1b32e716d24cb85c7f583ce09e\validation-api-2.0.1.Final.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.hibernate.common\hibernate-commons-annotations\5.0.4.Final\965a18fdf939ee75e41f7918532d37b3a8350535\hibernate-commons-annotations-5.0.4.Final.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.jboss.logging\jboss-logging\3.3.2.Final\3789d00e859632e6c6206adc0c71625559e6e3b0\jboss-logging-3.3.2.Final.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml\classmate\1.4.0\291658ac2ce2476256c7115943652c0accb5c857\classmate-1.4.0.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.aspectj\aspectjweaver\1.9.4\9205229878f3d62fbd3a32a0fb6be2d6ad8589a9\aspectjweaver-1.9.4.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.zaxxer\HikariCP\3.2.0\6c66db1c636ee90beb4c65fe34abd8ba9396bca6\HikariCP-3.2.0.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\javax.activation\javax.activation-api\1.2.0\85262acf3ca9816f9537ca47d5adeabaead7cb16\javax.activation-api-1.2.0.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\javax.persistence\javax.persistence-api\2.2\25665ac8c0b62f50e6488173233239120fc52c96\javax.persistence-api-2.2.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.javassist\javassist\3.23.2-GA\c5afe660a95e87ceb518e4f5cf02f5c56b547683\javassist-3.23.2-GA.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\net.bytebuddy\byte-buddy\1.9.16\e7d63009be7b87ff1f15b72e5b8c59c897a8d8bd\byte-buddy-1.9.16.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\antlr\antlr\2.7.7\83cd2cd674a217ade95a4bb83a8a14f351f48bd0\antlr-2.7.7.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.jboss\jandex\2.0.5.Final\7060f67764565b9ee9d467e3ed0cb8a9c601b23a\jandex-2.0.5.Final.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.dom4j\dom4j\2.1.1\3dce5dbb3571aa820c677fadd8349bfa8f00c199\dom4j-2.1.1.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-classic\1.2.3\7c4f3c474fb2c041d8028740440937705ebb473a\logback-classic-1.2.3.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.apache.logging.log4j\log4j-to-slf4j\2.11.2\6d37bf7b046c0ce2669f26b99365a2cfa45c4c18\log4j-to-slf4j-2.11.2.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.slf4j\jul-to-slf4j\1.7.26\8031352b2bb0a49e67818bf04c027aa92e645d5c\jul-to-slf4j-1.7.26.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-api\1.7.26\77100a62c2e6f04b53977b9f541044d7d722693d\slf4j-api-1.7.26.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.springframework\spring-jcl\5.1.9.RELEASE\7c372790c999777d20f364960cf557dd74f890cf\spring-jcl-5.1.9.RELEASE.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.9.0\7c10d545325e3a6e72e06381afe469fd40eb701\jackson-annotations-2.9.0.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.9.9\bfff5af9fb8347d26bbb7959cb9b4fe9a2b0ca5e\jackson-core-2.9.9.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-core\1.2.3\864344400c3d4d92dfeb0a305dc87d953677c03c\logback-core-1.2.3.jar;C:\Users\sisi\.gradle\caches\modules-2\files-2.1\org.apache.logging.log4j\log4j-api\2.11.2\f5e9a2ffca496057d6891a3de65128efc636e26e\log4j-api-2.11.2.jar com.sisi.ubic.Application

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.7.RELEASE)

2020-01-10 15:57:40.419  INFO 15928 --- [           main] com.sisi.ubic.Application                : Starting Application on DESKTOP-EI3ALMM with PID 15928 (D:\000UbiC\000SpringBoot\SBBook\build\classes\java\main started by sisi in D:\000UbiC\000SpringBoot\SBBook)
2020-01-10 15:57:40.421  INFO 15928 --- [           main] com.sisi.ubic.Application                : No active profile set, falling back to default profiles: default
2020-01-10 15:57:41.214  INFO 15928 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2020-01-10 15:57:41.285  INFO 15928 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 63ms. Found 1 repository interfaces.
2020-01-10 15:57:41.727  INFO 15928 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$2a7c63a3] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-01-10 15:57:42.209  INFO 15928 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-01-10 15:57:42.250  INFO 15928 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-01-10 15:57:42.250  INFO 15928 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.22]
2020-01-10 15:57:42.510  INFO 15928 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-01-10 15:57:42.510  INFO 15928 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2038 ms
2020-01-10 15:57:42.762  INFO 15928 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-01-10 15:57:42.888  INFO 15928 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-01-10 15:57:42.953  INFO 15928 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
2020-01-10 15:57:43.084  INFO 15928 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.10.Final}
2020-01-10 15:57:43.088  INFO 15928 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2020-01-10 15:57:43.346  INFO 15928 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2020-01-10 15:57:43.700  INFO 15928 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL5InnoDBDialect
Hibernate: drop table if exists posts
Hibernate: create table posts (id bigint not null auto_increment, author varchar(255), content TEXT not null, title varchar(500) not null, primary key (id)) engine=InnoDB
2020-01-10 15:57:44.477  INFO 15928 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@4aeaff64'
2020-01-10 15:57:44.479  INFO 15928 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-01-10 15:57:45.015  INFO 15928 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-01-10 15:57:45.069  WARN 15928 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-01-10 15:57:45.339  INFO 15928 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-01-10 15:57:45.346  INFO 15928 --- [           main] com.sisi.ubic.Application                : Started Application in 5.285 seconds (JVM running for 9.081)
2020-01-10 15:57:45.554  INFO 15928 --- [nio-8080-exec-1] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header
 Note: further occurrences of HTTP request parsing errors will be logged at DEBUG level.

java.lang.IllegalArgumentException: Invalid character found in method name. HTTP method names must be tokens
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:415) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:294) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:853) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1587) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) ~[na:na]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at java.base/java.lang.Thread.run(Thread.java:834) ~[na:na]

2020-01-10 15:57:45.590  INFO 15928 --- [nio-8080-exec-3] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header
 Note: further occurrences of HTTP request parsing errors will be logged at DEBUG level.

java.lang.IllegalArgumentException: Invalid character found in method name. HTTP method names must be tokens
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:415) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:294) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:853) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1587) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) ~[na:na]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-9.0.22.jar:9.0.22]
	at java.base/java.lang.Thread.run(Thread.java:834) ~[na:na]

해결: https --> http 요청으로 변경하면 된다!!
