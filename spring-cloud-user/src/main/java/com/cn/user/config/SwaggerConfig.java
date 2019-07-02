package com.cn.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chenning
 * @Classname SwaggerConfig
 * @Description swagger 配置
 * @Date 2019/7/2 20:37
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //设置包路径
                .apis(RequestHandlerSelectors.basePackage("com.cn.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("API 接口文档")
                //描述
                .description("文档说明")
                .termsOfServiceUrl("https://github.com/ngcly")
                //创建人
                .contact(new Contact("ngcly", "https://github.com/ngcly", "531237716@qq.com"))
                .version("1.0")
                .build();
    }
}
