package com.hwan.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
		System.out.println("hello world 입니다");
		System.out.println("master 변경됐습니다");
		System.out.println("git Action test");
		System.out.println("git Action test again");
	}

}
