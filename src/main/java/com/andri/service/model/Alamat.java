package com.andri.service.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Alamat {
	private String provinsi;
	private String kota_kab;
	private String kota_kab_nama;
	private String kecamatan;
	private String kelurahan;
	
	private int kode_pos;
	@Id
	private int id;
	
}
