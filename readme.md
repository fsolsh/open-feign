SpringCloud OpenFeign with Alibaba Nacos

demo-feign是一个基于SpringCloud OpenFeign并使用Alibaba Nacos作为服务注册发现的Demo Project

1、项目结构

    demo-feign
        --server(http service provider)
            application.yml(set server port and the nacos registry address)
            pom.xml(starter-web, openFeign, nacos)
        --client(http service consumer)
            application.yml(set server port and the nacos registry address)
            pom.xml(starter-web, openFeign, nacos, loadbalancer, hystrix)