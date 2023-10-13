package io.slurm.cources.currency;

import io.slurm.cources.currency.config.CurrencyClientCfg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CurrencyClientCfg.class)
public class CurrencyRateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyRateApplication.class, args);
	}

}
