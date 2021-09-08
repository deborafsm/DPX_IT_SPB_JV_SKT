package com.stockdpx.stockdpx.controller;

import com.stockdpx.stockdpx.model.Computador;
import com.stockdpx.stockdpx.service.StockComputadorService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
@Controller
public class StockComputadorController {
    @Autowired
    StockComputadorService stockComputadorService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/computador", method=RequestMethod.GET)
    public ModelAndView getPc(){
        ModelAndView mv = new ModelAndView("posts");
        List<Computador> computador = stockComputadorService.findAll();
        mv.addObject("Computador", computador);
        return mv;
    }
}
