package info.netutil;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class NetworkRoute
{
	public static void main(String[] args) throws IOException
	{
		for(String line : getData())
			System.out.println(line);
	}
	
	private static List<String> getData() throws IOException
	{
		Process p = Runtime.getRuntime().exec(new String[]{"netstat", "-rn"});
		return IOUtils.readLines(p.getInputStream());
	}
}
