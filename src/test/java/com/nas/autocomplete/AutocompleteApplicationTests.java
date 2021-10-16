package com.nas.autocomplete;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.nas.autocomplete.restservice.AutocompleteTitleController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class AutocompleteApplicationTests {

    @LocalServerPort
    private int port;
    
    @Autowired
    private AutocompleteTitleController controller;
    
    @Autowired
    private TestRestTemplate restTemplate;
    
	@Test
	void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
	
   @Test
    public void searchUsingWildcard() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/autocomplete&searchString=Arriving", String.class)).contains("Arriving");
    }

}
