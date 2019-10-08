package com.POOA.gestao04.controller;

import com.POOA.gestao04.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {
    
    @Autowired
    Convidados convidadosTable;
    
    @GetMapping("/convidados")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("ListaConvidados");
    
        mv.addObject("convidados", convidadosTable.findAll());
    
        return mv;   
    }
}
