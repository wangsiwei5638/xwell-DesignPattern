package com.wsw.designpattern.structure.proxy;

import com.wsw.designpattern.structure.proxy.dynamic.IntermediaryVendorD;
import com.wsw.designpattern.structure.proxy.staticc.IntermediaryVendorS;

import java.lang.reflect.Proxy;

/**
 * 代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。
 * 这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 *
 * 代理模式的主要优点有：
 * 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
 * 代理对象可以扩展目标对象的功能；
 * 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度；
 *
 * 其主要缺点是：
 * 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
 * 增加了系统的复杂度；
 */
public class APP {

    public static void main(String[] args) {
        staticProxy();
        System.out.println("=============================");
        dynamicProxy();
    }


    /**
     * 静态代理
     *
     * 代理模式的主要角色如下。
     * 抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
     * 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
     * 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
     */
    static void staticProxy(){
        Vendor v = new IntermediaryVendorS(new BenzVendor());
        v.sell();
    }

    /**
     * 动态代理
     *
     *     代理类在程序运行时创建的代理方式被成为动态代理。 我们上面静态代理的例子中，代理类(studentProxy)是自己定义好的，
     *     在程序运行之前就已经编译完成。然而动态代理，代理类并不是在Java代码中定义的，而是在运行时根据我们在Java代码中的“指示”动态生成的。
     *     相比于静态代理， 动态代理的优势在于可以很方便的对代理类的函数进行统一的处理，而不用修改每个代理类中的方法。
     */
    static void dynamicProxy(){
        Vendor vendor = (Vendor) Proxy.newProxyInstance(
                BenzVendor.class.getClassLoader(),
                BenzVendor.class.getInterfaces(),
                new IntermediaryVendorD(new BenzVendor()));
        vendor.sell();
    }


}
