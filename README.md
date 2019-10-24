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


## 部署方式
### 自动部署（推荐）
1. 开发环境搭建 https://docs.google.com/document/d/1urs_C8vZHjT7qsCIQZnPAzvPSZ0Hy4-X5UXz95RiGPc/edit#
2. 启动项目 docker-compose up -d（由于要下载镜像和maven依赖，时间可能较久）
3. 访问地址:
    访问前端页面 http://localhost/
    访问接口页面 http://localhost/media/swagger-ui.html#/dashboard
    测试rabbitmq接口 http://localhost/media/v1/rabbit/send
4. 监控管理
    rabbitmq 管理页面 http://localhost:15672  (username:guest password:guest)
    druid monitor 管理页面 http://localhost/media/druid/login.html (username:admin password:admin)
    
### 手动部署

