
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elmo Nazareno
 */
public class TestGetRedis {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool( "localhost", 6379 );
        Jedis jedis = pool.getResource();
        System.out.println("jedis is "+ jedis.get("partner:02602"));
        
        /*
        Object p = jedis.get("rameses.foo");
        System.out.println("data is " + p);
        pool.destroy();
        */            
    }
}
