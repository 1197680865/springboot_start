package com.sutpc.bjfy.traffice_survey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//配置Mapper接口的扫描路径
@MapperScan("com.sutpc.bjty.traffice_survey.mapper")
public class TrafficeSurveyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrafficeSurveyApplication.class, args);
    }

}
