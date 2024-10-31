package pruebas.tecnicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pruebas.tecnicas")
public class PruebaScotiabankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaScotiabankApplication.class, args);
	}

}
