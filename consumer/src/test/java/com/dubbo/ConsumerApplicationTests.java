package com.dubbo;

import com.dubbo.service.consumerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConsumerApplicationTests {

    @Autowired
    com.dubbo.service.consumerService consumerService;
    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        consumerService.hello();
    }

}
