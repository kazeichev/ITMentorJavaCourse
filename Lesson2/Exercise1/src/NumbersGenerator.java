public class NumbersGenerator {
    private int[] generate(int n) {
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        return numbers;
    }

    public void run(int n) {
        int[] randomNumbers = this.generate(n);
        for (int number: randomNumbers) {
            double square = Math.sqrt(number);

            if ((int)square == number) {
                System.out.println(number);
            }
        }
    }
}