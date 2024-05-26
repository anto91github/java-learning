import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Hello 
{
    public static void main(String a[])
    {
      List<Integer> nums  = Arrays.asList(5,7,9,8,2);
      Stream<Integer>s1 = nums.stream();
      Stream<Integer>s2 = s1.filter(n->n%2 ==0); //only even number
      Stream<Integer>s3 = s2.map(n -> n*2); // double the value
      int result = s3.reduce(0, (c,e)-> c+e); // hasil sum dari s3

      //penulisan singkat
      int result2 = nums.stream()
                        .filter(n->n%2 ==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e)-> c+e);

      

      Stream<Integer> sortedValues = nums.stream()
                                          .filter(n -> n%2 ==0)
                                          .sorted();
      sortedValues.forEach(n -> System.out.println(n));


      // s3.forEach(n -> System.out.println(n));

      // for(int n:nums){
      //   if(n%2 == 0){ //even number
      //     n = n*2;
      //     sum = sum + n;
      //   }
      // }

      
    }
}