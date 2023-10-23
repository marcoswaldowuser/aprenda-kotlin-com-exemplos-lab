// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome:String, val email:String, val numerodetelefone:String, val idade:Int)

data class ConteudoEducacional(var nome: String, val duracao: Int= 0)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    
    val inscritos = mutableListOf<Usuario>()
          
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado no curso $nome. NIVEL ${Nivel.INTERMEDIARIO}")
    }
}

fun main() {    
    val GradeCurricular1 = ConteudoEducacional("Algoritimo", 20)
    val GradeCurricular2 = ConteudoEducacional("Programação kotlin iniciante", 160)
    val GradeCurricular3 = ConteudoEducacional("Programação kotlin para web", 60)
    val GradeCurricular4 = ConteudoEducacional("Programação kotlin front-end", 85)
    val GradeCurricular5 = ConteudoEducacional("Programação kotlin back-end", 96)
    val GradeCurricular6 = ConteudoEducacional("Técnicas para programção kotlin segura", 35)
    
    val curso = Formacao("Programador Full-stack kotlin", listOf(GradeCurricular1,
                                                             GradeCurricular2,
                                                             GradeCurricular3,
                                                             GradeCurricular4,
                                                             GradeCurricular5,
                                                             GradeCurricular6))
    
    var Aluno1 = Usuario("Pedro","Pedropab@outlook.com","579325641",19)
	var Aluno2 = Usuario("Jonas","Jonasapoc@outlook.com","579325641",29)
    
    curso.matricular(Aluno1)
    curso.matricular(Aluno2)
    
    println("${curso.inscritos.size} alunos ao todo foram matriculados.")
    
}
