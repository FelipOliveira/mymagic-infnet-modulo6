package com.br.foliveira.mymagic.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.br.foliveira.mymagic.model.negocio.Artefato;
import com.br.foliveira.mymagic.model.negocio.Cor;
import com.br.foliveira.mymagic.repository.ArtefatoRepository;

@Order(2)
@Component
@Configuration
public class ArtefatoLoader implements ApplicationRunner{

	Map<Integer, Artefato> mapaArtefato = new HashMap<Integer, Artefato>();

	@Bean
	CommandLineRunner initArtefatoDatabase(ArtefatoRepository repository){
		return args -> {
			FileReader file = new FileReader("arquivos/artefato.txt");
			BufferedReader br = new BufferedReader(file);
			
			String linha = br.readLine();
			
			String[] campos = null;
			
			while(linha != null) {
				campos = linha.split(";"); 
						
				Artefato artefato = new Artefato(
						Integer.valueOf(campos[0]),
						campos[1],
						Cor.valueOf(campos[2]),
						Boolean.valueOf(campos[3]),
						campos[4],
						Integer.valueOf(campos[5])
					);				
				
				mapaArtefato.put(artefato.getId(), artefato);
				repository.save(artefato);
				linha = br.readLine();
			}

			br.close();	
		};
	}

    @Override
    public void run(ApplicationArguments args) throws Exception {
		for(Artefato artefato : mapaArtefato.values()) {
			System.out.println(artefato);			
		}
    }
    
}
