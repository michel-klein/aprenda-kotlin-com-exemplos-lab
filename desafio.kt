enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun matriculados() {
        println(inscritos)
    }
}

fun main() {
    val kotlinIniciante = ConteudoEducacional("kotlin iniciante")
    val kotlinIntermediario = ConteudoEducacional("kotlin intermediário")
    val kotlinAvancado = ConteudoEducacional("kotlin avançado")
    val formacaoKotlin = Formacao("Kotlin", listOf(kotlinIniciante, kotlinIntermediario, kotlinAvancado))
    println(formacaoKotlin)
    val usuarioZezinho = Usuario("Zezinho da Silva")
    formacaoKotlin.matricular(usuarioZezinho)
    formacaoKotlin.matriculados()
}
