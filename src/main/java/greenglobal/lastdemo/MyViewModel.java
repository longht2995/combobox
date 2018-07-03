package greenglobal.lastdemo;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import greenglobal.lastdemo.entity.Quan;
import greenglobal.lastdemo.entity.Thanhpho;
import greenglobal.lastdemo.entity.User;
import greenglobal.lastdemo.entity.UserValidator;
import greenglobal.lastdemo.services.QuanService;
import greenglobal.lastdemo.services.ThanhphoService;
import greenglobal.lastdemo.services.UserService;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class MyViewModel {

	@WireVariable
	private ThanhphoService thanhphoService;
	@WireVariable
	private QuanService quanService;
	@WireVariable
	private UserService userService;
	@WireVariable
	UserValidator userValidator;
	private List<Thanhpho> listThanhpho;
	private Thanhpho selectedThanhpho;
	private List<Quan> listQuan;
	private User user;
	@Init
	public void init() {
		listThanhpho = new ArrayList<Thanhpho>();
		listQuan = new ArrayList<Quan>();
		selectedThanhpho = new Thanhpho();
		user = new User();
		listThanhpho = thanhphoService.listAll();
		listQuan = new ArrayList<Quan>();
	}
	@Command
	@NotifyChange("listQuan")
	public void showQuan() {
		listQuan = selectedThanhpho.getListQuan();
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Thanhpho> getListThanhpho() {
		return listThanhpho;
	}
	public void setListThanhpho(List<Thanhpho> listThanhpho) {
		this.listThanhpho = listThanhpho;
	}
	public Thanhpho getSelectedThanhpho() {
		return selectedThanhpho;
	}
	public void setSelectedThanhpho(Thanhpho selectedThanhpho) {
		this.selectedThanhpho = selectedThanhpho;
	}
	public List<Quan> getListQuan() {
		return listQuan;
	}

	public void setListQuan(List<Quan> listQuan) {
		this.listQuan = listQuan;
	}
	

}
