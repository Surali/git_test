package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitTestApplicationTests {

    @Test
    void contextLoads() {
        int b=8;
        int a=6;
        int c=a+b;
        int d=4;
        System.out.println(c);
    }

}
