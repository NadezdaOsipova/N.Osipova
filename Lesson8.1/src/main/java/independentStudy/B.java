package independentStudy;

public class B implements IRead {
    private String s = "string 2";

    @Override
    public String read() {
        return this.s;
    }

    public void print() {
        System.out.println(s);
    }
}
