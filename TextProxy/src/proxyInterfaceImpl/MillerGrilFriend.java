package proxyInterfaceImpl;

import proxyInterface.Proxy;

//miller的女朋友
public class MillerGrilFriend implements Proxy {

	/**
	 * miller找到了女朋友
	 */
	@Override
	public void getGrilFriend() {
		// TODO Auto-generated method stub
		System.out.println("miller的女朋友");
	}

	/**
	 * miller的新增的女朋友个数
	 */
	@Override
	public void add(int number) {
		// TODO Auto-generated method stub
		System.out.println("miller新增第个"+number+"女朋友");
	}

}
