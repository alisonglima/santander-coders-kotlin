fun main() {
    var numberOfVoters: Int = 0;
    var candidateAVotes: Int = 0;
    var candidateBVotes: Int = 0;
    var candidateCVotes: Int = 0;
    var whiteOrNullVotes: Int = 0;

    try {
        print("Digite o número total de eleitores: ");
        numberOfVoters = readln().toInt();

        for(i in 1..numberOfVoters) {
            print("Digite a letra do cadidato que deseja votar(A, B ou C): ");

            when(readln().uppercase()) {
                "A" -> candidateAVotes += 1;
                "B" -> candidateBVotes += 1;
                "C" -> candidateCVotes += 1;
                else -> whiteOrNullVotes += 1;
            }
        }
    } catch (err: Exception) {
        print(err);
        return;
    }

    println("Candidato A - $candidateAVotes votos (${calculatePercentage(numberOfVoters, candidateAVotes)}%)");
    println("Candidato B - $candidateBVotes votos (${calculatePercentage(numberOfVoters, candidateBVotes)}%)");
    println("Candidato C - $candidateCVotes votos (${calculatePercentage(numberOfVoters, candidateCVotes)}%)");
    println("Nulos e Brancos - $whiteOrNullVotes votos (${calculatePercentage(numberOfVoters, whiteOrNullVotes)}%)");
}

fun calculatePercentage(numberOfVoters: Int, votes: Int): Int {
    return try {
        ((votes.toDouble()/ numberOfVoters.toDouble()) * 100).toInt();
    } catch (err: Exception) {
        0;
    }
}