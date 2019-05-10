package com.mySb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration {

	@Override
	public MongoClient mongoClient() {
		return new MongoClient();
	}

	@Override
	protected String getDatabaseName() {		
		return "SSINet";
	}

}
