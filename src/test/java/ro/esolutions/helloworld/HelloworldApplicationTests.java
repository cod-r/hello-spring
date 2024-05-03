package ro.codr.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import ro.codr.helloworld.controller.HomeController;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloworldApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HomeController homeController;

    @Test
    void contextLoads() {
        assertThat(homeController).isNotNull();
    }

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                // .andExpect(content().string(equalTo("Hello World!")));
                .andExpect(content().string(equalTo("iship")));
    }
}
