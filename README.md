# 仿真快照系统
## 后台接口
### 框架
1. springboot系列 mybatis-plus swagger2
2. migration: flyway。   （db文件在resources/db/migration中）


### 启动
启动前：
1. 请先安装lombok插件，并且在File | setting | Build Execution, Deployment | 
Compiler | Annotation Processor 中将enable annotation processor 勾上
2. 请在resources/application.dev.yml中填写你的配置信息

启动:

目前只在Sys模块写了个demo,直接运行SysApplication.java

运行后:

1. 访问 (localhost:8080/durid) 访问durid监控页面
2. 访问 (localhost:8080/swagger-ui.html) 访问接口页面

## 后台页面
### 框架
1. vue系列 + element ui

### 启动
启动前: 
1. 安装node

启动:
1. npm i
2. npm run dev
3. 打开浏览器访问http://localhost:9527



