package S4_13_4.CompleteReference.InterthreadCommunication;

//An incorrect implementation of a producer and consumer.
class Q {
int n;
synchronized int get() {
System.out.println("Got: " + n);
return n;
}
synchronized void put(int n) {
this.n = n;
System.out.println("Put: " + n);
}
}