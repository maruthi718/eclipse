package pac1;

class Parent {

 void display() {
     System.out.println("This is the Parent class.");
 }
}


class Child extends Parent {
 
 void display() {
     System.out.println("This is the Child class.");
 }
}

public class override {

 public static void main(String[] args) {
     Parent parent = new Parent(); 
     parent.display(); 

     Child child = new Child(); 
     child.display(); 
     
     Parent parentRef = new Child();
     parentRef.display(); 
 }
}
