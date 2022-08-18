package com.amsidh.mvc;

import com.amsidh.mvc.controller.HelloController;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@SpringBootTest
class SonarQubeExampleApplicationTests {

    private final HelloController helloController;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(helloController);
    }

}
