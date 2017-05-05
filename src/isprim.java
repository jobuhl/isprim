import java.util.Arrays;

/**
 * Created by Rackenrotz on 20.01.16.
 */
public class isprim {

    public static void main(String[] args) {

        int anzahlPrim = 13;
        int counter = 0;

        for(int i = 2 ; i < Integer.MAX_VALUE; i++){


            boolean prim = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    prim = false;
                }
            }

            if(prim){
                counter++;
            }

            if(counter == anzahlPrim){
                System.out.println(i);
                break;
            }

        }
    }
}
