
import java.util.Arrays;

/**
 * Created by Valentin on 08.03.2018.
 */
public class blockchain {


    public static void main(String[] args) {


        Transaction transaction1=new Transaction("Name1","Name2",100L);
        Transaction transaction2=new Transaction("Name2","Name3",200L);
        Transaction transaction3=new Transaction("Name3","Name4",300L);
        Transaction transaction4=new Transaction("Name4","Name5",400L);

        Block firstBlock=new Block(0, Arrays.asList(transaction1));
        System.out.println(firstBlock.hashCode());
        Block secondBlock=new Block(firstBlock.hashCode(),Arrays.asList(transaction2));
        System.out.println(secondBlock.hashCode());
        Block third=new Block(secondBlock.hashCode(),Arrays.asList(transaction3));
        System.out.println(third.hashCode());
    }

}
