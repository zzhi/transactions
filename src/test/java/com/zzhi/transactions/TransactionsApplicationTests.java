package com.zzhi.transactions;

import com.alibaba.fastjson.JSONObject;
import com.zzhi.transactions.entity.TClass;
import com.zzhi.transactions.entity.Teacher;
import com.zzhi.transactions.service.JtaTestService;
import com.zzhi.transactions.service.TClassService;
import com.zzhi.transactions.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionsApplicationTests {

    private static final Logger loger = LoggerFactory.getLogger(TransactionsApplicationTests.class);

    @Autowired
    private TClassService  tClassService;

    @Autowired
    private TeacherService teacherService;


    @Autowired
    private JtaTestService jtaTestService;
    @Test
    public void contextLoads() {

        TClass tClass=new TClass();
        tClass.setId("1");
        tClass=  tClassService.get(tClass);
        tClass.setName("zzhi3");


        Teacher teacher=new Teacher();
        teacher.setId("1");
        teacher=  teacherService.get(teacher);
        teacher.setName("zzhi3");

        jtaTestService.tractionTest(tClass,teacher);


        tClass=  tClassService.get(tClass);
        teacher=  teacherService.get(teacher);

        loger.info("班级{}",JSONObject.toJSONString(tClass));
        loger.info("老师{}",JSONObject.toJSONString(teacher));

    }

}

