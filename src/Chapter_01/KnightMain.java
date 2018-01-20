package Chapter_01;

import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {
    test();
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext(
            "knight.xml");
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();

  }

  private static void test(){
    String ss = "";
  }

}
