package S4_13_4.CompleteReference.UsingSynchronizedMethods.synchronizedBlock;

//This program uses a synchronized block.
class Callme {
void call(String msg) {
	System.out.print("[" + msg);
	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	System.out.println("Interrupted");
	}
	System.out.println("]");
	}
	}
