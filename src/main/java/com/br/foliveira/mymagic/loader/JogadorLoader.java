package com.br.foliveira.mymagic.loader;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.br.foliveira.mymagic.model.negocio.Deck;
import com.br.foliveira.mymagic.model.negocio.Jogador;
import com.br.foliveira.mymagic.repository.JogadorRepository;

@Component
@Configuration
public class JogadorLoader implements ApplicationRunner{

	Jogador jogador = new Jogador();

	@Bean
	CommandLineRunner initJogadorDatabase(JogadorRepository repository){
		return args -> {
			FileReader file = new FileReader("arquivos/jogador.txt");
			BufferedReader br = new BufferedReader(file);
			
			String linha = br.readLine();
			
			String[] campos = null;
			
			while(linha != null) {
				campos = linha.split(";"); 
						
				jogador.setNome(campos[0]);
				jogador.setDeck(new Deck(campos[1]));
				
				repository.save(jogador);
				linha = br.readLine();
			}

			br.close();		
		};
	}

    @Override
    public void run(ApplicationArguments args) throws Exception {
		System.out.println(jogador);
    }
    
}
