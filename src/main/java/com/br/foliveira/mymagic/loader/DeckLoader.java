package com.br.foliveira.mymagic.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.br.foliveira.mymagic.model.negocio.Artefato;
import com.br.foliveira.mymagic.model.negocio.Cor;
import com.br.foliveira.mymagic.model.negocio.Criatura;
import com.br.foliveira.mymagic.model.negocio.Deck;
import com.br.foliveira.mymagic.model.negocio.Terreno;

@Order(5)
@Component
public class DeckLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<String, Deck> mapaDeck = new HashMap<String, Deck>();
		
		FileReader file = new FileReader("arquivos/deck.txt");
		BufferedReader br = new BufferedReader(file);
		
		String linha = br.readLine();
		
		String[] campos = null;
		
		Deck deck = null;
		
		while(linha != null) {
			campos = linha.split(";"); 

			switch (campos[0]) {
			case "T":				
				Terreno terreno = new Terreno(
					Integer.valueOf(campos[1]),
                    campos[2],
                    Cor.valueOf(campos[3]),
                    Integer.valueOf(campos[4])
				);				
				
				deck.getCartas().add(terreno);
				
				break;

			case "C":
				
				Criatura criatura = new Criatura(
                    Integer.valueOf(campos[1]),
                    campos[2],
                    Cor.valueOf(campos[3]),
					Integer.valueOf(campos[4]),
                    Integer.valueOf(campos[5]),
                    campos[6],
                    Integer.valueOf(campos[7])
					);
				
				deck.getCartas().add(criatura);
				
				break;

			case "A":			
				
				Artefato artefato = new Artefato(
                    Integer.valueOf(campos[1]),
                    campos[2],
                    Cor.valueOf(campos[3]),
					Boolean.valueOf(campos[4]),
                    campos[5],
                    Integer.valueOf(campos[6])
				);
				
				deck.getCartas().add(artefato);

				break;

			default:
            
				deck = new Deck(
					campos[0]
				);				

				mapaDeck.put(deck.getNome(), deck);

				break;
			}
			
			linha = br.readLine();
		}

		for(Deck d : mapaDeck.values()) {
			System.out.println(d);			
		}

		br.close();	
    }
    
}
