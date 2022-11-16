fun main() {
    var biggerValue: Int = Int.MIN_VALUE;
    var smallerValue: Int = Int.MAX_VALUE;

    try {
        for(i in 1..10) {
            println("Digite o ${i}º valor: ");
            var value = readln().toInt();

            if (value > biggerValue) biggerValue = value;
            if (value < smallerValue) smallerValue = value;
        }
    } catch (err: Exception) {
        print(err);
        return;
    }

    print("O menor valor inserido foi $smallerValue e o maior foi $biggerValue.")
}