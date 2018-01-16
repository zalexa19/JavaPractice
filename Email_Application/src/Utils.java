public class Utils {


    public String[] splitName (String str){
        String[] result=new String[2];

        if (str.contains(" ")){
            result=str.split("\\s");

        }

        return result;
    }
}
