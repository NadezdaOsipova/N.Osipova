package independentStudy;

public class MyClass {
    public static void main(String[] args) {
        IRead r1 = new A();
        B r2 = new B();
        IWrite w = new C();
        D obj1 = new D(r1, w);
        obj1.change();
        obj1.print();
        D obj2 = new D(r2, w);
        obj2.change();
        obj2.print();

        r1.read();
        r2.print();
        r2.read();
        w.write("str");

        E rw = new E();
        D obj3 = new D(rw, rw);
        obj3.change();
        obj3.print();

        G rw1 = new G();
        D obj4 = new D(rw1, rw1);
        obj4.change();
        obj4.print();

        H obj5 = new H();
        obj5.print();
        System.out.println(H.MY_CONST1);
        System.out.println(IConst.MY_CONST2);

        K k = new K();
        IStatic.print();

        IStaticPrivate.test();

        L l = new L();
        l.print();
        M m = new M();
        m.print();

        N n = new N();
        n.print();

        P p = new P();
        p.test();

    }
}
