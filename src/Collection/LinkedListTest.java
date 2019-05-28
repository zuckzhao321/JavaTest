package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("zhao");
        list.add("liu");
        list.add("sun");

        System.out.println(list.getClass().getName());//打印类名

        /**
         * 使用迭代器Iterator，没有add方法
         */
        Iterator<String> it = list.iterator();
        String first = it.next();
        String second = it.next();
        System.out.println(first);
        System.out.println(second);
        it.remove();

        List<String> list2 = new LinkedList<>();
        list2.add("zhao2");
        list2.add("liu2");
        list2.add("sun2");
        /**
         * 使用迭代器ListIterator，有add方法
         */
        ListIterator<String> listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        listIterator.add("qian");//Add 方法在迭代器位置之前添加一个新对象
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());//往前看
        System.out.println(listIterator.previous());
        System.out.println(list2.get(3));
    }
}
