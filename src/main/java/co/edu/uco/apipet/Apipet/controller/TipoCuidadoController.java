package co.edu.uco.apipet.Apipet.controller;

import co.edu.uco.apipet.Apipet.dto.TipoCuidadoDTO;
import co.edu.uco.apipet.Apipet.service.TipoCuidadoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/apipet/v1/tipocuidado")
public class TipoCuidadoController {

    private final TipoCuidadoService tipoCuidadoService;

    public TipoCuidadoController(TipoCuidadoService tipoCuidadoService){
        this.tipoCuidadoService = tipoCuidadoService;
    }

    @PostMapping("/registrar")
    public TipoCuidadoDTO saveTipoCuidado(@RequestBody TipoCuidadoDTO tipoCuidadoDTO){
        return tipoCuidadoService.saveTipoCuidado(tipoCuidadoDTO);
    }
}
