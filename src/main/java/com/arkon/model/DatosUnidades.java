package com.arkon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DatosUnidades {

	@Id
	private Integer _id;
	@Column
	private Integer id;
	@Column
	private String date_updated;
	@Column
	private Integer vehicle_id;
	@Column
	private Integer vehicle_label;
	@Column
	private Integer vehicle_current_status ;
	@Column
	private Double position_latitude;
	@Column
	private Double position_longitude;
	@Column
	private String geographic_point;
	@Column
	private Integer position_speed;
	@Column
	private Integer position_odometer;
	@Column
	private Integer trip_schedule_relationship;
	@Column
	private Integer trip_id;
	@Column
	private Integer trip_start_date;
	@Column
	private Integer trip_route_id;
	

	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate_updated() {
		return date_updated;
	}
	public void setDate_updated(String date_updated) {
		this.date_updated = date_updated;
	}
	public Integer getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(Integer vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public Integer getVehicle_label() {
		return vehicle_label;
	}
	public void setVehicle_label(Integer vehicle_label) {
		this.vehicle_label = vehicle_label;
	}
	public Integer getVehicle_current_status() {
		return vehicle_current_status;
	}
	public void setVehicle_current_status(Integer vehicle_current_status) {
		this.vehicle_current_status = vehicle_current_status;
	}
	public Double getPosition_latitude() {
		return position_latitude;
	}
	public void setPosition_latitude(Double position_latitude) {
		this.position_latitude = position_latitude;
	}
	public Double getPosition_longitude() {
		return position_longitude;
	}
	public void setPosition_longitude(Double position_longitude) {
		this.position_longitude = position_longitude;
	}
	public String getGeographic_point() {
		return geographic_point;
	}
	public void setGeographic_point(String geographic_point) {
		this.geographic_point = geographic_point;
	}
	public Integer getPosition_speed() {
		return position_speed;
	}
	public void setPosition_speed(Integer position_speed) {
		this.position_speed = position_speed;
	}
	public Integer getPosition_odometer() {
		return position_odometer;
	}
	public void setPosition_odometer(Integer position_odometer) {
		this.position_odometer = position_odometer;
	}
	public Integer getTrip_schedule_relationship() {
		return trip_schedule_relationship;
	}
	public void setTrip_schedule_relationship(Integer trip_schedule_relationship) {
		this.trip_schedule_relationship = trip_schedule_relationship;
	}
	public Integer getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(Integer trip_id) {
		this.trip_id = trip_id;
	}
	public Integer getTrip_start_date() {
		return trip_start_date;
	}
	public void setTrip_start_date(Integer trip_start_date) {
		this.trip_start_date = trip_start_date;
	}
	public Integer getTrip_route_id() {
		return trip_route_id;
	}
	public void setTrip_route_id(Integer trip_route_id) {
		this.trip_route_id = trip_route_id;
	}
	
	

}
