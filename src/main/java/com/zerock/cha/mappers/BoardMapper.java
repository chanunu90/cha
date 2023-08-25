package com.zerock.cha.mappers;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper {

    @Select("select now()")
    String timeTest();
    
}
