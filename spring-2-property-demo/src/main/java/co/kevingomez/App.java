package co.kevingomez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
        Getter g = (Getter)cxt.getBean("second");
        System.out.println(g.getGet());
    }
}
