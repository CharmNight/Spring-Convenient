# Spring-Convenient
demo

## Response
### 基础使用
```java
@RestController
public class TestController {

	@ResponseResult
	@PostMapping("/hello")
	public List<String> hello(){
		List<String> list = new ArrayList<>();
		list.add("123");
		list.add("123");
		list.add("123");
		return list;
	}
}
```
通过 使用 @ResponseResult 注解将数据进行封装
### 效果
```
curl --request POST \
     --url http://127.0.0.1:8080/hello \
     
--------

{
    "statusCode": 200,
    "message": "",
    "data": [
        "123",
        "123",
        "123"
    ],
    "pagination": null
}
```
