package duy.onix.onixmovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OnixMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnixMoviesApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Welcome to Onix Movies API";
	}
}
