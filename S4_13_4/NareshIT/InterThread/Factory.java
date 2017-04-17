package S4_13_4.NareshIT.InterThread;

public class Factory {
	int items;
	 		boolean itemsInFactory;
	 		synchronized void produce(int items){
	 			if(itemsInFactory){
	 				try{
	 					wait();
	 				}catch(Exception e){
	 					e.printStackTrace();
	 				}
	 			}
	 			this.items=items;
	 			itemsInFactory=true;
	 			System.out.println("itemsProduced:"+items);
	 			notifyAll();
	 		}
	 		synchronized int consume(){
	 			if(!itemsInFactory){
	 				try{
	 					wait();
	 				}catch(InterruptedException e){
	 					e.printStackTrace();
	 				}
	 			}
	 			System.out.println("items consumed items"+items);
	 			itemsInFactory=false;
	 			notify();
	 			return items;
	 		}

}
