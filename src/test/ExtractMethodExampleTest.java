package test;

import com.refactor.method.CustomerComment;
import com.refactor.method.ExtractMethodExample;
//import com.refactor.method.FeedbackOfCustomer;
import com.refactor.method.ProductA;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by wenchai on 2015/8/27.
 */
public class ExtractMethodExampleTest extends TestCase {
    ExtractMethodExample testExample = new ExtractMethodExample(120,new ProductA());
//        ExtractMethodExample testExample = new ExtractMethodExample(120,"A");

    @Test
    public void testCreateStatements() throws Exception {

assertEquals("productName is:productA and price is:480.0", testExample.createStatements());

    }

    @Test
    public void testgetFeedBackFromCustomer(){
//        String feedBack=testExample.getFeedbackFromCustomer(new FeedbackOfCustomer("cain",null,null,2));
        String feedBack=testExample.getFeedbackFromCustomer(new CustomerComment("cain", null, null, 2));
        assertEquals("cain",feedBack);
    }

}