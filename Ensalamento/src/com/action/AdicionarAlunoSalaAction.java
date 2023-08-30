package com.action;

import com.service.EnsalamentoService;

public class AdicionarAlunoSalaAction extends Action {

	@Override
	public void process() throws Exception {
		
		String matricula = getRequest().getParameter("matricula");
		int numSala = Integer.parseInt(getRequest().getParameter("numSala"));
		
		EnsalamentoService ensalamentoService = serviceFactory.getEnsalamentoService();
		ensalamentoService.adicionarAlunoSala(matricula, numSala);
		
		redirect("ListarAlunos.com.action?numSala=" + numSala);
	}
}
