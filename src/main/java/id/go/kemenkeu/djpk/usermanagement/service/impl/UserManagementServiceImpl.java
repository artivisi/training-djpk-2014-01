/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.kemenkeu.djpk.usermanagement.service.impl;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.domain.User;
import id.go.kemenkeu.djpk.usermanagement.dao.DaoTes1;
import id.go.kemenkeu.djpk.usermanagement.domain.Tprov;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author endy
 */
@Service("userManagementService")
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private DaoTes1 daoTes1;

    /* tidak perlu lagi setter karena sudah diisi pakai @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    */
    
    @Transactional(readOnly = false)
    public void simpan(Object p) {
        sessionFactory.getCurrentSession().saveOrUpdate(p);
    }
    
    @Transactional(readOnly = false)
    public void simpanBanyak(List<Object> p) {
        for (Object object : p) {
            sessionFactory.getCurrentSession().saveOrUpdate(object);
        }
    }

    @Transactional(readOnly = false)
    public void hapus(Pemda p) {
        sessionFactory.getCurrentSession().delete(p);
    }

    @Transactional(readOnly = true)
    public Pemda cariById(Integer id) {
        return (Pemda) sessionFactory.getCurrentSession().get(Pemda.class, id);
    }

    @Transactional(readOnly = true)
    public List<Pemda> cariSemua(Integer start, Integer rows) {
        return sessionFactory.getCurrentSession().createQuery("select p from Pemda order by p.kode")
                .setFirstResult(start)
                .setMaxResults(rows)
                .list();
    }

    @Transactional(readOnly = false)
	public void hapus(User p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(p);
	}
    
    // method untuk class Profile
    
    // method untuk class User
    
    // method untuk class Tahun
    
    // method untuk class Provinsi
    
    @Transactional(readOnly = true)
    public List getPemdaPakeSpring(){
        return daoTes1.getPakeSpring();
    }

    @Transactional(readOnly = true)
    public List<Tprov> cariSemuaProvinsi() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Tprov order by kodeProvinsi")
                .list();
    }
}
