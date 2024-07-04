package com.bank.loans;

import com.bank.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.bank.loans.controller") })
@EnableJpaRepositories("com.bank.loans.repository")
@EntityScan("com.bank.loans.model")*/
@EnableDiscoveryClient
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Bank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Vikash Raghuwanshi",
						email = "vrcorpit@gmail.com",
						url = "https://www.bank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.bank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Loans microservice REST API Documentation",
				url = "https://www.bank.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
