package appcicd.appcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppCicdApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to steph cacd";
	}
	public static void main(String[] args) {
		SpringApplication.run(AppCicdApplication.class, args);
	}

}
