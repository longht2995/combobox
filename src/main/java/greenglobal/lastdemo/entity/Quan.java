package greenglobal.lastdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Quan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	private Thanhpho thanhpho;
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
	public Thanhpho getThanhpho() {
		return thanhpho;
	}
	public void setThanhpho(Thanhpho thanhpho) {
		this.thanhpho = thanhpho;
	}
	public Quan(int id, String name, Thanhpho thanhpho) {
		super();
		this.id = id;
		this.name = name;
		this.thanhpho = thanhpho;
	}
	public Quan() {
		
	}
}
