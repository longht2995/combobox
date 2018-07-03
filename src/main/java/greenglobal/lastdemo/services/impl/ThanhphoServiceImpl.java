package greenglobal.lastdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import greenglobal.lastdemo.entity.Thanhpho;
import greenglobal.lastdemo.services.ThanhphoService;
@Service("thanhphoService")
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ThanhphoServiceImpl implements ThanhphoService{
	@Autowired
	private ThanhphoDao tp;
	public List<Thanhpho> listAll() {
		// TODO Auto-generated method stub
		return tp.findAll();
	}
	
}
