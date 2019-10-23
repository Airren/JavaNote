# Spring Boot 开发技巧

## 注册中心健康检查

RESTful API
```java
@RestController
@RequestMapping("/api/ms-admin-mq/public/health")
// 服务注册中心要进行健康检查要调用的API
public class HealthController {
    @GetMapping
    public String health() {
        return "health";
    }   
}
```

请求分页，请求查询

## 对象转换


## 