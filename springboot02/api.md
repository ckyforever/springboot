### 接口文档
#### 查询接口
+ 接口路径 `/selectAllUser`
+ 响应参数

|参数名|参数说明|备注|
|---- |-----|----|
|id   |用户Id |    |
|name |用户姓名|    |
|age  |用户年龄|       | 
+ 响应数据
```json
[{"id":1,"name":"wap","age":21}]
```
![springboot02selectAllUser](https://cdn.jsdelivr.net/gh/ckyforever/note_picture@master/20210803/springboot02selectAllUser.mybqh21f95c.png)

#### 插入接口
+ 接口路径 `/insertUser`
+ 参数列表

| 参数名   | 参数说明     | 备注     |
| --------| -----------| -------- |
| name    | 用户姓名    | 可以为空   |
| age     | 用户年龄     | 不能为空 |
+ 响应参数 `int (更改数据条数)`
  ![springboot02insertUser](https://cdn.jsdelivr.net/gh/ckyforever/note_picture@master/20210803/springboot02insertUser.7dytnzaehnk.png)

### 数据库 user表
![mysqlUser](https://cdn.jsdelivr.net/gh/ckyforever/note_picture@master/20210803/mysqlUser.2mye2liw7vk0.png)
![mysqlDesign](https://cdn.jsdelivr.net/gh/ckyforever/note_picture@master/20210803/mysqlDesign.1f3wx47ltzcw.png)