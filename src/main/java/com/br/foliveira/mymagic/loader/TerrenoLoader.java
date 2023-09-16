package com.br.foliveira.mymagic.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.br.foliveira.mymagic.model.negocio.Cor;
import com.br.foliveira.mymagic.model.negocio.Terreno;

@Order(1)
@Component
public class TerrenoLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        
        Map<Integer, Terreno> mapaTerreno = new HashMap<Integer, Terreno>();

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

			linha = br.readLine();
		}

		for(Terreno terreno : mapaTerreno.values()) {
			System.out.println(terreno);			
		}

		br.close();	
    }
    
}
