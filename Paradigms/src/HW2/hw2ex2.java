package HW2;

import java.util.Arrays;

public class hw2ex2 {
    public static void main(String[] args) {
        /**
         * Нам нужно найти средний балл по всем студентам и вывести имена студентов, чей балл выше среднего.
         */

        Student[] student_data = {
                new Student("Alice",85),
                new Student("Bob",92),
                new Student("Charlie",78),
                new Student("David",95)
        };
        for (Student student:student_data) {
            System.out.println(student.getScore()+" -  "+student.getName());
        }

        //Структурная реализация
        System.out.println("-Структурный-");
        int sum=0;
        double avg=0;
        for (int i = 0; i < student_data.length; i++) {
            sum+=student_data[i].getScore();
        }
        avg=((double)sum)/student_data.length;
        System.out.printf("Среднее значение = %.2f \n",avg);
        for (int i = 0; i < student_data.length; i++) {
            if (student_data[i].getScore()>=avg) System.out.println(student_data[i].getName());;
        }

        //Процедурный подход
        System.out.println("-Процедурный-");
        goodStudents(student_data);
    }

    /**
     * Принимае массив студентов и возвращает средний бал.
     * @param student - массив студентов.
     */
    public static double avrScore(Student[] student){
        return (double) Arrays.stream(student)
                .map(a -> a.getScore())
                .mapToInt(a -> a)
                .sum() /student.length;
    }
    public static void goodStudents(Student[] students){
        double avr=avrScore(students);
        System.out.printf("Среднее значение = %.2f \n",avr);
        Arrays.stream(students)
                .filter(a->a.getScore()>avr)
                .forEach(a->System.out.println(a.getName()));
    }

    /**
     * Внутренний Класс студентов чтобы не делать отдельный класс
     */
    static class Student{
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }
}
