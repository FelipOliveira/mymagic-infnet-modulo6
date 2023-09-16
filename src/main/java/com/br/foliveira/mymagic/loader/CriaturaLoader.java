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
import com.br.foliveira.mymagic.model.negocio.Criatura;

@Order(2)
@Component
public class CriaturaLoader implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<Integer, Criatura> mapaCriatura = new HashMap<Integer, Criatura>();

        FileReader file = new FileReader("arquivos/criatura.txt");
		BufferedReader br = new BufferedReader(file);
		
		String linha = br.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 
					
			Criatura criatura = new Criatura(
					Integer.valueOf(campos[0]),
                    campos[1],
                    Cor.valueOf(campos[2]),
					Integer.valueOf(campos[3]),
                    Integer.valueOf(campos[4]),
                    campos[5],
                    Integer.valueOf(campos[6])
				);				
			
			mapaCriatura.put(criatura.getCodigo(), criatura);

			linha = br.readLine();
		}

		for(Criatura criatura : mapaCriatura.values()) {
			System.out.println(criatura);			
		}

		br.close();	
    }
    
}
