package com.baidu.shade;

import com.alibaba.fastjson.JSONObject;

public class ShadeDemo {
    public static void main(String[] args) {
        String a = "shade.org.apache";

        System.out.println(a.startsWith("shade"));

        System.out.println(a.substring(6));
    }

    public void castJson() {
        //new JSONObject();
        //JsonOb refer:img.png
    }
}
