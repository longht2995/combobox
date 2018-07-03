package greenglobal.lastdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import greenglobal.lastdemo.entity.Quan;
import greenglobal.lastdemo.entity.Thanhpho;
import greenglobal.lastdemo.services.QuanService;

@Service("quanService")
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class QuanServiceImpl implements QuanService{
	@Autowired
	private QuanDao qd;
	public List<Quan> listAll(Thanhpho tp) {
		// TODO Auto-generated method stub
		return qd.findAll(tp);
	}
	
}
