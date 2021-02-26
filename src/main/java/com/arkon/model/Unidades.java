package com.arkon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Unidades {

	
		@Id
		private Integer id;		
		@Column
		private String fecha_consulta;
		@Column
		private String latitud;
		@Column
		private String longitud;
		@Column
		private String nombre;
		@Column
		private Integer status;
		@Column
		private Integer unidad_id;


		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getUnidad_id() {
			return unidad_id;
		}

		public void setUnidad_id(Integer unidad_id) {
			this.unidad_id = unidad_id;
		}

		public String getLatitud() {
			return latitud;
		}

		public void setLatitud(String latitud) {
			this.latitud = latitud;
		}

		public String getLongitud() {
			return longitud;
		}

		public void setLongitud(String longitud) {
			this.longitud = longitud;
		}

		public String getFecha_consulta() {
			return fecha_consulta;
		}

		public void setFecha_consulta(String fecha_consulta) {
			this.fecha_consulta = fecha_consulta;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
}
