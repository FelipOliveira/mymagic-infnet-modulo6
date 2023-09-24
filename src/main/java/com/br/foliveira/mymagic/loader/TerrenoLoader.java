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

import com.br.foliveira.mymagic.model.negocio.Cor;
import com.br.foliveira.mymagic.model.negocio.Terreno;
import com.br.foliveira.mymagic.repository.TerrenoRepository;

@Order(1)
@Component
@Configuration
public class TerrenoLoader implements ApplicationRunner{
	
	Map<Integer, Terreno> mapaTerreno = new HashMap<Integer, Terreno>();
	
	@Bean
    CommandLineRunner initTerrenoDatabase(TerrenoRepository repository) {
        return args -> {
			FileReader file = new FileReader("arquivos/terreno.txt");
			BufferedReader br = new BufferedReader(file);
			
			String linha = br.readLine();
			
			String[] campos = null;
			
			while(linha != null) {
				campos = linha.split(";"); 
						
				Terreno terreno = new Terreno(
						Integer.valueOf(campos[0]),
						campos[1],
						Cor.valueOf(campos[2]),
						Integer.valueOf(campos[3])
					);				
				
				mapaTerreno.put(terreno.getCodigo(), terreno);
				repository.save(terreno);
				linha = br.readLine();
			}

			br.close();	
        };
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
		for(Terreno terreno : mapaTerreno.values()) {
			System.out.println(terreno);			
		}
    }
    
}
