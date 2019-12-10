package com.cigit.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/29  16:16
 * 享元工厂类，聚合了具体的享元对象
 **/
public class WebSiteFactory {
    //充当池的作用
    public Map<String, WebSite> map = new ConcurrentHashMap<>();

    private static WebSiteFactory webSiteFactory = new WebSiteFactory();
    private WebSiteFactory(){

    }
    public static WebSiteFactory getInstance(){
        return webSiteFactory;
    }

    public WebSite getWebSite(String type){
        if(!map.containsKey(type)){
            map.put(type,new ConcreteWebSite(type));
        }
        return map.get(type);
    }

    public int getSize(){
        return map.size();
    }
}
