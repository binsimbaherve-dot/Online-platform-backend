package com.platform.backend.api.tests; // package path for this test

import org.junit.jupiter.api.Test; // JUnit 5 test annotation

import org.springframework.beans.factory.annotation.Autowired; // allows Spring to inject MockMvc
import org.springframework.boot.test.context.SpringBootTest; // boots up the Spring app for testing
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;

import org.springframework.test.web.servlet.MockMvc; // Spring MVC test client

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // build GET requests
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; // assert response body
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; // assert HTTP status

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // start app on a random port for the test
@AutoConfigureMockMvc // enable MockMvc auto-configuration (Boot 4 package)
class HelloSmokeTest { // test class

    @Autowired // inject MockMvc test client
    private MockMvc mockMvc; // MockMvc instance

    @Test // marks this method as a test
    void helloEndpoint_shouldReturnHelloWorld() throws Exception { // test method
        mockMvc.perform(get("/api/v1/hello")) // call GET /hello
                .andExpect(status().isOk()) // expect 200 OK
                .andExpect(content().string("Hello World")); // expect exact response body
    }
}
