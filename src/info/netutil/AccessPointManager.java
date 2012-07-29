package info.netutil;

import java.util.ArrayList;
import java.util.List;

public class AccessPointManager
{
	public static void main(String[] args)
	{
		for(AccessPoint ap : getAccessPoints())
			System.out.println(ap);
	}
	
	public static List<AccessPoint> getAccessPoints()
	{
		List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
		
		if(true) throw new UnsupportedOperationException("unimplemented; todo: implement me!");
		
		return accessPoints;
	}

}
