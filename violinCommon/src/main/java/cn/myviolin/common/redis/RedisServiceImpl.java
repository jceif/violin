package cn.myviolin.common.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


import javax.annotation.Resource;

/**
 * Created by jc on 2018/2/26 11:29
 * description ${请描述一下吧}
 */
public class RedisServiceImpl implements IRedisService {
    @Resource
    private JedisPool jedisPool;


    public boolean put(String key, Object value) {
        boolean result=false;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value.toString());
            result= true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("写缓存出错啦····"+e.toString());
            new RuntimeException("写缓存出错啦····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return result;
    }

    public boolean put(String key, Object value,int expire) {
        boolean result=false;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value.toString());
            jedis.expire(key,expire);
            result= true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("写缓存出错啦····"+e.toString());
            new RuntimeException("写缓存出错啦····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return result;
    }


    public Object get(String key) {
        Jedis jedis = null;
        String content=null;
        try {
            jedis = jedisPool.getResource();
            content= jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace();
            System.out.println("读Redis缓存出错啦"+e);
            new RuntimeException("读Redis缓存出错啦····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return content;
    }


    public boolean remove(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.del(key);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("删缓存出错啦····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return false;
    }


    public boolean keyExist(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.exists(key);
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("redis keyExist Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return false;
    }



    public long lpush(String key) {
        long lenght=0;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            for(int i=10000;i<100000;i++){
                lenght+= jedis.lpush(key,String.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("lpush Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return lenght;
    }


    public String lpop(String key) {
        String value="nil";
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            value=jedis.lpop(key);
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("lpop Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return value;
    }


    public long rpush(String key) {
        long lenght=0;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            for(int i=100000;i<1000000;i++){
                lenght+= jedis.rpush(key,String.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("rpush Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return lenght;
    }


    public String rpop(String key) {
        String value="nil";
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            value=jedis.rpop(key);
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("rpop Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return value;
    }

    public long incr(String key) {
        long value=0;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            if(!jedis.exists(key))jedis.set(key,"0");
            value=jedis.incr(key);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("incr Exception····"+e);
            new RuntimeException("incr Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return value;
    }


    public long decr(String key) {
        long value=0;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            value=jedis.incr(key);
        } catch (Exception e) {
            e.printStackTrace();
            new RuntimeException("decr Exception····");
        } finally {
            jedisPool.returnResource(jedis);
        }
        return value;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }
}
