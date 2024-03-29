package com.test.cloudvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class CloudVaultDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudVaultDemoApplication.class, args);
		
	}

}
