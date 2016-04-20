package other.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Test {

    static class TestUnit {

        private String question;
        private int rightAnswer;
        private List<String> variants;

        public TestUnit(String question, int rightAnswer, List<String> variants) {
            this.question = question;
            this.rightAnswer = rightAnswer;
            this.variants = variants;
        }

        public String getQuestion() {
            return question;
        }

        public int getRightAnswer() {
            return rightAnswer;
        }

        public List<String> getVariants() {
            return variants;
        }

    }

    private static List<TestUnit> lesson01 = Arrays.asList(
            new TestUnit("Сколько бит занимает переменная типа int?", 2, Arrays.asList("1) 8", "2) 32", "3) 64", "4) 16")),
            new TestUnit("Сколько значений может принимать переменная типа boolean?", 1, Arrays.asList("1) 2", "2) 1", "3) 4", "4) 3")),
            new TestUnit("Сколько примитивных типов данных в языке Java?", 1, Arrays.asList("1) 8", "2) 7", "3) 9", "4) 2")),
            new TestUnit("Может ли переменной типа char присвоить отрицательное значение?", 2, Arrays.asList("1) Да", "2) Нет")),
            new TestUnit("Сколько битов в одном байте?", 4, Arrays.asList("1) 16", "2) 2", "3) В зависимости от ОС", "4) 8")),
            new TestUnit("Выберите самый быстрый тип памяти?", 3, Arrays.asList("1) Кэш первого уровня CPU", "2) RAM", "3) Регистры CPU", "4) SSD RAM")),
            new TestUnit("Чему равно число 7 в двоичной системе исчисления?", 1, Arrays.asList("1) 111", "2) 101", "3) 011", "4) 110")),
            new TestUnit("Java является...", 1, Arrays.asList("1) статически типизированным языком", "2) динамически типизированным языком")),
            new TestUnit("Какова текущая версия Java'ы?", 1, Arrays.asList("1) 8", "2) 7", "3) 6", "4) 9")),
            new TestUnit("Сколько бит занимает переменная типа short?", 2, Arrays.asList("1) 8", "2) 16", "3) 2", "4) 4"))
    );

    public static void runTest() throws IOException {
        List<TestUnit> test = Test.lesson01;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String separator = "--------------------------------------------";
        int answerCount = 0;

        System.out.println(separator + "\n-------------- Test Beta 1.0 ---------------\n" + separator);

        for (TestUnit tu : test) {
            System.out.println(tu.getQuestion());
            for (String var : tu.getVariants()){
                System.out.println(var);
            }
            System.out.println("Enter your answer: ");
            String selectedVariant = reader.readLine();
            int selectedVariantNum = Integer.parseInt(String.valueOf(selectedVariant.charAt(0)));
            if (selectedVariantNum == tu.getRightAnswer()) {
                answerCount++;
                System.out.println("Верно!");
            } else {
                System.out.println("Не верно!");
            }
            System.out.println(separator);
        }
        System.out.println(separator + "\nВаш результат: " + answerCount + "/10.");
        if (answerCount > 8) {
            System.out.println("Тест пройден!");
        } else {
            System.out.println("Тест не пройден!");
        }
        System.out.println(separator);
    }
}
