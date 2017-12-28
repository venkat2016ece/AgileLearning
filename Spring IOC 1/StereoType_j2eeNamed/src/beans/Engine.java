package beans;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
@Named
public class Engine {
	private String engname;
	
	public void setEngname(String engname) {
		this.engname = engname;
	}
	public String getEngname() {
		return engname;
	}

}
