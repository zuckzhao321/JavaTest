package Java;

/**
 * 测试泛型
 * @author zuckzhao
 */
public class GenericMethodTest {

    //泛型方法
    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }


    public static void main(String args[]){
        Integer[] intArray = {1,2,3};
        Double[] doubleArray = {1.1,2.2,3.3};
        Character[] charArray = {'H','E','L'};

        System.out.println("整型数组元素为：");
        printArray(intArray);

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
    }

}
