package greenglobal.lastdemo.services;

import java.util.List;

import greenglobal.lastdemo.entity.Quan;
import greenglobal.lastdemo.entity.Thanhpho;

public interface QuanService {
	public List<Quan> listAll(Thanhpho tp);
}
