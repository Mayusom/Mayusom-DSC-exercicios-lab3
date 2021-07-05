package dsc.lab2.controladores;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dsc.lab2.dtos.RespostaLoginDTO;
import dsc.lab2.entidades.Usuario;
import dsc.lab2.servicos.ServicoDeJWT;

@RestController
@RequestMapping("/auth")
public class ControladorDeLogin {
	
	@Autowired
	private ServicoDeJWT jwtService;
	
	@PostMapping("/login")
	public ResponseEntity<RespostaLoginDTO> autentica(@RequestBody Usuario usuario) throws ServletException{
		return new ResponseEntity<RespostaLoginDTO>(jwtService.autheticate(usuario), HttpStatus.OK);
		
	}
	
}
