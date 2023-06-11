package looseVStightCoupling.Annotations_package.App_config;

public class Human {
    private String name;
    private int age;

    public Human(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void intro(){
        System.out.println("Hi" +name+age);
    }

}
