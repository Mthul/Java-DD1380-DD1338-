
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Excercise 1
// Skapa en method som tar in två integers, from och to. som därefter printar
//ut intervallet mellan dem i en lista.
class ListProcessor
{

    public int[] arraySequence(int from, int to)
    {
      int from = n;
      int to = m;
      int intervall = m - n;
      int[] sekvensArray = {};
      for(int i = 0; i < intervall; i++){
        if (n == m){
          return  sekvensArray[];
        } else if (n < m){
          return IllegalArgumentException();
        } else {
          n = n + 1;
          sekvensArray[i] = n;
          }

        }
      return sekvensArray;
    }

    public List<Integer> listSequence(int from, int to)
    {

        List<Integer> sekvensList = new ArrayList<Integer>();

        for (int i = from; i <= to; i++){
            if (to == from){
                return sekvensList[];
                //return tom lista
            } else if (to < from) {
              return IllegalArgumentException();
            } else {
                sekvensList.add(i);
            }
        }
       return sekvensList;
    }
// Exercise 2
//These methods should return a shuffled list of numbers, by randomly swapping elements to randomise the ordering.
    public int[] shuffled(int[] numbers)
    {
      int[] shuffleArray = new int[numbers.length];
      Random randomShuffle = new Random();
      randomShuffle.nextInt();
      for ( int i  = 0; i < numbers.length; i++)
      {
        if ( numbers.length < 1)
        {
          System.out.println("You can't shuffle a list with less than two numbers ");
        } else
        {
          int n = numbers[i];
          numbers.set(numebers[i], randomShuffle.nexyInt(n));
          numbers.add(numbers[i]);
        }
      }

    }
    public List<Integer> shuffled(List<Integer> numbers)
    {
      List<Integer> shuffleList = new ArrayList<Interger>();

      System.out.println("Original list: " + numbers);
      System.out.println("The magic of random: "+ );
    }
//Exercise 3
// iterate throguh a list and sum the valus to an integer.

    public int sumIterative(List<Integer> numbers){
      int n = 0
      for (int number : numbers) {
        n = n + number;
      }
      return n;
    }

    public int sumIterative(int[] numbers){
      int sum = 0
      List<Integer> iterateList= new ArrayList<Integer>();
      for (int i = 0; i < numbers.size(); i++) {
          if (numbers.size() == 0){
            return 0;
          }else {
            sum = sum + numbers[i];
          }
        }

      return sum;

      }

    }
//Exercise 4
// Sumera talen i en lista recursivt (genom att kalla på sig själv).
// Genom array:
    public int sumRecursive(int[] numbers){
      int num = 0
      for
      if (numbers.size() < 0){
        return 0;
      }else if {
        numbers = nu
        return num + semRecursive()
      }
      return num;
    }
//Genom List:
    public int sumRecursive(List<Integer> numbers){

    }

    public static void main(String[] args)
    {
      ListProcessor nysekvens = new ListProcessor();
      System.out.println(nysekvens.listSequence(4, 9));
      System.out.println(nysekvens.arraySequence(1, 9));

      int numbers = new int[] {};
      shuffled
      for (int i : numbers){

      }

    }

}
