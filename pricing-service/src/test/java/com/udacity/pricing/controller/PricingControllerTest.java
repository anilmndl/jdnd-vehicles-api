package com.udacity.pricing.controller;


import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class PricingControllerTest {

    @Autowired
    private MockMvc mvc;


    @Test
    public void pricing_get_returns_valid_price() throws Exception {
        mvc.perform(get(new URI("/services/price/?vehicleId=1"))
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("[]")
        ).andExpect(status().isOk());
    }

}
