package com.itjyh.testgraal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestgraalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestgraalApplication.class, args);
    }

    @GetMapping("/")
    public void HelloFib() {
        long startTime = System.currentTimeMillis();
        int n = 30;
        int result = fibonacci(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("time：" + (endTime - startTime) + "ms");
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
