//package com.example.proyectosping.services;
//
//import com.example.proyectosping.Modellenity.Postre;
//import com.example.proyectosping.dao.IPostreDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PostreService implements IPostreServicio{
//
//    @Autowired
//    private IPostreDAO postreDAO;
//
//
//
//    @Override
//    public List<Postre> findAll() {
//        return postreDAO.findAll();
//    }
//
//    @Override
//    public Postre save(Postre postre) {
//        return postreDAO.save(postre);
//    }
//
//    @Override
//    public Postre findById(Long id) {
//    return  postreDAO.findById(id).orElse(null);
//
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        postreDAO.deleteById(id);
//    }
//}
