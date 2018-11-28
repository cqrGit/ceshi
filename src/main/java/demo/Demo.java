package demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"controller","service"})
@MapperScan("mapper")
public class Demo {
public static void main(String[] args) {
	SpringApplication.run(Demo.class, args);
}
}
