package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tuiXach")
public class tuiXach {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_TuiXach")
	private Integer id_TuiXach;
	
	@Column(name = "tenTuiXach")
	private String tenTuiXach;
	
	@Column(name = "mauSac")
	private String mauSac;
	
	@Column(name = "giaTien")
	private String giaTien;
	
	
	@Column(name = "ghiChu")
	private String ghiChu;


	public tuiXach() {
		super();
	}


	public tuiXach(Integer id_TuiXach, String tenTuiXach, String mauSac, String giaTien, String ghiChu) {
		super();
		this.id_TuiXach = id_TuiXach;
		this.tenTuiXach = tenTuiXach;
		this.mauSac = mauSac;
		this.giaTien = giaTien;
		this.ghiChu = ghiChu;
	}


	public Integer getId_TuiXach() {
		return id_TuiXach;
	}


	public void setId_TuiXach(Integer id_TuiXach) {
		this.id_TuiXach = id_TuiXach;
	}


	public String getTenTuiXach() {
		return tenTuiXach;
	}


	public void setTenTuiXach(String tenTuiXach) {
		this.tenTuiXach = tenTuiXach;
	}


	public String getMauSac() {
		return mauSac;
	}


	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}


	public String getGiaTien() {
		return giaTien;
	}


	public void setGiaTien(String giaTien) {
		this.giaTien = giaTien;
	}


	public String getGhiChu() {
		return ghiChu;
	}


	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
	
	
}