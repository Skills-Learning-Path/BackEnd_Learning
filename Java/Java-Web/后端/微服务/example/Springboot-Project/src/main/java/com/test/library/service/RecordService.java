package com.test.library.service;

import com.alibaba.fastjson.JSONObject;
import com.test.library.mapper.RecordMapper;
import com.test.library.pojo.Book;
import com.test.library.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class RecordService {
    @Autowired
    RecordMapper recordMapper;

//    @GetMapping("/record")
    public String query(){
        List<Record> records = recordMapper.query();
        return JSONObject.toJSONString(records);
    }

//    @DeleteMapping("/record/{id}")
    public String delete(@PathVariable int id){
        int status = recordMapper.remove(id);
        JSONObject result = new JSONObject(true);
        result.put("status",status);
        return result.toString();
    }
}
