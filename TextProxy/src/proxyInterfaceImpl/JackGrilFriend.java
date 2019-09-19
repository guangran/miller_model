package proxyInterfaceImpl;

import proxyInterface.Proxy;

//jack的女朋友
public class JackGrilFriend implements Proxy {

	@Override
	public void getGrilFriend() {
		// TODO Auto-generated method stub
		System.out.println("Jack的女朋友");
	}

	@Override
	public void add(int number) {
		// TODO Auto-generated method stub
		System.out.println("Jack新增第个"+number+"女朋友");
	}

}
