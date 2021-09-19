package independentStudy;

public class G implements IReadWrite {
    @Override
    public String read() {
        return "string 4";
    }

    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
