package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author edson
 *
 */
@ManagedBean(name="consumirBean")
@ViewScoped
public class ConsumirBean {
	
	private int id;
	
	private String name;
	
	private int cityCode;
	
	private String cityName;
		
		public List<City> getPegaDados(){
			
			ArrayList<City> obj = new ArrayList<>();
			 
			return obj;
		}
		
		public Response enviaDadosCity(){
			 City obj = new City();
			 obj.setId(id);
			 obj.setCityCode(cityCode);
			
			 Client client = ClientBuilder.newClient();
			 WebTarget target = client.target("http://localhost:8080/hotels/avail");
			 Invocation.Builder ib = target.request(MediaType.APPLICATION_JSON);
			 Response response = ib.post(Entity.entity(obj, MediaType.APPLICATION_JSON));

			 return client.target("http://localhost:8080/lancamento").request(MediaType.APPLICATION_JSON).post(Entity.entity(obj, MediaType.APPLICATION_JSON));
			
		}
		
		public Response enviaDadosHotel(){
			 City obj = new City();
			 obj.setId(id);
			 obj.setCityCode(cityCode);
			
			 Client client = ClientBuilder.newClient();
			 WebTarget target = client.target("http://localhost:8080/hotels");
			 Invocation.Builder ib = target.request(MediaType.APPLICATION_JSON);
			 Response response = ib.post(Entity.entity(obj, MediaType.APPLICATION_JSON));

			 return client.target("http://localhost:8080/lancamento").request(MediaType.APPLICATION_JSON).post(Entity.entity(obj, MediaType.APPLICATION_JSON));
			
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCityCode() {
			return cityCode;
		}

		public void setCityCode(int cityCode) {
			this.cityCode = cityCode;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		

		
		
}
