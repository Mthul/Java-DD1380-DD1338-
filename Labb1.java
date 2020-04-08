public class Word_adder {


    public String[] string_maker(String[] n) {
        S

        int a = n.length();

        if (a > 10000 && a < 2){

            return "The string is too short. Add more words"

        } else {

            String[] name = [];
            for ( int i = 0; i < a-1; i++){
                name += n[i];

            }

        }

        return name

    }

    public static void main( String[] args) {

        Word_adder new_string = new string_maker( ["yo", "a", "a", "hoo", "laa"] );
        System.out.println(new_string);

    }

}