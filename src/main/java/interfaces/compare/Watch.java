package interfaces.compare;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Watch implements Comparable<Watch>, Cloneable {
    private final String brand;
    private final boolean isElectronic;
    private double price;

    @Override
    public int compareTo(Watch watch) {
//        if (price > watch.price){
////            return 1;
////        }
////
////        if (price < watch.price){
////            return -1;
////        }
////
////        return 0;

        return Double.compare(price, watch.price);


    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


