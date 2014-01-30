package id.go.kemenkeu.djpk.usermanagement.controller;

import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TprovController {
    
    @Autowired
    private UserManagementService userManagementService;
    
    @RequestMapping("/referensi/tprov/edit")
    public void edit(){
        
    }
    
    @RequestMapping("/referensi/tprov/list")
    public ModelMap list(){
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("daftarProvinsi", userManagementService.cariSemuaProvinsi());
        
        return mm;
    }
}
