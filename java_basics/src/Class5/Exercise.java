package Class5;


public class Exercise {

    public static void main(String[] args) {

        Exercise exercise = new Exercise();
        System.out.println(exercise.isEvenNumber(11));

    }

    private String  isEvenNumber(Integer value) {

        // logic
        // value % 2 == 0 : even
        // false : odd

        if (value % 2 == 0) {
            // even
            return "true";
        } else {
            // odd
            return "false";
        }


    }

}
