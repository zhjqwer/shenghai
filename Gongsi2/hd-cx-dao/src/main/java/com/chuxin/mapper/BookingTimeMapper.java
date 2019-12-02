package com.chuxin.mapper;

import com.chuxin.pojo.BookingTime;
import com.chuxin.pojo.BookingTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookingTimeMapper {
    int countByExample(BookingTimeExample example);

    int deleteByExample(BookingTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookingTime record);

    int insertSelective(BookingTime record);

    List<BookingTime> selectByExample(BookingTimeExample example);

    BookingTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookingTime record, @Param("example") BookingTimeExample example);

    int updateByExample(@Param("record") BookingTime record, @Param("example") BookingTimeExample example);

    int updateByPrimaryKeySelective(BookingTime record);

    int updateByPrimaryKey(BookingTime record);
}