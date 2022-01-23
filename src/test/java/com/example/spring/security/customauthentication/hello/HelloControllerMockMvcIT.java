package com.example.spring.security.customauthentication.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerMockMvcIT
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Autowired
    private MockMvc mockMvc;

    // ============================== [Unit Tests] ==============================

    // -------------------- [Test Helper Classes] --------------------

    // -------------------- [Test Helper Methods] --------------------

    // -------------------- [Test Initialization] --------------------

    // -------------------- [Tests] --------------------

    // Caution: The following unit test mocks the basic http authentication (@WithMockUser). Thus the custom authentication provider
    //          will not be invoked!!!
    @Test
    @WithMockUser(username = "user",
                  password = "password")
    void getTestWithMockedUser() throws Exception
    {
        this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk());
    }

    // Hint: The following unit test invokes the custom authentication provider.
    @Test
    void getTestBasicAuthN() throws Exception
    {
        this.mockMvc.perform(get("/hello").with(httpBasic("user", "password"))).andDo(print()).andExpect(status().isOk());
    }
}
