package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class MyWebApplication {

	@Controller
	public class HelloController {
		@ResponseBody
		@RequestMapping("/hello")
		public String Hello() {
			return "hello world";
		}
	}
	public static void main(String[] args) {
		 SpringApplication.run(MyWebApplication.class, args);

	}

}
