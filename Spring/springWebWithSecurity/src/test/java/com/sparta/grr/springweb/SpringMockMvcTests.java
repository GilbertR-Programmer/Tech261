package com.sparta.grr.springweb;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringMockMvcTests {


    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                                    .apply(SecurityMockMvcConfigurers.springSecurity())
                                    .build();
    }

    @Test
    void testWelcomePage() throws Exception {
        String content = mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andReturn()
                .getResponse()
                .getContentAsString();

        MatcherAssert.assertThat(content, containsString("Welcome"));
        System.out.println(content);
    }

    @Test
    void testWelcomeExpectations() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("Welcome")));

    }

    @Test
    void testHasDate() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attributeExists("date"));
    }

    @Test
    void testHasCorrectHeader() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.header().exists("Content-Type"));
    }

    @Test
    @WithMockUser(username = "user", roles = "USER")
    void testAuthorsPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/authors"))
                .andDo(MockMvcResultHandlers.print());
    }

}
