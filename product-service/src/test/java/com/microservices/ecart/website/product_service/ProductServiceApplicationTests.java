package com.microservices.ecart.website.product_service;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.testcontainers.containers.MySQLContainer;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ProductServiceApplicationTests {

	@Test
	void contextLoad() {
	}

}


//@Import(TestcontainersConfiguration.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ProductServiceApplicationTests {
//
//	@ServiceConnection
//	static MySQLContainer mySQLContainer=new MySQLContainer<>("mysql:3.1");
//
//	@LocalServerPort
//	private Integer port;
//
//	@BeforeEach
//	void setup(){
//		RestAssured.baseURI="http://localhost";
//		RestAssured.port=port;
//	}
//
//	static{
//		mySQLContainer.start();
//		System.setProperty("spring.datasource.url",mySQLContainer.getJdbcUrl());
//		System.setProperty("spring.datasource.username",mySQLContainer.getUsername());
//		System.setProperty("spring.datasource.password",mySQLContainer.getPassword());
//	}
//
//	@Test
//	void shouldCreateProduct() {
//
//		String requestBody= """
//				{
//				    "name":"iPhone 15",
//				    "description":"New model phone from Apple",
//				    "price":75000
//				}
//				""";
//
//		RestAssured.given()
//				.contentType("application/json")
//				.body(requestBody)
//				.when()
//				.post("/api/product/create")
//				.then()
//				.statusCode(201)
//				.body("id", Matchers.notNullValue())
//				.body("name", Matchers.equalTo("iPhone 15"))
//				.body("description", Matchers.equalTo("New model phone from Apple"))
//				.body("price", Matchers.equalTo(75000));
//
//	}

//}
