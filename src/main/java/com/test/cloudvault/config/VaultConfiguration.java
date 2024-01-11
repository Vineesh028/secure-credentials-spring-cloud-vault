package com.test.cloudvault.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Configuration
@Getter
public class VaultConfiguration {
	
    @Value("${password}")
    public String password;
    
}