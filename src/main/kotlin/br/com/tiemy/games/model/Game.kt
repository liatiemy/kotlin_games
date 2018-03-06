package br.com.tiemy.games.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Game(@Id val id: String? = null,
                var nome: String,
                var urlImagem: String,
                var anoLancamento: Integer)

//val id: String tem apenas o GET. na hora que cria-lo nao sera necessario altera-lo posteriormente
//var nome: String tem GET e SET