package com.action;

import com.entity.Sala;
import com.service.EnsalamentoService;

public class ExcluirAlunoSalaAction extends Action {

	@Override
	public void process() throws Exception {
		
		String matricula = getRequest().getParameter("matricula");
		
		EnsalamentoService ensalamentoService = serviceFactory.getEnsalamentoService();
		Sala sala = ensalamentoService.getSalaByAluno(matricula);
		
		ensalamentoService.removerAlunoSala(matricula);
		
		redirect("ListarAlunos.com.action?numSala=" + sala.getNumero());
	}
}
