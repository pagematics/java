package exception.com.unchecked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoSuchElementException 
{
	public static class NoSuchElementExceptionExample {
	    public static void main(String args[]) {
	        List<Integer> newlist = new ArrayList<Integer>();
	        Iterator<Integer> itr = newlist.iterator();
	        System.out.println(itr.next());
	    }
	}

}
