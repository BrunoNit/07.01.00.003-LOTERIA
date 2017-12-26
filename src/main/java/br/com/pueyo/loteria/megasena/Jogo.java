package br.com.pueyo.loteria.megasena;

import java.util.List;
import java.util.Set;

public interface Jogo {
	
	public int getNumeroDezenas();
	public void setJogoCompleto(List<Integer> dezenas);
	public void adicionaDezena(String idJogo, Integer dezena);
	public Set<Integer> getAcertos(List<Integer> resutlado); 
	public List<Integer> getPremiacao();
	public TipoJogo getTipoJogo();
	
	

}
