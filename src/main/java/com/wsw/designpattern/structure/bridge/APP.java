package com.wsw.designpattern.structure.bridge;

/**
 * <p>
 * Abstraction：抽象部分的接口。通常在这个对象里面，要维护一个实现部分的对象引用，
 * 在抽象对象里面的方法，需要调用实现部分的对象来完成。这个对象里面的方法，通常都是跟具体的业务相关的方法。
 *</p>
 * <p>
 * RefinedAbstraction：
 * 扩展抽象部分的接口，通常在这些对象里面，定义跟实际业务相关的方法，
 * 这些方法的实现通常会使用Abstraction中定义的方法，也可能需要调用实现部分的对象来完成。
 *</p>
 * <p>
 * Implementor：
 * 定义实现部分的接口，这个接口不用和Abstraction里面的方法一致（根据约定优于配置原则，建议跟Abstraction一致。），
 * 通常是由Implementor接口提供基本的操作，而Abstraction里面定义的是基于这些基本操作的业务方法，
 * 也就是说Abstraction定义了基于这些基本操作的较高层次的操作。
 *</p>
 * <p>
 * ConcreteImplementor：
 * 真正实现Implementor接口的对象。
 * </p>
 */
public class APP {

    public static void main(String[] args) {
        ImplementorColor color = new RedColor();
        AbstractionBenz benzA = new BenzE300L(color);
        AbstractionBenz benzB = new BenzG500(color);

        color = new WhiteColor();
        AbstractionBenz benzC = new BenzG500(color);

        color = new RedColor();
        AbstractionBenz benzD = new BenzG500(color);

        benzA.desc();
        System.out.println("=======================");
        benzB.desc();
        System.out.println("=======================");
        benzC.desc();
        System.out.println("=======================");
        benzD.desc();

    }

}
