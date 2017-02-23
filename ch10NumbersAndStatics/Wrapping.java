class Wrapping {
  public static void main(String[] args) {
    int x = 32;

    ArrayList list = new ArrayList();
    list.add(x);
    // this arraylist has no predefinied type, and cannot hold primitives. it wrapped the int into an Integer object. (Autoboxing)

    // wrapping a value
    // wrapping for when you want to treat a primitive as an object
    int i = 288;
    Integer iWrap = new Integer(i);

    //unwrapping a value
    int unWrapped = iWrap.intValue();

    //turning a integer into a string
    String integerString = Integer.toString(unWrapped);
  }
}

//Wrapper Classes for Primitives

/* 
Boolean
Character (not the same spelling as the datatype)
Byte
Short
Integer (not the same spelling as the datatype)
Long
Float
Double
*/

// go over formatting when you have chance, pg. 294