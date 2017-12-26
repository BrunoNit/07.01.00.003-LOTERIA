package br.com.pueyo.loteria.megasena.jogos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.pueyo.loteria.megasena.Jogo;
import br.com.pueyo.loteria.megasena.TipoJogo;

public class MegaSena implements Jogo {
	
	private String identificadorJogo;
	private List<Integer> dezenas;
	
	
	public MegaSena(String nome) {
		this.identificadorJogo = nome;
	}
	
	public MegaSena(String nome, List<Integer> dezenas) {
		this.identificadorJogo = nome;
		this.dezenas = dezenas;
	}

	public int getNumeroDezenas() {
		return this.dezenas.size();
	}



	public void adicionaDezena(String idJogo, Integer dezena) {
		if(dezenas == null){
			dezenas = new ArrayList<Integer>();
		}
		dezenas.add(dezena);
	}

	public Set<Integer> getAcertos(List<Integer> resultado) {
		Set<Integer> jogos = new HashSet<Integer>(this.dezenas);
		Set<Integer> resultadoSet = new HashSet<Integer>(resultado);
		jogos.retainAll(resultadoSet);
		return jogos;
	}

	public List<Integer> getPremiacao() {
		return Arrays.asList(4,5,6);
	}

	public TipoJogo getTipoJogo() {
		return TipoJogo.MEGA_SENA;
	}
	public void setJogoCompleto(List<Integer> dezenas) {
		this.dezenas = dezenas;
	}

	public String getIdentificadorJogo() {
		return identificadorJogo;
	}

	public void setIdentificadorJogo(String identificadorJogo) {
		this.identificadorJogo = identificadorJogo;
	}
	

}
