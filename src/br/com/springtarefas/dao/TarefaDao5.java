package br.com.springtarefas.dao;

import java.util.List;

import br.com.springtarefas.modelo.Tarefa5;

public interface TarefaDao5 {
	Tarefa5 buscaPorId(Long id);
	List<Tarefa5> lista();
	void adiciona(Tarefa5 t);
	void altera(Tarefa5 t);
	void remove(Tarefa5 t);
	void finaliza(Long id);
}
