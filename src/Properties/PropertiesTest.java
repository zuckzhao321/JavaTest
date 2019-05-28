package Properties;

import java.awt.*;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;

public class PropertiesTest {

   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ResourceTestFrame();
         frame.setTitle("ResourceTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}

/**
 * A frame that loads image and text resources.
 */
class ResourceTestFrame extends JFrame
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 300;

   public ResourceTestFrame()
   {

      /**
       * 打包后的图片要放到编译后的文件里面
       */
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      URL aboutURL = getClass().getResource("about.gif");
      Image img = new ImageIcon(aboutURL).getImage();
      setIconImage(img);

      /**
       * 打包后的文件，如此处的txt文件，要放到编译后的文件里面
       */
      JTextArea textArea = new JTextArea();
      InputStream stream = getClass().getResourceAsStream("about.txt");
      try (Scanner in = new Scanner(stream, "UTF-8"))
      {
         while (in.hasNext())
            textArea.append(in.nextLine() + "\n");
      }
      add(textArea);
   }
}
