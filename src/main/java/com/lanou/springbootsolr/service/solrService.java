package com.lanou.springbootsolr.service;


import com.lanou.springbootsolr.dao.MessageDao;
import org.apache.solr.client.solrj.SolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class solrService {
      @Autowired
    private SolrClient solrClient;
       @Autowired
      private MessageDao  messageDao;

       public static final int  BATCH_SIZE = 10;
       public static final String  corename = "lanou3g";







}
