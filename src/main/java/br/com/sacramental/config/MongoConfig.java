package br.com.sacramental.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.mongodb.MongoClient;

public class MongoConfig {

	@Autowired
	private Environment env;

	public @Bean com.mongodb.client.MongoClient mongoClient() {
		return (com.mongodb.client.MongoClient) new MongoClient(env.getProperty("spring.data.mongodb.authconnection"));
	}	
}
