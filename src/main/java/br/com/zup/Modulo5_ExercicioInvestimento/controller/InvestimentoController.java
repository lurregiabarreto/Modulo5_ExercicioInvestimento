package br.com.zup.Modulo5_ExercicioInvestimento.controller;

import br.com.zup.Modulo5_ExercicioInvestimento.DTO.InvestimentoDTO;
import br.com.zup.Modulo5_ExercicioInvestimento.DTO.RetornoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/investimento")

public class InvestimentoController {


    @Autowired
    private InvestimentoService simulacao;


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public RetornoDTO simularInvestimento(@RequestBody InvestimentoDTO investimentoDTO) {
        //return  simulacao.(investimentoDTO);


    }
}

