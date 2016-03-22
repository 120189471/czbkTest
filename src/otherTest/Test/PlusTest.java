package otherTest.Test;

/**
 * Created by Searis on 2016/3/21.
 *
 * 死循环
 */
public class PlusTest {
    public static void main(String[] args) {
        for (int x=0;x<10;x++){
            System.out.println(x);
            x--;
            System.out.println("第二次"+x);

        }
    }
}
