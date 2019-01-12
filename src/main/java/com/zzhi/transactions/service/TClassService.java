package com.zzhi.transactions.service;


import com.zzhi.transactions.dao.CalssDao;
import com.zzhi.transactions.entity.TClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

;

@Service("classService")
public class TClassService {

    @Autowired
    private CalssDao calssDao;

    public TClass get(TClass tClass)
    {
        TClass tClass1= calssDao.selectOne(tClass);
        return tClass1;
    }

    @Transactional()
    public int update(TClass tClass)
    {
        int num=calssDao.update(tClass);
        //System.out.println(1/0);
        return num;
    }
}
