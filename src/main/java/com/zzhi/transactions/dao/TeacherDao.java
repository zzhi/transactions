package com.zzhi.transactions.dao;

import com.zzhi.transactions.dao.base.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Repository
public class TeacherDao  extends BaseDao {

    @Resource
    public void setBusinessSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
