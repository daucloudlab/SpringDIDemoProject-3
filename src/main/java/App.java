import kz.kaznitu.lessons.test.helper.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-beans.xml") ;

        OutputHelper out = (OutputHelper) ctx.getBean("outputHelper") ;
        out.generateOutput();
    }
}