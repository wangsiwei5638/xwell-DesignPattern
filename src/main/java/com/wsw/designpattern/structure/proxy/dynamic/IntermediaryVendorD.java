package com.wsw.designpattern.structure.proxy.dynamic;

import com.wsw.designpattern.structure.proxy.BenzVendor;
import com.wsw.designpattern.structure.proxy.Vendor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 销售中介
 */
public class IntermediaryVendorD implements InvocationHandler {

    private BenzVendor benzVendor;

    public IntermediaryVendorD(BenzVendor benzVendor) {
        this.benzVendor = benzVendor;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("中间商忽悠卖家，车损严重只有6成新，最高售价15万");
        System.out.println("中间商忽悠买家，9成新奔驰E300L，售价25万");
        Object res = method.invoke(benzVendor, args);
        System.out.println("中间商获利10万，美滋滋");

        return res;
    }
}
