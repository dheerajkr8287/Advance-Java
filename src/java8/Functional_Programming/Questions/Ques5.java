package java8.Functional_Programming.Questions;
/*
.Create your own functional interface with a single abstract
method that accepts an integer and returns a boolean.
Implement it using a lambda that checks if the number is
prime
 */
@FunctionalInterface
interface Candidate{
    boolean isCandidate(int num);

}
public class Ques5 {
    public static void main(String[] args) {
      Candidate candidate=num->{
          for (int i = 2; i < num; i++) {
              if(num%i==0){
                  return false;
              }
          }
          return true;
      };
        System.out.println(candidate.isCandidate(41));
    }
}
