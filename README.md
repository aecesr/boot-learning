### restful接口与http协议状态表述

- RESTful概述

  > REST API（也称为 RESTful API）是一种应用程序编程接口（API 或 Web API），它符合 REST 架构风格的约束并允许与 RESTful Web 服务进行交互。REST 代表具象状态转移，由计算机科学家 Roy Fielding 创建。

- RESRful风格API的好处

  > ​	API(Application Programming Interface)顾名思义：是一组编程接口规范，客户端与服务端通过请求响应进行数据通信，REST表述性状态传递，决定了接口的形式与规则。RESTful是基于http方法的API设计风格，而不是一种新的技术。
  >
  > - 看URL就知道想要什么资源
  > - 看http menthod就知道针对什么资源干什么
  > - 看http startus code就知道结果如何
  >
  > REST通过URL暴露资源时，会强调不要在URL中出现的动词：例

- **用http方法体现对资源的操作（动词）**

  >Get方法和查询参数不应该改变数据
  >
  >- GET ：获取、读取资源
  >
  >改变数据的事交给POST、PUT、DELETE
  >
  >- POST ：添加资源
  >
  >- PUT ：修改资源
  >
  >- DELETE ：删除资源

- 复杂资源关系的表达

GET  /cars/711/drivers/ 返回 使用过编号711汽车的所有司机

GET  /cars/711/drivers/4  返回 使用过编号711汽车的4号司机

- 高级用法：HATEOAS

  - HATEOAS:超媒体作为应用状态的引擎

  > RESTful API最好做到HATEOAS,即返回结果中提供链接，连向其他API方法，使得用户不查文档，也知道下一步应该做什么。

- 版本化API

> 强制性增加API版本声明，不要发布无版本的API
>
> 面向扩展开放，面向修改关闭

### Spring常用注解及基础讲解

- **RequestMapping注解**

>-  value:应用请求端点，最核心的属性，用于标志请求处理方法的唯一性
>-  menthod:HTTP协议的menthod类型，如：GET、POST、PUT、DELETE等
>-  consumes：HTTP协议请求内容的数据类型（Content-type）
>-  produces：HTTP协议响应内容的数据类型
>-  params：HTTP请求中必须包含某些参数值的时候，才允许被注解标注的方法处理请求。
>-  headers：HTTP请求中必须包含某些指定的header值，才允许被注解标注的方法处理请求
>
>请求方式method默认都是POST
>
>默认的都是POST请求方式

- **@RestController与@Controller**
  - @Controller注解是开发中最常使用的注解，他的作用有两层含义
    - 告诉Spring，被该注解标注的类是一个Spring的Bean，需要被注入到Spring的上下文环境中。
    - 该类里面所有被RequestMapping标注的注解都是HTTP服务端点。
  - @RestController相当于@Controller和@ResponseBody结合，他有两层含义
    - 作为Controller的作用，将控制器类注入到Spring上下文环境，该类RequestMapping标注方法为HTTP服务端点。
    - 作为ResponseBody的作用，请求响应默认使用的序列化方式是JSON，而不是跳转到jsp或模板页面。
- **@PathVariable与@RequestParam**
  - PathVariable用于URL上的{参数}
  - RequestParam用于接收普通表单范式或者ajax模拟表单提交的参数数据
- **@RequestBody**

RequestBody注解功能和RequestParam差不多一样，但是真正的意义在于能够使用对象或者嵌套对象接收前端数据。RequestParam只能接收平面的、一对一的参数。

### 常用注解开发RESTful接口

- 定义资源（对象）

  - @Builder为我们提供了通过对象属性的链式赋值构建对象的方法
  - @Data注解帮我们定义了一系列常用方法，如：getters、setters、hashcode、equals等

- HTTP方法与Controller

  - 增加一篇Article，使用POST方法

    - POST请求，请求体传JSON对象（使用**@RequestBody**）

    ```java
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article, @RequestHeader String aaa){}
    ```

    - POST求情，传递键值对参数（使用**@RequestParam**）

    ```java
    @PostMapping("/articles")
    public AjaxResponse saveReader(@RequestParam String name, @RequestParam Integer age) {}
    ```

    

  - 删除一篇Article，使用DELETE方法，参数是id

    - DELETE请求，传递路径参数

    ```java
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {}
    ```

    

  - 更新一篇Article，使用PUT方法，以id为主键进行更新

    - PUT请求 传递JSON请求体参数

    ```java
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {}
    ```

    - 

  - 获取一篇Article，使用GET方法

    - GET请求，根据路径参数取对象

    ```java
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id){} 
    ```

### JSON和数据处理与Postman测试

- FastJSON、Gson和Jackson对比

  - 开源的Jackson：SpringBoot默认是使用Jackson作为JSON数据格式处理的类库，Jackson在各方面都比较优秀，所以不建议将Jackson替换为Gson或fastjson。

  - Google的Gson：Gson是Google为满足内部需求开发的JSON数据处理类库，其核心结构非常简单，toJson与fromJson两个转换函数实现对象与JSON数据的转换

  - 阿里巴巴的FastJson：Fastjson是阿里巴巴开源的JSON数据处理类库，其主要特点是序列化速度快。当并发数据量越大的时候，越能体现出fastjson的优势。但选择JSON处理类库，快并不是唯一需要考虑的因素，与数据库或磁盘IO相比，JSON数据序列化与反序列化的这点时间还不足以对软件性能产生比较大的影响

    > fastjson为人诟病的问题：：虽然fastjson速度上有一定的优势，但是其为了追求速度，很大程度放弃了JSON的规范性。因此时不时在有些版本中暴露安全问题。所以用不用fastjson在国内软件界还是有争议的，在国外基本没人用

  > 性能比较：关于这三个类库的性能测试（截止2019年11月20日）总结如下：序列化过程性能：fastjson>=jackson>Gson反序列化性能：三者几乎不相上下。

- 在Spring中注解方法使用Jackson

  - 序列化和反序列化
    - 反序列化：在客户端将请求数据上传到服务端的时候，自动的处理JSON数据对象中的字符串、数字，将其转换为包含Date类型、Integer等类型的对象
    - 序列化：按照指定的格式、顺序等将实体类对象转换为JSON字符串
  - Jackson常用注解
    - @JsonPropertyOrder(value={"pname1","pname2"})改变子属性在JSON序列化中的默认定义的顺序。如：param1在先，param2在后。
    - @JsonIgnore加在属性上面，排除某个属性不做序列化与反序列化
    - @JsonIgnoreProperties(ignoreUnknown=true)，将这个注解写在类上之后，就会忽略JSON字符串中存在，但实体类不存在的属性，不予赋值，也不会出现异常。
    - @JsonIgnoreProperties({"xxx","yyyy"})忽略某些属性不进行序列化
    - @JsonProperty(anotherName)为某个属性换一个名称，体现在JSON数据里面
    - @JsonInclude(JsonInclude.Include.NON_NULL)排除为空的元素不做序列化反序列化
    - @JsonFormat(pattern="yyyy-MM-ddHH:mm:ss",timezone="GMT+8")指定日期类型的属性格式

- 手动数据转换

```java
//jackson的ObjectMapper 转换对象
ObjectMapper mapper=new ObjectMapper();
//将某个java对象转换为JSON字符串
String jsonStr=mapper.writeValueAsString(javaObj);
//将jsonStr转换为Demo类的对象
Demo demo=mapper.readValue(jsonStr, Demo.class)
```

当JSON字符串代表的对象的字段多于类定义的字段时，使用readValue会抛出UnrecognizedPropertyException异常。在类的定义处加上@JsonIgnoreProperties(ignoreUnknown=true)可以解决这个问题。

### Jackson全局配置

- 配置文件的方式

```yml
spring:  
jackson:
	#日期类型格式化    
    	date-format: yyyy-MM-dd HH:mm:ss    
        serialization:
		#格式化输出，通常为了节省网络流量设置为false。因为格式化之后会带有缩进，方便阅读。      
    	indent_output: false
        #某些类对象无法序列化的时候，是否报错
        fail_on_empty_beans: false
           #设置空如何序列化，⻅下文代码方式详解
        defaultPropertyInclusion: NON_EMPTY
        deserialization:
		#json对象中有不存在的属性时候，是否报错 
    	fail_on_unknown_properties: false    
    	parser:
		#允许出现特殊字符和转义符    
    	allow_unquoted_control_chars: true
    	#允许出现单引号      
    	allow_single_quotes: truw
```

- 通过代码的方式

```java
   @Bean
    @Primary
    @ConditionalOnMissingBean(jacksonObjectMapper.class)
    public jacksonObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        // 通过该方法对mapper对象进行设置，所有序列化的对象都将按改规则进行系列化
        // Include.Include.ALWAYS 默认
        // Include.NON_DEFAULT 属性为默认值不序列化
        // Include.NON_EMPTY 属性为空（""）或者为 NULL 都不序列化，则返回的json是没有这个字段的。这样对移动端会更省流量
        // Include.NON_NULL 属性为NULL 不序列化
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许出现特殊字符和转义符
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        // 允许出现单引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 字段保留，将null值转为""
        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer< Object >()
        {
            @Override
            publicvoidserialize(Object o,
                    JsonGenerator jsonGenerator,
                    SerializerProvider serializerProvider) throwsIOException
            {
                jsonGenerator.writeString("");
            }
        });
        return objectMapper;
    }
```

方式一更容易，方式二更灵活,方式一无法解决的问题，可以尝试使用方式二。

### 使用Mockito编码完成接口测试

- 编码实现接口测试

  > 在做系统⾃动化持续集成的时候，会要求⾃动做单元测试，只有所有的单元测试都跑通了，才 能打包构建。⽐如：使⽤maven在打包之前将所有的测试⽤例执⾏⼀遍。这⾥重点是⾃动化，所以 Postman这种⼯具很难插⼊到持续集成的⾃动化流程中去。

  


- Mockito测试框架

  > Mockito框架可以创建和配置mock对象，使⽤Mockito简化了具有外部依赖的类的测试开发。 Mockito测试框架可以帮助我们模拟HTTP请求，从⽽达到在服务端测试⽬的。 因为其不会真的发送HTTP请求，只是模拟，从⽽节省了HTTP请求的⽹络传输，测试速度更快

- 真实Servlet容器环境下的测试

  - @SpringBootTest 注解

    > 是⽤来创建Spring的上下⽂ApplicationContext，保证测试在上下⽂环境⾥运⾏。单独使⽤ @SpringBootTest不会启动servlet容器。所以只是使⽤SpringBootTest 注解，不可以使⽤ @Resource和@Autowired等注解进⾏bean的依赖注⼊。（准确的说是可以使⽤，但被注解的 bean为null）。

  - @ExtendWith(@RunWith注解)

    > - RunWith⽅法为我们构造了⼀个的Servlet容器运⾏运⾏环境，并在此环境下测试。然⽽为什么 要构建servlet容器？因为使⽤了依赖注⼊，注⼊了MockMvc对象，⽽在上⼀个例⼦⾥⾯是我们 ⾃⼰new的。 ⽽- 
    > - @AutoConfigureMockMvc注解，该注解表示mockMvc对象由spring 依赖注⼊构建，你只 负责使⽤就可以了。这种写法是为了让测试在servlet容器环境下执⾏。

**如果你单元测试代码使⽤了“依赖注⼊@Resource”就必须加上@ExtendWith，如果你 不是⼿动new MockMvc对象就加上@AutoConfigureMockMvc**

使⽤@WebMvcTest替换@SpringBootTest

- @SpringBootTest注解告诉SpringBoot去寻找⼀个主配置类(例如带有 @SpringBootApplication的配置类)，并使⽤它来启动Spring应⽤程序上下⽂。 SpringBootTest加载完整的应⽤程序并注⼊所有可能的bean，因此速度会很慢。 @WebMvcTest注解主要⽤于controller层测试，只覆盖应⽤程序的controller层， 
- @WebMvcTest(ArticleController.class)只加载ArticleController这⼀个Bean⽤作测试。所以 WebMvcTest要快得多，因为我们只加载了应⽤程序的⼀⼩部分。

#### MockMvc更多的⽤法总结

```java
//模拟GET请求：
mockMvc.perform(MockMvcRequestBuilders.get("/user/{id}", userId));
//模拟Post请求：
mockMvc.perform(MockMvcRequestBuilders.post("uri", parameters));
//模拟⽂件上传：
mockMvc.perform(MockMvcRequestBuilders.multipart("uri").file("fileName",
"file".getBytes("UTF-8")));
//模拟session和cookie：
mockMvc.perform(MockMvcRequestBuilders.get("uri").sessionAttr("name",
"value"));
mockMvc.perform(MockMvcRequestBuilders.get("uri").cookie(new
Cookie("name", "value")));
//设置HTTP Header：
mockMvc.perform(MockMvcRequestBuilders
                       .get("uri", parameters)
                       .contentType("application/x-www-form-urlencoded")
                       .accept("application/json")
                       .header("", ""));
```

### Swagger3即OpenAPI使⽤

- Swagger优点
  - 代码变，⽂档变。只需要少量的注解，Swagger 就可以根据代码⾃动⽣成 API ⽂档，很好的保 证了⽂档的时效性。 
  - 跨语⾔性，⽀持 40 多种语⾔。
  - Swagger UI 呈现出来的是⼀份可交互式的 API ⽂档，我们可以直接在⽂档⻚⾯尝试 API 的调 ⽤，省去了准备复杂的调⽤参数的过程。 
  - 还可以将⽂档规范导⼊相关的⼯具（例如 SoapUI）, 这些⼯具将会为我们⾃动地创建⾃动化测试。