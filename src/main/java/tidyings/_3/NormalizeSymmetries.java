package tidyings._3;

public class NormalizeSymmetries {

    public String firstOne(String foo){
        if(foo != null){
            return foo;
        }
        foo = "lazy";
        return foo;
    }

    public String secondOne(String foo){
        if(foo == null){
            foo = "lazy";
        }
        return foo;
    }

    public String thirdOne(String foo){
        return foo != null ? foo : "lazy";
    }
}
