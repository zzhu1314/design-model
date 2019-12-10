package com.cigit.decorate;

import java.io.*;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/25  16:41
 * 序列化：将对象转化成字节流
 * transient 将该字段声明为不可序列化，但对static变量无效
 * static变量属于类 不属于对象
 **/
public class Client implements Serializable {

     transient   private static String name;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       new Client().test();

    }
    public static void test() throws IOException, ClassNotFoundException {
        Drink drink1 = new Chocolate(new BitterCoffee());
        Drink drink2 = new Chocolate(drink1);
        System.out.println(drink1.getDec()+"\t花费："+drink1.cost());
        System.out.println(drink2.getDec()+"\t花费："+drink2.cost());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        Client client = new Client();
        client.setName("zs");
        System.out.println(new Client().getName());
        objectOutputStream.writeObject(client);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Client o = (Client) objectInputStream.readObject();
        System.out.println(o);
        System.out.println(o.getName());


    }

    public   String getName() {
        return name;
    }

    public   void setName(String name) {
        this.name = name;
    }

}
