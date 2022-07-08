package com.example.shixun.mapper;

import com.example.shixun.entity.Book;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Insert("insert into Book ( isbn,book_name,book_publish,book_number,price) values ( #{isbn},#{book_name},#{book_publish},#{book_number},#{price})")
    void insertBook(Book book);

    @Select("Select * from Book")
    List<Book> selectAll();

    @Update("update Book set isbn=#{isbn},book_name=#{book_name},book_publish=#{book_publish},book_number=#{book_number},price=#{price} where id=#{id};")
    void updateB(Book book);

    @Delete(" delete from Book where id=#{id};")
    void delB(Book book);

    @Select(" select * from Book  order by price;")
    List<Book> orderByPrice();
}
