package ru.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@ControllerAdvice
public class TestControllerAdvice {

    private final ObjectMapper jsonObjectMapper;

    public TestControllerAdvice(ObjectMapper jsonObjectMapper) { this.jsonObjectMapper = jsonObjectMapper; }

    @ModelAttribute("test")
    public Test getTestRequestPathVariable(@PathVariable String test) throws JsonProcessingException {
        log.info("Test request: {}", test);
        return jsonObjectMapper.readValue(test, Test.class);
    }
}
