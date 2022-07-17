package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {


    @Bean
    public Board getBoard() {
        return new Board();
    }




}
