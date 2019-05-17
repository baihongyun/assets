package com.zoctan.api;

import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AssetsControllerTest extends BaseControllerTest{
    private final String resource="/assets";

    public void getAssets() throws Exception() {
        this.mockMvc.perform(
                get(this.url + this.resource +"/list")
                        .param(page,1)
                        .param(size,5))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andReturn();
    }
}
