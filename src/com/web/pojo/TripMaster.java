package com.web.pojo;

import java.util.Date;

public class TripMaster {
	 private String origin;

	   
	    private String destination;

	   
	    private Integer passengerid;

	   
	    private Double distance;

	   
	    private Double price;

	   
	    private Date starttime;

	   
	    private Date endtime;

	   
	    private Integer peoplecount;

	   
	    private String specialservice;

	   
	    private String origincoordinate;

	   
	    private String destinationcoordinate;


		public String getOrigin() {
			return origin;
		}


		public void setOrigin(String origin) {
			this.origin = origin;
		}


		public String getDestination() {
			return destination;
		}


		public void setDestination(String destination) {
			this.destination = destination;
		}


		public Integer getPassengerid() {
			return passengerid;
		}


		public void setPassengerid(Integer passengerid) {
			this.passengerid = passengerid;
		}


		public Double getDistance() {
			return distance;
		}


		public void setDistance(Double distance) {
			this.distance = distance;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		public Date getStarttime() {
			return starttime;
		}


		public void setStarttime(Date starttime) {
			this.starttime = starttime;
		}


		public Date getEndtime() {
			return endtime;
		}


		public void setEndtime(Date endtime) {
			this.endtime = endtime;
		}


		public Integer getPeoplecount() {
			return peoplecount;
		}


		public void setPeoplecount(Integer peoplecount) {
			this.peoplecount = peoplecount;
		}


		public String getSpecialservice() {
			return specialservice;
		}


		public void setSpecialservice(String specialservice) {
			this.specialservice = specialservice;
		}


		public String getOrigincoordinate() {
			return origincoordinate;
		}


		public void setOrigincoordinate(String origincoordinate) {
			this.origincoordinate = origincoordinate;
		}


		public String getDestinationcoordinate() {
			return destinationcoordinate;
		}


		public void setDestinationcoordinate(String destinationcoordinate) {
			this.destinationcoordinate = destinationcoordinate;
		}
}
