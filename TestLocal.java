public class TestLocal {
    public static void main(String [] args) {
      int x;
      if (args[0] != null) { // assume you know this will
                             // always be true
         
		x = 7;	// compiler can't tell that this
				// statement will run
	  }
	 int y = x; // the compiler will choke here
   } 
}
