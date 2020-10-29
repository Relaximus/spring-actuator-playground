package com.relaximus.actuatortest;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {
    @GetMapping("/push-log")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Timed(extraTags = { "demo-tag", "test-val" })
    public void pushLog() {
        log.debug("This is a debug log from DemoController");
    }
}
