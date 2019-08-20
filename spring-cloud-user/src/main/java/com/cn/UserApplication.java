package com.cn;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenning
 * @Classname UserApplication
 * @Description 用户服务启动类
 * @Date 2019/6/22 15:32
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
//@EnableDistributedTransaction
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
