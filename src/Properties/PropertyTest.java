package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyTest {
    public static void main(String[] args) throws IOException {

        /**
         * 输出一个属性文件
         */
        Properties settings = new Properties();
        settings.setProperty("width","100");
        settings.setProperty("title","Hello");

        /**
         *  将属性映射文件保存在一个文件里面
         */
        OutputStream out = new FileOutputStream("program.properties");
        settings.store(out,"Program Properties");

        /**
         * 从文件中加载属性
         */
        InputStream in = new FileInputStream("program.properties");
        settings.load(in);

        /**
         * 从系统中获取属性的办法
         */
        String userDir = System.getProperty("user.home");
        System.out.println(userDir);   //  打印 ：C:\Users\Administrator
    }
}
