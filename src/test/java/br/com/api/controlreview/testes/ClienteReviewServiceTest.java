package br.com.api.controlreview.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.api.controlreview.domain.ClienteReview;
import br.com.api.controlreview.service.ClienteReviewService;

class ClienteReviewServiceTest {
	
	ClienteReview cliente;
	ClienteReviewService serviceCliente;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(serviceCliente.cadastro(cliente), cliente);
	}

}
