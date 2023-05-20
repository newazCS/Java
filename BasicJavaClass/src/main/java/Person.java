import business.Company;

public class Person {
    private String middleName = "Noman";

    public static void main(String[] args){
        Person p1 = new Person();
        p1.sayHello();
        p1.hiWithName("Newaz");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5,20));

        p1.test2("iPhone","Samsung");
    }

    public void test(String [] words){
        // do something clever with words
    }
    //Using VerArgs
     public void test2(String...words){
         // do something clever with words
     }

    public int add (int num, int num2){
        return num + num2;
    }
    public char getMiddleInitial(){
        return middleName.charAt(0);
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void hiWithName(String name){
        System.out.println("My Name Is: "+ name);
    }

}



