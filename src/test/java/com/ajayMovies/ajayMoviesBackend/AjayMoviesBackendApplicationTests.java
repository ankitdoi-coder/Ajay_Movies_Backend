package com.ajayMovies.ajayMoviesBackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
    "jwt.secret=test_secret_key_must_be_long_enough_for_security_algorithm_123",
    "file.upload-dir=test-uploads",
    "app.cors.origins=http://localhost:4200"
})
class AjayMoviesBackendApplicationTests {

	@Test
	void contextLoads() {
	}

}
