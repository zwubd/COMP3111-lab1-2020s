/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lab1;

public class Library {
	
	public static void main(String arg[])
	{
		Library lib = new Library();
		if (lib.someLibraryMethod()) {
		    System.out.print("Hello, World!");
		}
	}
	
    public boolean someLibraryMethod() {    	
        return true;
    }
}
