package com.wsw.designpattern.structure.proxy.staticc;

import com.wsw.designpattern.structure.proxy.BenzVendor;
import com.wsw.designpattern.structure.proxy.Vendor;

/**
 * 销售中介
 */
public class IntermediaryVendorS implements Vendor {

    private BenzVendor benzVendor;

    public IntermediaryVendorS(BenzVendor benzVendor) {
        this.benzVendor = benzVendor;
    }

    public void sell() {
        System.out.println("中间商忽悠卖家，车损严重只有6成新，最高售价15万");
        System.out.println("中间商忽悠买家，9成新奔驰E300L，售价25万");
        benzVendor.sell();
        System.out.println("中间商获利10万，美滋滋");

    }

}
