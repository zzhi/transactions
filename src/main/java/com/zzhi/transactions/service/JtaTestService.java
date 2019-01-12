package com.zzhi.transactions.service;


import com.zzhi.transactions.entity.TClass;
import com.zzhi.transactions.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.Map;

@Service("jtaTestService")
public class JtaTestService{

    @Autowired
    private TClassService  tClassService;

    @Autowired
    private TeacherService teacherService;


    @Transactional(transactionManager = "xatx", propagation = Propagation.REQUIRED, rollbackFor = { java.lang.RuntimeException.class })
    public void  tractionTest(TClass tClass, Teacher teacher)
    {
        tClassService.update(tClass);
        System.out.println(1/0);
        teacherService.update(teacher);

    }


}
