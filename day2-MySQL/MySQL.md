### MySQL连接

mysql -u用户名 -p密码 [-h数据库服务器IP地址 -P端口号]

### SQL语句分类
DDL definition
DML manipulation
DQL query
DCL control

### SQL表操作

#### （1）创建

```sql
create table 表名(
	字段1  字段1类型 [约束]  [comment  字段1注释 ],
	字段2  字段2类型 [约束]  [comment  字段2注释 ],
	......
	字段n  字段n类型 [约束]  [comment  字段n注释 ] 
)[ comment  表注释 ] ;
```

