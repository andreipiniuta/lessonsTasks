package Task4A;

public class Task4A {// ввод из cmd
    private static final String DEFAULT_COURSE_NAME = "Basic JAVA";

    private static final int DEFAULT_COURSE_COST = 1000;

    private static final int DEFAULT_LESSON_COUNT = 30;

    private static final int DEFAULT_HOURS_IN_LESSON = 3;

    private static final int MINUTES_IN_HOUR = 60;

    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        String courseName = "";
        double courseCost = 0;
        double lessonCount = 0;
        double hoursInLesson = 0;
        if ((args.length < 0) || (args.length % 2 != 0) || (args.length > 10)) {// если вводим в cmd 1, 3, 5, 7,9, и более слов(цифр)
            System.out.println("Error");// пишем ошибку
            System.exit(0);// вырубаем прогу
        } else if (args.length == 0) {// если ничего не вводим, то данные для расчета берём из констант
            courseName = DEFAULT_COURSE_NAME;
            courseCost = DEFAULT_COURSE_COST;
            lessonCount = DEFAULT_LESSON_COUNT;
            hoursInLesson = DEFAULT_HOURS_IN_LESSON;
        } else if (args.length == 2) {// если вводим 2 слова(цифры)
            courseName = args[1];// название курса будет таким как ввели во втором слове т.е перемен courseName приравниваем значение ячейки №1
            courseCost = DEFAULT_COURSE_COST;// для остальных берём из констант
            lessonCount = DEFAULT_LESSON_COUNT;
            hoursInLesson = DEFAULT_HOURS_IN_LESSON;
        } else if (args.length == 4) {// если вводим 4 слова(цифры)
            courseName = args[1]; //название курса будет таким как ввели во втором слове
            courseCost = Double.parseDouble(args[3]); //перемен courseCost приравниваем значением из ячейки №3 т.е. из четвертого слова и переводим из строки в число
            lessonCount = DEFAULT_LESSON_COUNT; // для остальных берём из констант
            hoursInLesson = DEFAULT_HOURS_IN_LESSON;
        } else if (args.length == 6) {// тоже если вводим 6 слов(цифр)
            courseName = args[1];
            courseCost = Double.parseDouble(args[3]);
            lessonCount = Double.parseDouble(args[5]);
            hoursInLesson = DEFAULT_HOURS_IN_LESSON;
        } else {// тоже если вводим 8 слов(цифр)
            courseName = args[1];
            courseCost = Double.parseDouble(args[3]);
            lessonCount = Double.parseDouble(args[5]);
            hoursInLesson = Double.parseDouble(args[7]);// из констант уже ничего не берем так как все задано из cmd
        }
        double lessonCost = courseCost / lessonCount; //расчет
        double hourCost = lessonCost / hoursInLesson; //расчет
        double minuteCost = hourCost / MINUTES_IN_HOUR; //расчет
        double secondCost = minuteCost / SECONDS_IN_MINUTE; //расчет
        System.out.println("Name" + courseName);
        System.out.println("lesson=" + lessonCost +"bin");
        System.out.println("hour=" + hourCost +"bin");
        System.out.println("minute=" + minuteCost +"bin");
        System.out.println("second=" + secondCost +"bin");
    }
}
