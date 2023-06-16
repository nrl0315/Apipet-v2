package co.edu.uco.apipet.Apipet.controller;

import co.edu.uco.apipet.Apipet.dto.TipoCuidadoDTO;
import co.edu.uco.apipet.Apipet.service.TipoCuidadoService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
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
