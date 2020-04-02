
package br.com.search.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewsApplication {
	
	public static void main(final String[] args) {
		SpringApplication.run(NewsApplication.class, args);
	}
}
