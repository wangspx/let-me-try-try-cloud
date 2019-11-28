## Spring Cloud 配置中心

spring boot版本：`2.1.0.RELEASE`

spring cloud版本：`Greenwich.SR4`

#### maven依赖

~~~xml
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>
    <!--利用RabbitMQ，实现配置文件自动刷新-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-bus-amqp</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
</dependencies>
~~~

### 配置

~~~yml
spring:
  application:
    name: service-config  
  cloud:
    config:
      server:
        git:
          uri: https://github.com/wangspx/spring-cloud-config-repo
          username:
          password:
          search-paths: /*
  rabbitmq:
    host: localhost
    port: 5672
    username: test
    password: test
management:  
  endpoints:
    web:
      exposure:
        include: "*"
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
~~~