package com.br.foliveira.mymagic.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.br.foliveira.mymagic.model.negocio.Deck;
import com.br.foliveira.mymagic.model.negocio.Jogador;

public class JogadorLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("arquivos/jogador.txt");
		BufferedReader br = new BufferedReader(file);
		
		String linha = br.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 
					
			Jogador jogador = new Jogador(
				campos[0],
                new Deck(campos[1])
			);

			//JogadorController.incluir(jogador);
			
			linha = br.readLine();
		}

		br.close();			
    }
    
}
