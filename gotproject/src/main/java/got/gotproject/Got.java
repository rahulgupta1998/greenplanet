package got.gotproject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Got 
{
   private String region;
   private String location;

   
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
