package independentStudy;

public class E implements IRead, IWrite {
    @Override
    public String read() {
        return "string 3";
    }

    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
