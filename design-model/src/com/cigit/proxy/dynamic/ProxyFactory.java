package com.cigit.proxy.dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:39
 * 代理工厂，复杂创建代理类，聚合了目标类
 * 不用自己去写代理类
 **/
public class ProxyFactory{
    //目标类
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取代理类
     *   public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)
     *
     *   1.loader:目标类的类加载器
     *   2.interfaces：目标类实现的接口
     *   3.InvocationHandler:事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
     *   动态生成的代理类，继承了Proxy类并实现了跟目标类相同的接口
     *   proxy, method, args
     *   proxy:代理类，method：目标类的方法，args：目标类的方法参数
     * @return
     */
    public Object getProxyInstance(){
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");//输出代理对象
        saveAsClassFile(target.getClass(),"targetProxy");
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces()
                , (proxy, method, args) -> {
            System.out.println("老师走进教室....");
            //通过反射 调用目标对象的方法
            Object invoke = method.invoke(target, args);
            System.out.println("老师下课.....");
            return invoke;
        });
    }


    public void saveAsClassFile(Class clazz,String proxyName){
        byte[] classFile = ProxyGenerator.generateProxyClass(proxyName,clazz.getInterfaces());
        String path = clazz.getResource(".").getPath();
        System.out.println(path);
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(path+proxyName+".class");
            fos.write(classFile);
            fos.flush();
        }catch(Exception e){
             e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
