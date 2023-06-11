package looseVStightCoupling.Annotations_package.App_config;

public class HelloWorld {
    private String message;
    public  HelloWorld(String message){
        this.message=message;
    }
    public void sayHello(){
        System.out.println("Hello"+message);
    }
}
