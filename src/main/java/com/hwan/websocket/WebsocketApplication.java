package com.hwan.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
		System.out.println("hello world 입니다");
		System.out.println("github에서 update를 했습니다");
	}

}
