package S4_13_4.CompleteReference.InterthreadCommunication;

class PC {
public static void main(String args[]) {
	Q q = new Q();
	new Producer(q);
	new Consumer(q);
	System.out.println("Press Control-C to stop.");
	}
}
