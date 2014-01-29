/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.kemenkeu.djpk.usermanagement.service.impl;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author endy
 */
public class UserManagementServiceImpl implements UserManagementService {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    // method untuk Pemda
    @Transactional(readOnly = false)
    public void simpan(Pemda p) {
        sessionFactory.getCurrentSession().saveOrUpdate(p);
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
    
    // method untuk class Profile
    
    // method untuk class User
    
    // method untuk class Tahun
    
    // method untuk class Provinsi
    
}
