package co.edu.uco.apipet.Apipet.controller;

import co.edu.uco.apipet.Apipet.dto.EspecieDTO;
import co.edu.uco.apipet.Apipet.service.EspecieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/apipet/v1/especie")
public class EspecieController {

    private final EspecieService especieService;

    public EspecieController(EspecieService especieService){
        this.especieService = especieService;
    }

    @PostMapping("/registrar")
    public EspecieDTO saveEspecie(@RequestBody EspecieDTO especieDTO){
        return especieService.saveEspecie(especieDTO);
    }
}
