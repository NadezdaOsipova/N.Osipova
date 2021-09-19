package independentStudy;

import java.util.Locale;

public class D {
    private IRead ir;
    private IWrite iw;
    private String str = " ";

    public D(IRead ir, IWrite iw) {
        this.ir = ir;
        this.iw = iw;
        this.str = ir.read();//получаем данные
    }

    public void change() {//обрабатываем данные
        str = str.toUpperCase();
    }

    public void print() {//выводим данные
        iw.write(str);
    }
}
