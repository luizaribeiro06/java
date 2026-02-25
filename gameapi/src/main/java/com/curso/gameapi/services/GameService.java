package com.curso.gameapi.services;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//Anotação @Service: indica que uma classe será produtora de regras de negócio
@Service
public class GameService {

    //DONE: Injeção do repository
    //Faz a auto injeção de dependência entre as camadas MVC (o application está fora do MVC, então nao da para usar essa anotação)
    @Autowired
    private GameRepository gameRepository; //sem indicar nenhum valor ou construtor
    //os verbos determinam os tipos de objetos que serão utilizados

    //DONE: Método responsável por criar um novo game
    public Game createGame(Game newGame){

        try{
            gameRepository.save(newGame);
            System.out.println("Game criado com sucesso");
        } catch(Exception except)
        {
            System.out.println("Erro ao tentar criar o game.");
            System.out.println(except);
        }
        return newGame;
    };

    //DONE: Método responsável por buscar um game por ID
    public Game gameById(Integer gameId){
        //Criando um game vazio
        Game foundGame = new Game();

        //Tentar popular com alguma info
        try{
            foundGame = gameRepository.findById(gameId).get();
            System.out.println("Game encontrado com sucesso");
        } catch(Exception except)
        {
            System.out.println("Erro ao tentar encontrar o game.");
            System.out.println(except);
        }
        return foundGame;
    };

    //TODO: Método responsável por listar todos os games
    public ArrayList<Game> allGames(){
        //Criando uma lista vazia
        ArrayList<Game> all = new ArrayList<>();

        //populando lista
        gameRepository.findAll().forEach(game -> {
            all.add(game);
            System.out.println(game);
        });

        return all;
    }
}
