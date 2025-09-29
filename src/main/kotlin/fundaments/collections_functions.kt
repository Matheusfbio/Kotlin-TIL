package fundaments

fun main() {
    val username = listOf<String>("Matheus", "Maria", "Marta", "Ellicy", "Lucenilda","Natanael")

    val usernameStartWithWordM = username.filter { it.startsWith("M")}

    println("Pessoas com a inicial com M: $usernameStartWithWordM")
}


//fun main() {
//    // Criamos uma lista imutável (não pode ser alterada depois de criada)
//    // listOf cria uma coleção apenas de leitura
//    val numeros = listOf(1, 2, 3, 4, 5)
//
//    // Usando filter: percorre cada elemento da lista
//    // A lambda { it % 2 == 0 } retorna true só pros números pares
//    // "it" é a forma curta de se referir ao item atual da lista
//    val pares = numeros.filter { it % 2 == 0 }
//
//    // Usando map: aplica uma transformação em cada item da lista
//    // A lambda { it * 2 } pega cada número e multiplica por 2
//    val dobrados = numeros.map { it * 2 }
//
//    // println imprime o resultado no console
//    // pares vai ser [2, 4] porque só esses eram pares
//    println("Pares: $pares")
//
//    // dobrados vai ser [2, 4, 6, 8, 10] porque todos foram multiplicados por 2
//    println("Dobrados: $dobrados")
//}
