package menu

import listacompras.ListaCompras.Companion.informarNomeAlimento
import listacompras.ListaCompras.Companion.informarQuantidadeVerduraGrao
import kotlin.system.exitProcess

class Menu {
    companion object {
        private var listaAlimentos: H<String, Number> = HashMap()


        fun menu() {
            println("Digite o tipo de alimento que deseja incluir na lista")
            println("Verdura")
            println("Legume")
            println("Grão")
            println("Outros")
            println("Ver lista")
            println("Sair")
            val alimento = readln().lowercase()

            if ((alimento != "verdura") && (alimento != "legume") && (alimento != "grão") && (alimento != "grao") && (alimento != "outros") && (alimento != "ver lista") && (alimento != "sair")) {
                throw IllegalArgumentException("Tipo de alimento inválido")
            }

            when (alimento) {
                "verdura", "grão", "grao" -> {
                    /*Não é para mexer aqui*/
                    val quantidade = informarQuantidadeVerduraGrao(alimento)
                    val nome = informarNomeAlimento(alimento)

                    listaAlimentos[nome] = quantidade
                    menu()
                }
                "legume", "outros" -> {
                    val quantidade = informarQuantidadeLegumeOutros(alimento)
                    val nome = informarNomeAlimento(alimento)
                    menu()
                }
                "ver lista" -> {
  if listaAlimentos.isEmpty())
                    println ( " Lista vazia " )
                    menu()
                } else{
                    println ( " ------- LISTA DE COMPRAS ------- " )
      /*listaAlimentos.forEach { alimento, quantidade ->  }*/
                println ( " Nome do item:  ${alimento}  - Quantidade:  ${quantidade} . " )
  }
                println ( " A quantidade de alimentosdo tipo outros a ser comprada é =  ${listaAlimentos.size} " )
                    menu()
            }
        }
                "sair" -> {
                    println("Até breve!")
                    exitProcess(0)
                }
            }
        }


    }
}