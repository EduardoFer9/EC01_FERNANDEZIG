package pe.edu.idat.EC1Rest_FernandezIgnacio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.idat.EC1Rest_FernandezIgnacio.dto.MesDto;
import pe.edu.idat.EC1Rest_FernandezIgnacio.service.FundamentosService;

public class FundamentosController {
    @GetMapping({"/mes", "/mes/{numero}"})
    public ResponseEntity<MesDto> obtenerMes(
            @PathVariable(required = false) Integer numero) {
        if (numero == null) numero = 1; // valor por defecto
        MesDto mesDto = new MesDto();
        mesDto.setNumero(numero);
        mesDto.setMes(FundamentosService.obtenerNombreMes(numero));
        return ResponseEntity.ok(mesDto);
    }


}
