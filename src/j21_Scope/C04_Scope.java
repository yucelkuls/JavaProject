package j21_Scope;

import j20_StaticKeyword.C03_StaticKeyword;

public class C04_Scope {
    public static void main(String[] args) {
        C01_InstanceVariable obj1 = new C01_InstanceVariable(); // istenilen class tan ->const call-> obj create
        C03_StaticKeyword obj2 = new C03_StaticKeyword();
        obj1.nonStaticMeth(); // obje ile non-static meth call.
        System.out.println("obj1.developer = " + obj1.developer); // obj ile obj variable call
        C01_InstanceVariable.staticMeth(); // Class name ile static meth call
    }
}
