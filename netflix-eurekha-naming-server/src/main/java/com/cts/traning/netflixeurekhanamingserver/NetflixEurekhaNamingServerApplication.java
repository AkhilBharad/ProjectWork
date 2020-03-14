package com.cts.traning.netflixeurekhanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekhaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekhaNamingServerApplication.class, args);
	}

}
