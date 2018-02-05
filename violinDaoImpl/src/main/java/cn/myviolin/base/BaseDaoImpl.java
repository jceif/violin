package cn.myviolin.base;

import cn.myviolin.db.base.BaseViolinMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * Created by jc on 2018/2/3 17:44
 * description ${请描述一下吧}
 */
public abstract  class BaseDaoImpl extends SqlSessionDaoSupport  {
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
