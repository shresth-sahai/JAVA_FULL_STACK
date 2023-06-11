package looseVStightCoupling.Annotations_package.Comp2;


import looseVStightCoupling.Annotations_package.Autowired_2.ExampleClass;

//@ComponentScan---> base package full co
public class Comp2 {

    private ExampleClass exampleClass;

    public Comp2(ExampleClass exampleClass){
        this.exampleClass=exampleClass;
    }
    public void execute(){
        exampleClass.doSomething();
    }
}
