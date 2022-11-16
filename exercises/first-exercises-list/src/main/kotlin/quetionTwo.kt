fun main() {
    print("Digite o número que deseja ver sua tabuada: ");
    val number = readln().toInt();

    try {
        for(i in 1..10) {
            println("${i}x$number=${i*number}")
        }
    } catch (err: Exception) {
        print(err);
        return;
    }
}