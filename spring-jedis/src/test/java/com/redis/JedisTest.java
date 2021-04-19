package com.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @ClassName: JedisTest
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/24 16:04
 * @Version 1.0
 **/
public class JedisTest {

    @Test
    public void test(){
        Jedis jedis = new Jedis("localhost", 6379);

        //redis 对字符串的操作
        jedis.set("jedisTest","jedistest_Value");
        String value = jedis.get("jedisTest");
        System.out.println("value = " + value);


        //redis 操作hash  may - key -value
        jedis.hset("hashTest","name","lisi");
        jedis.hset("hashTest","age","23");
        jedis.hset("hashTest","sex","男");

        String name = jedis.hget("hashTest", "name");
        String age = jedis.hget("hashTest", "age");
        String sex = jedis.hget("hashTest", "sex");

        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);


        jedis.close();
    }
}
