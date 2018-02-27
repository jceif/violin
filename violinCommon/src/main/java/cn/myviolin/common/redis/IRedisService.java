package cn.myviolin.common.redis;

/**
 * Created by jc on 2018/2/27 16:13
 * description ${请描述一下吧}
 */
public interface IRedisService {
    boolean put(String key, Object value);

    boolean put(String key, Object value, int expire);

    Object get(String key);

    boolean remove(String key);

    boolean keyExist(String key);

    long lpush(String key);

    long incr(String key);

    long decr(String key);

}
