package com.zzhi.transactions.dao;

import com.zzhi.transactions.dao.base.BaseDao;
import com.zzhi.transactions.entity.TClass;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CalssDao extends BaseDao {

    @Resource
    public void setsystemSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
