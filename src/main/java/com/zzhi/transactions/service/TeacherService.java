package com.zzhi.transactions.service;


import com.zzhi.transactions.dao.CalssDao;
import com.zzhi.transactions.dao.TeacherDao;
import com.zzhi.transactions.entity.TClass;
import com.zzhi.transactions.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service("teacherService")
public class TeacherService{


    @Autowired
    private TeacherDao teacherDao;

    //@Transactional(transactionManager = "xatx", propagation = Propagation.REQUIRED, rollbackFor = { java.lang.RuntimeException.class })
    public Teacher get(Teacher teacher)
    {
        Teacher teacher1= teacherDao.selectOne(teacher);
        return teacher1;
    }
    @Transactional()
    public int update(Teacher teacher)
    {
        //System.out.println(1/0);
        int num=teacherDao.update(teacher);
        return num;
    }

}
