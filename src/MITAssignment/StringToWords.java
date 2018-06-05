package MITAssignment;

import java.util.Iterator;

public class StringToWords implements Iterator<String> {

	StringToWords string1=null;;
	
	public StringToWords(String string) {
		// TODO Auto-generated constructor stub
		this.string1=string;
	}

	public StringToWords() {
		// TODO Auto-generated constructor stub
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		String s="value";
		String[] a=s.split(" ");
		if(a.length>0)
		return true;
		else
			return false;
	}

	public String next() {
		// TODO Auto-generated method stub
		if(a.length>i)
i++;			
		return a[i];
	}

}
