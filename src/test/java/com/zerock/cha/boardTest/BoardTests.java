package com.zerock.cha.boardTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.zerock.cha.mappers.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardTests {

    @Autowired
    BoardMapper boardMapper;
    
    @Test
    public void date(){
        log.info(boardMapper.timeTest());
    }
}
