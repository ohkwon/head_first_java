class ExceptionThrower {
  // to write a risky method, simply attach "throws <exception name>" after the method name, and beforethe curly brackets
  public void risky() throws ExampleException {
    // random number generator to create multiple test cases
    int num = (int) (Math.random() * 2);
    if (num == 0) {
      System.out.println("I will throw error because " + num);
      // this will case this method to throw an exception
      throw new ExampleException();
    } else {
      // no exception thrown
      System.out.println("I will not throw an error because " + num);
    }
  }
}

public class ExceptionTest {
  // method to test try and catch
  public void testingException() {
    // encase a risky method (when you call a method that is risky (and potentially, not a method that you wrote so you don't know what it constitutes of))
    try {
      // this is where you can try a risky method
      System.out.println("I am trying the risky method");
      ExceptionThrower throwerTest = new ExceptionThrower();
      throwerTest.risky();
    } catch (ExampleException ex) {
      // an exception is an object of type exception, ExceptionExample, my own personal exception, is a subclass, ex is the block variable name for the exception itself
      System.out.println("I have caught a risky method failing");
    } finally {
      // this is a method that is used for something that you want to happen, regardless of whether the risky method threw an exception or not
      // This is not necessary, only try and catch is
      System.out.println("I am testing out the finally clause, risky method trying is finished");
    }
  }
  // if you don't wrap a call to a risky method (a method that states throws "some exception") compiler will not be happy

  public static void main(String[] args) {
    // create object and run method that calls a risky method
    ExceptionTest testing = new ExceptionTest();
    testing.testingException();
  }
}

// created a personal exception subclass
class ExampleException extends Exception {
  private String stuff;

  public ExampleException() {
    stuff = "test";
  }
}