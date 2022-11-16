import java.util.Date

fun main() {
    print("Digite seu nome: ")
    var name = readln();

    print("Digite seu sobrenome: ")
    var surname = readln();

    print("Digite sua data de nascimento: ")
    var dateOfBirth = readln();

    var nickName: String = name.substring(0, 2) + surname.reversed() + dateOfBirth.takeLast(2)

    print("Nick gerado: ${nickName.lowercase()}")
}