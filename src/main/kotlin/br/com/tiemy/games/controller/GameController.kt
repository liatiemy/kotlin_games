package br.com.tiemy.games.controller

import br.com.tiemy.games.model.Game
import br.com.tiemy.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class GameController{

    @Autowired
    lateinit var gameServices : GameService

    @GetMapping
    fun buscarTodos() : List<Game> {
        return gameServices.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game : Game) {
        gameServices.salvar(game)
    }

    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo : String) : List<Game>{
        return gameServices.buscarPor(nome = titulo)
    }

    @DeleteMapping(value = "{id}")
    fun apagar(@PathVariable(value = "id") id : String){
        return gameServices.apagar(id)
    }
}