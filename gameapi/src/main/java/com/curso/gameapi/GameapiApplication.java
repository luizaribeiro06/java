package com.curso.gameapi;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
public class GameapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameapiApplication.class, args);

        testador();
	}

    //ZONA DE TESTE ***********************************************

    //TODO: Injetar o service
    //Injeção com construtor
    private static GameService gameService;

    public GameapiApplication(GameService gameService) {
        this.gameService = gameService;
    }

    //Métod0 static para test (pertence apeanas a classe e não à instância)
    static void testador(){
        //Criando um game
        Game gameA = new Game("Resident Evil Requiem", "Capcom", "Terror", Year.of(2026));

        //criando game
        //gameService.createGame(gameA);

        //buscando game por ID
        //gameService.gameById(1);

        //listando todos os games
        //gameService.allGames();

    }

    //ZONA DE TESTE ***********************************************

}
