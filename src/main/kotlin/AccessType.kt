import java.io.IO.println

fun main() {
    acessTypes(32)
}

fun acessTypes(access: Int) {
    when (access) {
        1 -> println("leitura")
        2 -> println("escrita")
        3 -> println("leitura e escrita")
        else -> println("Tipo de acesso invalido")
    }

}
