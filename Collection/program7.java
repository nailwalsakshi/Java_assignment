package Collection;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class program7 {
    public static void main(String[] args) {

        List<Float> values = new ArrayList<>();
        {
            values.add(5.2f);
            values.add(7.8f);
            values.add(10.3f);
            values.add(3.9f);
            values.add(8.4f);

            Iterator<Float> i = values.iterator();
            float sum = 0f;

            while (i.hasNext()) {
                sum += i.next();

            }
            System.out.println(sum);

        }
    }
}