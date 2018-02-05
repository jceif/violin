package cn.myviolin.db.base;


import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.support.DaoSupport;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author liuzh_3nofxnp
 * @since 2015-09-06 21:53
 */
public interface BaseViolinMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
