package co.kevingomez;

import org.springframework.stereotype.Component;

@Component("configs")
public class Getter {
    private final String getsa;
    public Getter(String get){
        this.getsa = get;
    }

    public Getter(Getter get){
        this.getsa = get.getGet();
    }

    public String getGet(){
        return this.getsa;
    }

}
