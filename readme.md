## JWT 配置使用

项目结构SpringMVC

### 1.引入依赖

```xml
<dependency>
  <groupId>com.auth0</groupId>
  <artifactId>java-jwt</artifactId>
  <version>2.2.0</version>
</dependency>
```

### 2.登陆(post)

http://localhost:8081/users/login?username=hello&password=123456

```json
{
  "message": "Ok",
  "code": 200,
  "data": {

    "user": {
      "id": 1,
      "username": "hello",
      "password": "123456"
    },
    "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0ODk5OTk4NzMwOTAsInBheWxvYWQiOiJ7XCJpZFwiOjEsXCJ1c2VybmFtZVwiOlwiaW1qYWNrXCIsXCJwYXNzd29yZFwiOlwiMTIzNDU2XCJ9In0.4w9AS7lYJS72D2R4Cjz5cXEE02NVI8n7o7MUW_a0rpM"
  }
}
```

###  3.验证

http://localhost:8081/me/get?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0ODk5OTk4NzMwOTAsInBheWxvYWQiOiJ7XCJpZFwiOjEsXCJ1c2VybmFtZVwiOlwiaW1qYWNrXCIsXCJwYXNzd29yZFwiOlwiMTIzNDU2XCJ9In0.4w9AS7lYJS72D2R4Cjz5cXEE02NVI8n7o7MUW_a0rpM

```json
{
  "message": "Ok",
  "code": 200,
  "data": {

    "user": {
      "id": 1,
      "username": "hello",
      "password": "123456"
    }
  }
}
```
