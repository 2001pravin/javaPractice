package lambada;

public class main {
public static void main(String[] args) {
//     myInterface myinter=new myInterIMpl();
//     myinter.myName();

  myInterface i= new myInterface() {

    @Override
    public void myName() {
       System.out.println("raj");
    }
    
  };
  i.myName();
  myInterface i2=new myInterface() {

    @Override
    public void myName() {
        System.out.println("jeven");
    }
    
  };
  i2.myName();

  myInterface i5=()->System.out.println("San");
  i5.myName();

  ADD add=(a,b)->a+b;
System.out.println(add.sum(5, 10));

StringLe instring= str-> str.length();
System.out.println(instring.getLength("Pravin"));
}



    
}
