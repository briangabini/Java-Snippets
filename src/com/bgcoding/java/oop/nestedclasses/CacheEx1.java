package com.bgcoding.java.oop.nestedclasses;

import java.util.HashMap;
import java.util.Map;

public class CacheEx1 {

    private Map<String, CacheEntry> cacheMap = new HashMap<String, CacheEntry>();

    private class CacheEntry {
        public long   timeInserted = 0;
        public Object value        = null;
    }

    public void store(String key, Object value){
        CacheEntry entry = new CacheEntry();
        entry.value = value;
        entry.timeInserted = System.currentTimeMillis();
        this.cacheMap.put(key, entry);
    }

    public Object get(String key) {
        CacheEntry entry = this.cacheMap.get(key);
        if(entry == null) return null;
        return entry.value;
    }

}
