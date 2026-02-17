package com.platform.backend.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import io.restassured.RestAssured;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HealthApiTest {

  @LocalServerPort
  private int port;

  @BeforeEach
  void setUp() {
    RestAssured.baseURI = "http://localhost";
    RestAssured.port = port;
  }

  @Test
  void healthEndpoint_returnsUp() {
    given()
      .when()
      .get("/api/v1/health")
      .then()
        .statusCode(200)
        .body("status", equalTo("UP"))
        .body("service", not(emptyOrNullString()))
        .body("timestamp", not(emptyOrNullString()));
  }
}
