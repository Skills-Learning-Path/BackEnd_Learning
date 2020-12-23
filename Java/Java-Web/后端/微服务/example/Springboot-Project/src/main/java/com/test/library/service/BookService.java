package com.test.library.service;

import com.alibaba.fastjson.JSONObject;
import com.test.library.mapper.BookMapper;
import com.test.library.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;
//    @PostMapping("/book")
    public String add(Book book){
        int status = bookMapper.insert(book);
        JSONObject result = new JSONObject(true);
        result.put("data", book);
        result.put("status",status);
        return result.toString();
    }
//    @GetMapping("/book")
    public String query(){
        List<Book> books = bookMapper.selectList(null);
        return JSONObject.toJSONString(books);
    }
//    @PutMapping("/book")
    public String update(Book book){
        int status = bookMapper.updateById(book);
        JSONObject result = new JSONObject(true);
        result.put("data",book);
        result.put("status",status);
        return result.toString();
    }
//    @DeleteMapping("/book/{id}")
    public String delete(@PathVariable int id){
        int status = bookMapper.deleteById(id);
        JSONObject result = new JSONObject(true);
        result.put("status",status);
        return result.toString();
    }
}
