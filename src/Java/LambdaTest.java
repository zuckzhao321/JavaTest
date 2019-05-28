package Java;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class LambdaTest {

    /**
     * 可以调用 getLogger 方法创建或获取记录器
     */
    private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");


    public static void main(String[] args){
        String[] plantes = new String[]{"zhao1","qian22","sun333","li4444"};
        System.out.println(Arrays.toString(plantes));
        System.out.println("按照字典排序：");
        Arrays.sort(plantes);
        System.out.println (Arrays.toString(plantes)) ;
        System.out . println ("按照长度排:");
        Arrays.sort (plantes, (first , second) -> first.length() - second.length()) ;
        System.out. println(Arrays.toString(plantes)) ;
        Function function = () -> {System.out.println("make a lamabada");};
        //function.foo();

        Consumer co = (o) -> {System.out.println("hello world");};
        co.accept(null);

        /**
         * 使用全局日志记录器打印日志
         */
        Logger.getGlobal().info("File->Open menu item selected");


    }



}

interface Function{
    void foo();
}

