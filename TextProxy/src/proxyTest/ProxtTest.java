package proxyTest;

import java.util.ArrayList;
import java.util.List;

import proxyInterface.Proxy;
import proxyInterfaceImpl.JackGrilFriend;
import proxyInterfaceImpl.MillerGrilFriend;
import proxyInterfaceImpl.ProxyImpl;

public class ProxtTest {

	public static void main(String[] args) {
		Proxy millerProxy = new MillerGrilFriend();
		ProxyImpl millerProxyImpl = new ProxyImpl(millerProxy,2);
		
		Proxy jackProxy = new JackGrilFriend();
		ProxyImpl jackProxyImpl = new ProxyImpl(jackProxy,2);
		List<ProxyImpl> proxyImpllist = new ArrayList<ProxyImpl>();
		proxyImpllist.add(millerProxyImpl);
		proxyImpllist.add(jackProxyImpl);
		try {
			for(ProxyImpl proxyImpl : proxyImpllist) {
				proxyImpl.getGrilFriend();
				proxyImpl.add();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("’“≈Æ≈Û”— ß∞‹£°");
		}
	}
	
}
