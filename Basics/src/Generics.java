import java.util.ArrayList;
import java.util.List;

/**
 * The basic idea here is to provide Type Safety.
 */

public class Generics {
    public static void main(String[] args) {
        int value = 2;
        String str = "test";
        List testList = new ArrayList();//Not a type safe List
        testList.add(value);
        testList.add(str);
        System.out.println(testList);

        List<Integer> typeSafeList = new ArrayList<Integer>();
        typeSafeList.add(value);
        //typeSafeList.add(str); this line will throw error.
        typeSafeList.add(4);
        System.out.println(typeSafeList);
        //int fetch = typeSafeList.get(1);
        //System.out.println(fetch);
        Test<String> obj = new Test<String>("2");
        System.out.println(obj.getVal());
    }
}

//Let's apply Generic to a Class
class Test<T>{
    T val;
    Test(T val){
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}