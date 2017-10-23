package com.magic.happypi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.magic.happypi.*.mapper")
@MapperScan("com.magic.happypi")
public class HappypiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappypiWebApplication.class, args);
	}
}
