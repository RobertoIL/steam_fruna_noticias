package com.modulo.steam_fruna_noticias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.modulo.steam_fruna_noticias")
public class SteamFrunaNoticiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteamFrunaNoticiasApplication.class, args);
	}

}
