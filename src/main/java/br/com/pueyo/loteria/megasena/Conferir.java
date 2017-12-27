package br.com.pueyo.loteria.megasena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.pueyo.loteria.megasena.jogos.MegaSena;

public class Conferir {
	
	public static void main(String[] args) {
		
		List<Integer> resultado = Arrays.asList(27,34,38,46,48,49);
		
		List<MegaSena> listaJogos = new ArrayList<MegaSena>();
		listaJogos.add(new MegaSena("Jogo01A", Arrays.asList(14,17,22,33,34,56)));
		listaJogos.add(new MegaSena("Jogo01B", Arrays.asList(02,33,36,40,55,60)));
		listaJogos.add(new MegaSena("Jogo01C", Arrays.asList(30,32,34,41,52,54)));
		listaJogos.add(new MegaSena("Jogo01D", Arrays.asList(10,16,33,38,44,58)));
		listaJogos.add(new MegaSena("Jogo01E", Arrays.asList(01,24,28,51,52,55)));
		listaJogos.add(new MegaSena("Jogo01F", Arrays.asList(21,26,30,33,35,36)));
		listaJogos.add(new MegaSena("Jogo01G", Arrays.asList(03,28,33,44,49,56)));
		listaJogos.add(new MegaSena("Jogo01H", Arrays.asList(6,8,27,34,39,57)));
		listaJogos.add(new MegaSena("Jogo01I", Arrays.asList(6,9,13,54,55,57)));
		listaJogos.add(new MegaSena("Jogo01J", Arrays.asList(11,25,26,33,56,59)));
		
		listaJogos.add(new MegaSena("Jogo02A", Arrays.asList(13,1624,45,51,57)));
		listaJogos.add(new MegaSena("Jogo02B", Arrays.asList(11,17,38,39,47,59)));
		listaJogos.add(new MegaSena("Jogo02C", Arrays.asList(3,9,22,51,55,59)));
		listaJogos.add(new MegaSena("Jogo02D", Arrays.asList(7,12,27,28,31,57)));
		listaJogos.add(new MegaSena("Jogo02E", Arrays.asList(17,19,26,39,42,44)));
		listaJogos.add(new MegaSena("Jogo02F", Arrays.asList(5,9,10,16,20,35)));
		listaJogos.add(new MegaSena("Jogo02G", Arrays.asList(27,34,38,46,48,49)));
		listaJogos.add(new MegaSena("Jogo02H", Arrays.asList(1,14,35,43,49,52)));
		listaJogos.add(new MegaSena("Jogo02I", Arrays.asList(4,11,24,31,34,39)));
		listaJogos.add(new MegaSena("Jogo02J", Arrays.asList(4,13,28,30,56,59)));
		

		
		listaJogos.add(new MegaSena("Jogo03A", Arrays.asList(9,10,16,31,42,44)));
		listaJogos.add(new MegaSena("Jogo03B", Arrays.asList(12,13,19,43,47,51)));
		listaJogos.add(new MegaSena("Jogo03C", Arrays.asList(14,15,16,26,37,60)));
		listaJogos.add(new MegaSena("Jogo03D", Arrays.asList(8,14,20,25,45,47)));
		listaJogos.add(new MegaSena("Jogo03E", Arrays.asList(4,12,18,19,35,54)));
		listaJogos.add(new MegaSena("Jogo03F", Arrays.asList(6,31,40,42,54,59)));
		listaJogos.add(new MegaSena("Jogo03G", Arrays.asList(10,16,34,40,50,54)));
		listaJogos.add(new MegaSena("Jogo03H", Arrays.asList(27,34,40,41,49,53)));
		listaJogos.add(new MegaSena("Jogo03I", Arrays.asList(19,33,38,49,53,58)));
		listaJogos.add(new MegaSena("Jogo03J", Arrays.asList(2,4,25,32,44,58)));

		listaJogos.add(new MegaSena("Jogo04A", Arrays.asList(21,30,31,39,43,60)));
		listaJogos.add(new MegaSena("Jogo04B", Arrays.asList(2,9,13,16,41,42)));
		listaJogos.add(new MegaSena("Jogo04C", Arrays.asList(20,21,34,44,56,59)));
		listaJogos.add(new MegaSena("Jogo04D", Arrays.asList(18,37,38,44,50,56)));
		listaJogos.add(new MegaSena("Jogo04E", Arrays.asList(4,17,41,48,50,57)));
		listaJogos.add(new MegaSena("Jogo04F", Arrays.asList(3,14,29,48,54,56)));
		listaJogos.add(new MegaSena("Jogo04G", Arrays.asList(11,21,37,45,55,59)));
		listaJogos.add(new MegaSena("Jogo04H", Arrays.asList(7,12,29,30,41,51)));
		listaJogos.add(new MegaSena("Jogo04I", Arrays.asList(3,10,22,29,47,57)));
		listaJogos.add(new MegaSena("Jogo04J", Arrays.asList(3,15,30,34,35,52)));
		
		listaJogos.add(new MegaSena("Jogo05A", Arrays.asList(7,12,18,22,49,53)));
		listaJogos.add(new MegaSena("Jogo05B", Arrays.asList(8,9,17,22,46,59)));
		listaJogos.add(new MegaSena("Jogo05C", Arrays.asList(2,18,21,25,31,57)));
		listaJogos.add(new MegaSena("Jogo05D", Arrays.asList(15,19,31,38,45,50)));
		listaJogos.add(new MegaSena("Jogo05E", Arrays.asList(12,19,27,32,46,60)));
		listaJogos.add(new MegaSena("Jogo05F", Arrays.asList(1,7,35,49,51,55)));
		listaJogos.add(new MegaSena("Jogo05G", Arrays.asList(23,26,32,39,40,50)));
		listaJogos.add(new MegaSena("Jogo05H", Arrays.asList(12,18,23,35,52,53)));
		listaJogos.add(new MegaSena("Jogo05I", Arrays.asList(11,14,24,30,41,58)));
		listaJogos.add(new MegaSena("Jogo05J", Arrays.asList(04,11,18,28,46,54)));
		
		listaJogos.add(new MegaSena("Jogo06A", Arrays.asList(4,18,19,23,39,48)));
		listaJogos.add(new MegaSena("Jogo06B", Arrays.asList(8,17,18,43,45,51)));
		listaJogos.add(new MegaSena("Jogo06C", Arrays.asList(12,20,25,27,33,46)));
		listaJogos.add(new MegaSena("Jogo06D", Arrays.asList(15,22,24,28,40,45)));
		listaJogos.add(new MegaSena("Jogo06E", Arrays.asList(6,19,25,27,42,49)));
		listaJogos.add(new MegaSena("Jogo06F", Arrays.asList(7,11,16,17,39,52)));
		listaJogos.add(new MegaSena("Jogo06G", Arrays.asList(5,7,11,20,24,56)));
		listaJogos.add(new MegaSena("Jogo06H", Arrays.asList(2,5,11,12,20,28)));
		
		listaJogos.add(new MegaSena("Jogo07A", Arrays.asList(7,11,15,19,36,39,52)));
		
		listaJogos.add(new MegaSena("Jogo08A", Arrays.asList(12,13,17,19,25,39,41,43,47,51,53)));
		
		for(MegaSena ms: listaJogos){
			int acertos = ms.getAcertos(resultado).size();
			if(ms.getPremiacao().indexOf(acertos) >= 0){
				System.out.println(ms.getTipoJogo() + ": " + ms.getIdentificadorJogo() + " - ACERTOS: " + acertos);
				for(Integer d: ms.getAcertos(resultado)){
					System.out.print("[" + d +"]");
				}
				System.out.println("");
				System.out.println("-----------");
			};
		}
		
		
	}

}
