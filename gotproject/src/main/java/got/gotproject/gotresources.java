package got.gotproject;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("got")
public class gotresources
{
	
	
	gotrepository repo=new gotrepository();
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
       	public List<Got> getGot()
		{
		System.out.println("getGot called");
	
		
		return repo.getGot();
		}
}
		
	
