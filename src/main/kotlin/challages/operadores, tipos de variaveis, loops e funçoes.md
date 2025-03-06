Claro! Aqui estão os desafios para cada um dos tópicos mencionados:

### Desafio 1: Operadores

**Desafio:** Crie uma função chamada `calcularOperacao` que realiza operações básicas de cálculo com dois números. A função deve receber três parâmetros: o primeiro número (`Double`), o segundo número (`Double`), e o tipo de operação (`String`). A função deve retornar o resultado da operação correspondente.

- Se o tipo de operação for "soma", retorne a soma dos dois números.
- Se o tipo de operação for "subtracao", retorne a subtração dos dois números.
- Se o tipo de operação for "multiplicacao", retorne a multiplicação dos dois números.
- Se o tipo de operação for "divisao", retorne a divisão dos dois números (certifique-se de tratar a divisão por zero).

**Exemplo:**
```kotlin
fun calcularOperacao(num1: Double, num2: Double, operacao: String): Double {
    // Implementação aqui
}

fun main() {
    println(calcularOperacao(10.0, 5.0, "soma")) // Deve retornar 15.0
    println(calcularOperacao(10.0, 0.0, "divisao")) // Deve retornar "Erro: Divisão por zero"
}
```

### Desafio 2: Tipos de Variáveis

**Desafio:** Crie uma função chamada `tipoVariavel` que recebe um parâmetro de qualquer tipo (`Any`) e retorna uma `String` indicando o tipo do parâmetro. Utilize o operador `is` para determinar o tipo do parâmetro.

**Exemplo:**
```kotlin
fun tipoVariavel(param: Any): String {
    // Implementação aqui
}

fun main() {
    println(tipoVariavel(42)) // Deve retornar "Int"
    println(tipoVariavel("Olá")) // Deve retornar "String"
    println(tipoVariavel(3.14)) // Deve retornar "Double"
}
```

### Desafio 3: Loops

**Desafio:** Crie uma função chamada `fatorial` que calcula o fatorial de um número inteiro positivo utilizando um loop `for`. O fatorial de um número `n` é o produto de todos os números inteiros de 1 até `n`.

**Exemplo:**
```kotlin
fun fatorial(n: Int): Int {
    // Implementação aqui
}

fun main() {
    println(fatorial(5)) // Deve retornar 120
}
```

### Desafio 4: Funções

**Desafio:** Crie uma função chamada `encontrarMaior` que recebe uma lista de inteiros e retorna o maior valor da lista. Se a lista estiver vazia, a função deve retornar `null`.

**Exemplo:**
```kotlin
fun encontrarMaior(lista: List<Int>): Int? {
    // Implementação aqui
}

fun main() {
    println(encontrarMaior(listOf(3, 7, 2, 8, 5))) // Deve retornar 8
    println(encontrarMaior(emptyList())) // Deve retornar null
}
```