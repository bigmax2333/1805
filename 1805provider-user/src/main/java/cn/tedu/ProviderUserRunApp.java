package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//表示这个服务是一个Eureka客户端程序
@SpringBootApplication
public class ProviderUserRunApp {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserRunApp.class, args);

	}

}
