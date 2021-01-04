package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q146_LRUCacheTest {





    @Test
    void test1() {
        Q146_LRUCache q146_lruCache = new Q146_LRUCache(2);
        q146_lruCache.put(1,1);
        q146_lruCache.put(2,2);
        q146_lruCache.get(1);
        q146_lruCache.put(3,3);
        assertEquals(q146_lruCache.get(2), -1);
        q146_lruCache.put(4,4);
        assertEquals(q146_lruCache.get(1), -1);
        assertEquals(q146_lruCache.get(3), 3);
        assertEquals(q146_lruCache.get(4), 4);

    }


    @Test
    void test2() {
        Q146_LRUCache q146_lruCache = new Q146_LRUCache(2);
        q146_lruCache.put(2,1);
        q146_lruCache.put(2,2);
        q146_lruCache.get(2);
        q146_lruCache.put(1,1);

        q146_lruCache.put(4,1);
        assertEquals(q146_lruCache.get(2),-1);
    }
}