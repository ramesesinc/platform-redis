/*
 * MemcachedCacheProvider.java
 *
 * Created on February 9, 2013, 10:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.rameses.osiris3.redis;

import com.rameses.osiris3.xconnection.XConnection;
import com.rameses.osiris3.xconnection.XConnectionProvider;
import java.util.Map;

/**
 *
 * @author Elmo
 */
public class RedisCacheProvider extends XConnectionProvider {
    
    private final static String KEY_NAME = "redis-cache"; 
    
    public String getProviderName() {
        return KEY_NAME; 
    }

    public XConnection createConnection(String name, Map conf) {
        return new RedisCache(name, conf);
    }    
}
