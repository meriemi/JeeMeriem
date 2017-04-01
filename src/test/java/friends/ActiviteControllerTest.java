package friends;

import friends.service.InitialisationService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Mes documents on 01/04/2017.
 */

@WebMvcTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc

public class ActiviteControllerTest{

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Bootstrap bootstrap;

    @Test
    public void testGetActivites() throws Exception{
        when(bootstrap.getInitialisationService()).thenReturn(new InitialisationService());
        mockMvc.perform(get("/activities"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html;charset=UTF-8"))
                .andExpect(view().name("activities"))
                 .andDo(print());
    }
}


