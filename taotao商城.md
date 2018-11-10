### taotao商城项目
>   网上的一个很常见的项目，为提升个人编码能力，决定将此项目用idea
>   重新写出来。

*   项目基本情况
*   开发环境：idea开发，jdk1.8，maven-3.5
*   Spring+SpringMVC+Mybatis


###第一天
>   项目基本基本构建

项目基础框架

    taotao-parent
        taotao-common   工具类
        taotao-manager  
            taotao-manager-pojo 实体类
            taotao-managet-mapper   实体映射
            taotao-manager-service  业务逻辑层
            taotao-manager-web      业务表现层（war）
    
    
###   第二天
 -  框架整合Spring+SpringMVC+Mybatis
 -  sql脚本创建数据库
 -  使用mybatis的逆向工程生成代码
 -  商品列表功能实现
 
 #####1. Spring+SpringMVC+Mybatis框架整合
    applicationContext-dao.xml
    applicationContext-service.xml
    applicationContext-trans.xml
    springmvc.xml 



### 三、后台商品添加
```
商品分类选择；
商品图片上传
    安装nginx，在线安装vsftp，配置ftp服务
使用富文本编辑器
实现商品的添加
以及修改/删除；
```
>  