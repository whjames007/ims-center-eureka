package com.changiny.ims.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ImsCenterEurekaApplication {

	private static Logger logger = LoggerFactory.getLogger(ImsCenterEurekaApplication.class);
	private static String name = "Eureka注册中心";

	public static void main(String[] args) {
		SpringApplication.run(ImsCenterEurekaApplication.class, args);
		logger.info("【{}】【微服务启动成功】", name);
	}

}
