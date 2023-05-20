package packagesTest;

public class ClassB {

    public void publicMethod(){
        System.out.println("This is public method ClassB");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("This is private Method from Class B");
    }

    protected void protectedMethod(){
        System.out.println("This is protected Method from Class B");
    }

    

}
