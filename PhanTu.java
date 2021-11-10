import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhanTu<T> {
    private T t;

    public PhanTu(T t) {
        this.t = t;
    }

    public <T extends Comparable<T>> boolean isGreaterThan(T a) {
        if (a.compareTo((T) t) > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String name = args[0];
        List<PhanTu> list = new ArrayList<>();

        try {
            File file = new File(name);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                Integer data = sc.nextInt();
                list.add(new PhanTu(data));
            }
            sc.close();
        }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}
