# spring-cloud-gateway 网关服务  
gateway不可与 spring-boot-starter-web一起 否则会报错 因为gateway采用异步非阻塞也就是webflux 基于Netty，与阻塞的web servlet不兼容。  
为何采用gateway，因为zuul2一直跳票的原因导致spring自己开发了gateway，虽然zuul2开源了，但是spring官方目前并没有整合zuul2的打算。
直到现在G版依然采用的是zuul1.x。所以在性能方面及异步非阻塞等方面考虑采用gateway要优于zuul，除非cloud整合zuul2。  
swagger文档不支持webflux项目，所以Gateway里不能配置SwaggerConfig，也就是说Gateway无法提供自身API。  
由于gateway采用异步驱动，所以异常这块也重新写了一套针对于gateway的全局异常