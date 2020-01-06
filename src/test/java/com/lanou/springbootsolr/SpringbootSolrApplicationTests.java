package com.lanou.springbootsolr;

import com.lanou.springbootsolr.bean.Message;
import com.lanou.springbootsolr.dao.MessageDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootSolrApplicationTests {
   @Autowired
   private MessageDao messageDao;

   @Test
   public  void testMysql(){
       List<Message> solr = messageDao.solr();
       Assertions.assertNotNull(solr);
       Assertions.assertTrue(solr.size()>0);

   }

}
