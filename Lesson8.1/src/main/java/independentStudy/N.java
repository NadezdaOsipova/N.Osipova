package independentStudy;

public class N implements IDefault, IDefault2 {
    @Override
    public void print() {
        IDefault.super.print();
        IDefault2.super.print();
    }
}
