package testSupport;

public class Pages {
	
	public static <T> T page(Class<T> c) throws InstantiationException, IllegalAccessException{
		return c.newInstance();
	}

}
