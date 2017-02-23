abstract class Instrument {

  // abstract parent class
  
  public void playNote() {
    System.out.println("C~~~~~");
  }
}

/* 
Bullet Points

- When you don't want a class to be instantiated (in other words, you don't want anoyone to make a new object of that class type), mark the class with ABSTRACT keyword

- An abstract class can have both abstract and non-abstract methods

- If a class has even one abstract method, the class must be marked abstract

- An abstract method has no body, and the declaration ends with a semicolon (no curly braces)

- All abstract methods must be implemented in the first concrete subclass in the inheritance tree

- Every calss in Java is either a direct or indirect subclass of class OBJECT (java.lang.Object)

- Methods can be declared with Object arguments and/or return types

- You can call methods on an object ONLY if the methods are in the class (or interface) used as the REFERENCE variable type, regardless of the actual OBJECT type. So, a reference variable of the type Object can be used only to call methods defined in class Object, regardless of the type of the object to which the reference refers

- A reference variable of type Object can't be assigned to any other reference type without a CAST. A cast can be used to assign a reference variable of one type to a reference variable of a subtype, but at runtime the cast will fail if the objecto n the heap is NOT of a type compatible with the cast

  - ie. Dof d = (Dog) x.getObject(aDog);

- All objects come out of an ArrayList<Object> as type Object (meaning, they can be referenced only by an Object reference variable, unless you use a cast)

- Multiple inheritance is not allowed in Java, because of the problems associated with the "Deadly Diamond of Death". That means you can extend only one class (ie. you can have only one immediate superclass)

- An interface is liek a 100% pure abstract class. It defines ONLY abstract methods

- Create an interface using the interface keyword instead of the word class

- Implement an interface using the keyword implements

  - ie. Dog implements Pet

- Your class can implement multiple interfaces

= A class that implements an interface MUST implement all the methods of the interface, since all interface methods are implicitly public and abstract

- To invoke the superclass version of a method from a subclass that's overridden the method, use the super keyword. 

  - ie. super.runReport();

*/