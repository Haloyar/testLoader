import org.w3c.dom.ls.LSOutput;

public class Loader {

    static String mulString(String p, int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += p;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("А 100 раз");
        System.out.println(mulString("A", 100));

    }
}
