package com.example.demoSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Hello World";
	}

	@GetMapping("/message")
	public String message(@RequestParam(value = "text", defaultValue="123") String text){
		String content = "";
		for(int i=0; i<10; i++){
			content = content + text + "<br/>";
		}
		return "Message: " + content;
	}

}


