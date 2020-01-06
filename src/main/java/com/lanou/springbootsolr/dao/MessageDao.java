package com.lanou.springbootsolr.dao;

import com.lanou.springbootsolr.bean.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MessageDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Message> solr(){
        String sql = "select id, from_id fromId, to_id toId, subject, content, createtime, status, attachment from message";
   return  jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Message.class));
    }
}
