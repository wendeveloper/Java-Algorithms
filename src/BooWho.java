/*
  FreeCodeCamp converted the below from JavaScript into Java
  Check if a value is classified as a boolean primitive. Return true or false.

    Boolean primitives are true and false.

    function booWho(bool) {

  if (bool === true || bool === false){
    return true;
  } else if (bool == null) {
    return false;
  }
  return false;
}
booWho(null);

 */

public class BooWho {

    public static void main(String[] args) {
        System.out.println(booWho(false));
    }

    public static Boolean booWho(Boolean bool){
        if (bool != null) {

            if (bool == true || bool == false) {
                return true;
            } else {
                return false;
            }
        }
        return bool;

    }
}
