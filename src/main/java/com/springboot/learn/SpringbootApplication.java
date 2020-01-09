package com.springboot.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@RequestMapping("/rest")
	@ResponseBody
	public Map<String,Object> rest(){

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("A",123);
		map.put("B","abc");

		return map;

	}
}
