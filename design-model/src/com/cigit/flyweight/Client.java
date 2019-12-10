package com.cigit.flyweight;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/29  16:20
 **/
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = WebSiteFactory.getInstance();
        WebSite webSite1 = webSiteFactory.getWebSite("新闻");
        webSite1.use(new User("阿里"));
        WebSite webSite2 = webSiteFactory.getWebSite("新闻");
        webSite2.use(new User("百度"));
        WebSite webSite3 = webSiteFactory.getWebSite("博客");
        webSite3.use(new User("腾讯"));
        System.out.println(webSiteFactory.getSize());
    }
}
