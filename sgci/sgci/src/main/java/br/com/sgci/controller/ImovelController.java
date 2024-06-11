package br.com.sgci.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("imoveis")

public class ImovelController {
	@GetMapping
	public ResponseEntity<String> findAll(){
		return ResponseEntity.ok("Olá mundo");
	}

}
