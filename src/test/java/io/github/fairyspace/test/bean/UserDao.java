package io.github.fairyspace.test.bean;

import io.github.fairyspace.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();
    static {
        hashMap.put("10001", "AAAAA");
        hashMap.put("10002", "BBBBB");
        hashMap.put("10003", "CCCCC");
    }
    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
