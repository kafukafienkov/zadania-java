
public class Appender {

        String src;

    public Appender(){
        src = "";
    }

    public Appender(String s){
        src = s;
    }

    public Appender append(String app, int n) {
        if (n<0) throw new IllegalArgumentException("Podaj cyfrę większą od 0!");
        while (n > 0) {
            src += app;
            n--;
        }
        return this;

    }

    public String toString(){
        return src;
    }
    }

