package info.netutil;

import java.util.ArrayList;
import java.util.List;

public class AccessPoint
{

	public static void main(String[] args)
	{
		for(AccessPoint ap : getAll())
			System.out.println(ap);
	}
	
	public static List<AccessPoint> getAll()
	{
		List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
		
		if(true) throw new UnsupportedOperationException("unimplemented; todo: implement me!");
		
		return accessPoints;
	}
}
