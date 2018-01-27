package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Messege;

public class MessegeService {
	
	private Map<Long,Messege> messeges=DatabaseClass.getMessege();
	
	public MessegeService(){
		messeges.put(1L, new Messege(1,"Hello prakyath","Koushik"));
		messeges.put(2L, new Messege(2,"Hello venkat","Koushik"));
	}
	
 	
	public List<Messege> getAllMesseges(){
		return new ArrayList<Messege>(messeges.values());
	}
	
	public Messege getMessege(long id){
		return messeges.get(id);
	}

	public Messege addMessege(Messege messege){
		messege.setId(messeges.size()+1);
		return messege;
	}
	
	public Messege updateMessege(Messege messege){
		if(messege.getId()<=0){
			return null;
		}
		messeges.put(messege.getId(), messege);
		return messege;
	}
	
	public Messege removeMessege(long id){
		return messeges.remove(id);
		
	}
}
