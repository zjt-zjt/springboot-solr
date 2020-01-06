package com.lanou.springbootsolr.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
public class Message {
    private Integer id;
    private Integer fromId;
    private Integer toId;
    private String subject;
    private String content;
    private Date createtime;
    private Integer status;
    private String attachment;


}
