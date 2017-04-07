package S3_4_4.Generic;

public class NonGenExt<T> extends NonGen {
    T ob;
    NonGenExt(T o, int i){
        super(i);
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
