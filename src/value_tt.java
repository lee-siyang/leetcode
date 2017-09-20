/**
 * Created by lisiyang on 17/8/12.
 */
public class value_tt {
    public static void main(String argv[]){
        value_tt t=new value_tt( );
        t.first( );
    }

    public void first( ){
        int i=5;
        value_t v=new value_t( );
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }

    public void second(value_t v,int i){
        i = 0;
        v.i = 20;
        value_t val = new value_t( );
        v = val;
        System.out.println(v.i+" "+i);
    }
}
