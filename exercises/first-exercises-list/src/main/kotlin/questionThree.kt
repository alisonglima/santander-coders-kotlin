fun main() {
    val numbers = mutableListOf<Int>();

    try {
        for(i in 1..15) {
            print("Digite o ${i}º valor: ");
            val value = readln().toInt();

            numbers.add(value);
        }
    } catch (err: Exception) {
        print(err);
        return;
    }

    for (i in 14 downTo 0) {
        println(numbers[i]);
    }
}