package prspring_example5;
import org.springframework.aop.framework.ProxyFactory;
public class SecurityDemo {
    public static void main(String... args) {
       // var mgr = new SecurityManager();
        SecureBean bean = getSecureBean();
       // mgr.notify("John", "pwd");
        bean.writeSecureMessage();
        //    mgr.wait();
        try {
       //     mgr.notify("invalid user", "pwd");
            bean.writeSecureMessage();
        } catch(SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        } finally {
       //     mgr.wait();
        }
        try {
            bean.writeSecureMessage();
        } catch(SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        }
    }
    private static SecureBean getSecureBean() {
        SecureBean target = new SecureBean();
        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
      //  factory.addAdvice(advice);
        SecureBean proxy = (SecureBean)factory.getProxy();
        return proxy;
    }
}
