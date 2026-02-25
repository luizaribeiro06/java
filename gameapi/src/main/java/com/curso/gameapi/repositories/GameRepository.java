package com.curso.gameapi.repositories;

import com.curso.gameapi.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Anotação que indica uma interface como repositório com o DB
@Repository
//A interface CrudRepository traz a possibilidade de trabalhar com métodos CRUD
//Indica-se dentro o <tipo a ser transitado, tipo da chave primária>
public interface GameRepository extends CrudRepository<Game, Integer> {
    //Não precisamos indicar nenhum métod0 no momento, só precisará de mais caso os que já existam não atendam nossa necessidade
}
