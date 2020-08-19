package jvmStaticjvmOverloadjvmField.javaCode;

import jvmStaticjvmOverloadjvmField.kotlinCode.Event;
import jvmStaticjvmOverloadjvmField.kotlinCode.Util;
import jvmStaticjvmOverloadjvmField.kotlinCode.Utils;

import java.util.Date;

public class MainJavaCode {
    public static void main(String[] args) {
        Utils.doSomething();
        Event eventOne = new Event("Anh Viet Pham", new Date());
        Event eventTwo = new Event("Anh Viet Pham");
        String name = eventOne.name;

        new Util();
        jvmStaticjvmOverloadjvmField.kotlinCode.DemoAVP.getName();
    }
}
