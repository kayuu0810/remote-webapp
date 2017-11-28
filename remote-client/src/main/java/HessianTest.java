import java.net.MalformedURLException;
  
import com.caucho.hessian.client.HessianProxyFactory;
import com.enci.HessianService;


public class HessianTest {  
  
    public static void main(String[] args) {  
        String url = "http://localhost:8888/hs";
        HessianProxyFactory factory = new HessianProxyFactory();  
              
        try {  
            HessianService hs = (HessianService)factory.create(HessianService.class, url);
            String result = hs.getNewMessage("hello, successfully");  
            System.out.println(result);  
              
        } catch (MalformedURLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
  
} 