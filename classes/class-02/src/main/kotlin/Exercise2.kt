fun main() {
    var triangleBase = 0;
    var triangleHeight = 0;

    print("Digite a base do triângulo: ")
    triangleBase = readln().toInt();

    print("Digite a altura do triângulo: ")
    triangleHeight = readln().toInt();

    print("A área do triângulo é: ${(triangleBase * triangleHeight) / 2}")
}