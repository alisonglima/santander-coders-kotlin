fun main() {
    print("Digite o número: ");
    val number = readln().toInt();

    try {
        for(i in 1..number) {
            if(isPrimeNumber(i))
                println(i)
        }
    } catch (err: Exception) {
        print(err);
        return;
    }
}

fun isPrimeNumber(number: Int): Boolean {
    for(i in 2 ..number / 2)
        if(number % i == 0) {
            return false;
        };
    return true;
}