package org.koushik.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.koushik.javabrains.messenger.model.Messege;
import org.koushik.javabrains.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long,Messege> messeges=new HashMap<>();
	private static Map<Long,Profile> profiles=new HashMap<>();

	
	
	public static Map<Long,Messege> getMessege(){
		return messeges;
	}
	public static Map<Long,Profile> getProfile(){
		return profiles;
	}
}
