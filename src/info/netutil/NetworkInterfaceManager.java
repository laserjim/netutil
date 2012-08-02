package info.netutil;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.net.SocketException;

public class NetworkInterfaceManager
{
	public static void setIpAddress(NetworkInterface nic, Inet4Address ip) throws InterruptedException, IOException
	{
		String ipString = ip.getAddress()[0]+"."+ip.getAddress()[1]+"."+ip.getAddress()[2]+"."+ip.getAddress()[3];
		
		// TODO: Read and report errors
		Runtime.getRuntime().exec(new String[]{"ifconfig", nic.getName(), "inet", ipString}).waitFor();
	}
	
	public static void dhclient(NetworkInterface nic) throws InterruptedException, IOException
	{
		// TODO: Read and report errors
		Runtime.getRuntime().exec(new String[]{"dhclient", nic.getName()}).waitFor();
	}
	
	public static void takeDown(NetworkInterface nic) throws InterruptedException, IOException
	{
		// TODO: Read and report errors
		Runtime.getRuntime().exec(new String[]{"ifconfig", nic.getName(), "down"}).waitFor();
	}
	
	public static void bringUp(NetworkInterface nic) throws InterruptedException, IOException
	{
		// TODO: Read and report errors
		Runtime.getRuntime().exec(new String[]{"ifconfig", nic.getName(), "up"}).waitFor();
	}
	
	public static NetworkInterface getDefaultNetworkInterface() throws SocketException
	{
		return NetworkInterface.getByName("wlan0");
	}
}

