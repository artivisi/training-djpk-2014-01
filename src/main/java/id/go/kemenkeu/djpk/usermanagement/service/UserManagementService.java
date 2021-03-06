package id.go.kemenkeu.djpk.usermanagement.service;


import id.go.kemenkeu.djpk.usermanagement.dao.DaoTes1;
import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.domain.Tprov;
import id.go.kemenkeu.djpk.usermanagement.domain.User;

import java.util.List;

public interface UserManagementService {
    public void simpan(Object p);
    public void simpanBanyak(List<Object> daftarObject);
    
    // method untuk class Pemda
    public void hapus(Pemda p);
    public Pemda cariById(Integer id);
    public List<Pemda> cariSemua(Integer start, Integer rows);
    
    // method untuk class Profile
    
    // method untuk class User
    public void hapus(User p);
    
    // method untuk class Tahun
    
    // method untuk class Provinsi
    
    // Testing
    public List getPemdaPakeSpring();

    public List<Tprov> cariSemuaProvinsi();
}
