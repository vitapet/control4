package control4.service;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String getHelloFromService() {
		return control4.repo.App.getHelloFromRepo()+"Hello from Service! ";
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
