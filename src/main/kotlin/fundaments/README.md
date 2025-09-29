Top! Mandar bala em **Kotlin puro** é um jeito ninja de criar musculatura antes de cair no caos do Android. Assim você aprende a pensar em Kotlin sem depender de XML, Gradle, Activity e todas aquelas burocracias. É como treinar espada de madeira antes da katana real.

O que você precisa é praticar os **fundamentos da linguagem** escrevendo pequenos programas. Dá pra rodar direto no terminal com `kotlinc` ou usar o **Kotlin Playground** (site oficial da JetBrains).

Aqui vai um caminho de prática só com Kotlin puro:

---

### 1. **Aquecimento: variáveis e tipos**

Crie pequenos scripts para manipular dados.

```kotlin
fun main() {
    val nome = "Mateus"
    var idade = 23
    println("Olá, meu nome é $nome e tenho $idade anos")
}
```

Exercício:

* Crie variáveis `val` e `var` com tipos diferentes.
* Tente somar `Int` com `Double` e veja como o Kotlin reclama.

---

### 2. **Controle de fluxo**

```kotlin
fun main() {
    val nota = 7
    if (nota >= 6) println("Aprovado!") else println("Reprovado!")

    val dia = 3
    val nomeDia = when (dia) {
        1 -> "Segunda"
        2 -> "Terça"
        3 -> "Quarta"
        else -> "Outro dia"
    }
    println(nomeDia)
}
```

Exercício:

* Crie um programa que leia um número e diga se é **par ou ímpar**.

---

### 3. **Funções**

```kotlin
fun soma(a: Int, b: Int) = a + b

fun main() {
    println(soma(10, 5))
}
```

Exercício:

* Faça uma função `ehPrimo(n: Int): Boolean`.
* Chame ela dentro do `main` e teste vários números.

---

### 4. **Coleções + lambdas**

```kotlin
fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val pares = numeros.filter { it % 2 == 0 }
    val dobrados = numeros.map { it * 2 }

    println("Pares: $pares")
    println("Dobrados: $dobrados")
}
```

Exercício:

* Crie uma lista de nomes e filtre só os que começam com “M”.

---

### 5. **Classes e objetos**

```kotlin
data class Pessoa(val nome: String, var idade: Int)

fun main() {
    val p1 = Pessoa("Mateus", 23)
    println(p1)
}
```

Exercício:

* Crie uma classe `Carro` com `marca`, `modelo`, `ano`.
* Escreva uma função que calcule se o carro é “novo” (menos de 3 anos) ou “velho”.

---

### 6. **Null safety**

```kotlin
fun main() {
    var nome: String? = null
    println(nome?.length ?: 0) // Elvis operator
}
```

Exercício:

* Crie uma função que receba um `String?` e retorne o tamanho da string ou `-1` se for nulo.

---

### 7. **Coroutines (mini introdução)**

Não precisa Android pra brincar:

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Depois de 1 segundo")
    }
    println("Início")
}
```

Exercício:

* Faça duas coroutines que printam números em paralelo.

---

### 8. **Projetinho Kotlin puro**

Quando dominar os básicos, faça algo simples como:

* Um **sistema de cadastro** em memória (lista de objetos).
* Uma **calculadora de notas escolares** (com média e aprovação).
* Um **gerador de senhas aleatórias**.

---

Quer que eu te monte um **cronograma de exercícios (tipo 7 dias, 1h por dia)** só com Kotlin puro, focado em te dar base sólida antes do Android?
