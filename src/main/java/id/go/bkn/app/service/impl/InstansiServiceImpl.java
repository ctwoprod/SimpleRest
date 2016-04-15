package id.go.bkn.app.service.impl;

import id.go.bkn.app.dao.InstansiDao;
import id.go.bkn.app.entities.Instansi;
import id.go.bkn.app.service.InstansiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("InstansiService")
public class InstansiServiceImpl implements InstansiService {

	@Autowired
	private InstansiDao instansiDao;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Instansi> findAll() {
		// TODO Auto-generated method stub
		return instansiDao.findAll();
	}

}
