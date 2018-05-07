/**
 *
 * @author Friedemann Lipphardt
 *
 */

package src;

//Oberklasse Ware. Keine Objekte ers
abstract class Ware {

    private String name;
    private double current_price;
    private double max_price;
    private boolean isLocalWare;

    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }

    public double getMax_price() {
        return max_price;
    }

    public void setMax_price(double max_price) {
        this.max_price = max_price;
    }

    public boolean isLocalWare() {
        return isLocalWare;
    }

    public void setLocalWare(boolean localWare) {
        isLocalWare = localWare;
    }
}

public class Tuche extends Ware {

}

public class Stockfisch extends Ware {

}

public class Bier extends Ware {

}


public class Wein extends Ware {

}


public class Zinn extends Ware {

}


public class Salz extends Ware {

}

public class Pelze extends Ware {

}

public class Kupfer extends Ware {

}




