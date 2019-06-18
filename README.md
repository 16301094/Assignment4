# Assignment4
小组成员  

黄琛深 黄镇海 谢俊  

### maven依赖

```
<artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
<artifactId>spring-boot-starter-webflux</artifactId>
<artifactId>lombok</artifactId> 非必须
```

### Basic requirements  70

使用Spring webflux+ MongoDB 通过 controller 以注解的方式实现restful api

分别为 查看指定id用户,查看所有用户,新增用户,删除指定id用户

```
@GetMapping(value = "/user/{id}")
```

```
@GetMapping(value = "/users")
```

```
@PostMapping(value = "/user")
```

```
@DeleteMapping(value = "/user/{id}")
```

### Functional request handler  10

使用handler + router 为web应用配置路由 实现resful api 

使用的地址为routeUsers 与原restful 地址共存

```
.route(GET("/routeUsers").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
.andRoute(GET("/routeUser/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
.andRoute(POST("/routeUser").and(accept(MediaType.APPLICATION_JSON)), handler::save)
.andRoute(DELETE("/routeUser/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
```

### Persisting data reactively 10

使用mongodb 详见文档中的截图

### Security (10%)

未实现

### 补充

程序未作前端界面,所有交互通过postman 实现 ,传输格式为JSON

程序使用的entity为简化的用户类 仅包含 id 姓名 年龄 电话
