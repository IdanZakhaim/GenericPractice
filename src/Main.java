public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Idan");
        Pair<String, Integer> swappedPair = swap(pair1);
        System.out.println("Swapped Pair - First: " + swappedPair.getFirst() + ", Second: " + swappedPair.getSecond());

    }

    public static <T, S> Pair<S, T> swap(Pair<T, S> pair) {
        T first = pair.getFirst();
        S second = pair.getSecond();
        return new Pair<>(second, first);
    }

}