package ru.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{test}")
    private Mono<String> getTestResponse(@ModelAttribute("test") Test test) {
        log.info("Test json: {}", test);
        return Mono.just("ok");
    }
}