package com.action;

import java.util.List;

import com.service.SalaService;
import com.entity.Sala;

public class ListarSalasAction extends Action {

	@Override
	public void process() throws Exception {
		
		SalaService salaService = serviceFactory.getSalaService();
		List<Sala> salas = salaService.getSalas();
		
		getRequest().setAttribute("salas", salas);
		forward("lista_salas.jsp");
	}
}
