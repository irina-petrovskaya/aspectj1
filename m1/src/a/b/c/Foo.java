package a.b.c;

import a.b.c.Bar;
import mylibs.aspectj_lib1.myclasses.LibClazz1;

/**
 * Created by irina on 11/5/2014.
 */
public class Foo {

    public static void main(String[] args) {
        Bar bar = new Bar();
        LibClazz1 lc1 = new LibClazz1(" test ");
        String rez = lc1.strMethod1(" foo ")+lc1.getOwnStr1()+bar.foom1()+bar.barm1();
        System.out.println(rez);
    }
}
