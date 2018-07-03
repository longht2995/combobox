package greenglobal.lastdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Thanhpho {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy="thanhpho",cascade=CascadeType.ALL)
	private List<Quan> listQuan;
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
	public List<Quan> getListQuan() {
		return listQuan;
	}
	public void setListQuan(List<Quan> listQuan) {
		this.listQuan = listQuan;
	}
	public Thanhpho(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Thanhpho() {
		
	}
}
