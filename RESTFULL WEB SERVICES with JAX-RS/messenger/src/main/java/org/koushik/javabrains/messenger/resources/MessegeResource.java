package org.koushik.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.messenger.model.Messege;
import org.koushik.javabrains.messenger.service.MessegeService;

@Path("/messeges")
public class MessegeResource {
	
	MessegeService messegeService=new MessegeService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messege> getMesseges(){
		return messegeService.getAllMesseges();
		
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Messege  addMessege(Messege messege) {
		return messegeService.addMessege(messege) ;
		
	}
	@GET
	@Path("/{messegeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Messege getMessege(@PathParam("messegeId") long id){
		return messegeService.getMessege(id);
		
	}

}
