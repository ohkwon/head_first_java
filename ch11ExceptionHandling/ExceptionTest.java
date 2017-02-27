class ExceptionThrower {
  // to write a risky method, simply attach "throws <exception name>" after the method name, and beforethe curly brackets
  public void risky() throws ExampleException, ExampleException2 {
    // random number generator to create multiple test cases
    int num = (int) (Math.random() * 3);
    if (num == 0) {
      System.out.println("I will throw error because " + num);
      // this will case this method to throw an exception
      throw new ExampleException();
    } else if (num == 1) {

      System.out.println("I will throw error because " + num);
      // this is for a case with multiple different exceptions
      throw new ExampleException2();
    } else {
      // no exception thrown
      System.out.println("I will not throw an error because " + num);
    }
  }

  public void riskyDuck() throws ExampleException {
    throw new ExampleException();
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
    } catch (ExampleException2 ex2) {
      // this is for a case when there are multiple excpetions, you want to make sure to have a catch for all of them
      // have exceptions in order of small to large. 
      System.out.println("I have caught a risky method failing with example Exception2");
    } finally {
      // this is a method that is used for something that you want to happen, regardless of whether the risky method threw an exception or not
      // This is not necessary, only try and catch is
      System.out.println("I am testing out the finally clause, risky method trying is finished");
    }
  }
  // if you don't wrap a call to a risky method (a method that states throws "some exception") compiler will not be happy

  // this is a method that calls a risky method, but avoids having to use a try/catch by ducking.
  // you can duck by stating that his method is a risky method too. so the try/catch statement will need to be in the method that calls this method
  public void duck() throws ExampleException {
    // it calls the risky mehtod without rapping it in a try/catch
    ExceptionThrower throwerTest2 = new ExceptionThrower();
    throwerTest2.riskyDuck();
    System.out.println("I am calling a risky method and avoiding responsibility by ducking");
  }

  public void duckCaller() {
    try {
      // this calls the method that ducks within a try/catch so it works
      System.out.println("I called a method that ducks so I have it in a try statement");
      duck();
    } catch (ExampleException ex) {
      System.out.println("And that risky method that ducks did throw me an exception after all");
    }
  }

  public static void main(String[] args) {
    // create object and run method that calls a risky method
    ExceptionTest testing = new ExceptionTest();
    testing.testingException();
    testing.duckCaller();
  }
}

// created a personal exception subclass
class ExampleException extends ExampleException2 {
  private String stuff;

  public ExampleException() {
    stuff = "test";
  }
}

class ExampleException2 extends Exception {
  private String stuff;

  public ExampleException2() {
    stuff = "test";
  }
}