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

#### (2) 插入

insert into 表名（字段列表）values（字段值的列表）

#### (3） 修改

update 表名 set 字段名=字段值，字段名=字段值 [where 条件]

#### (4) 删除

delete from 表名 [where 条件]

### DQL

DQL查询语句，语法结构如下：

```mysql
SELECT
	字段列表
FROM
	表名列表
WHERE
	条件列表
GROUP  BY
	分组字段列表
HAVING
	分组后条件列表
ORDER BY
	排序字段列表
LIMIT
	分页参数
```

