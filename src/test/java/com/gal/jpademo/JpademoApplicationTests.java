package com.gal.jpademo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
class JpademoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	TeaService teaService;

	@Test
	void test_getTea() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/tea")).andExpect(status().isOk());
	}

}
