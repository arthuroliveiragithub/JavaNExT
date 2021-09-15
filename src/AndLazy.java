public class AndLazy {

       public static void main(String[] args) {
              String exemplo = "";

              if(!exemplo.isEmpty() && exemplo.charAt(10) == 'a'){
                     // && é o preguiçoso, pq ele para na primeira condição falsa e não segue até o fim.
                     System.out.println("String preenchida.");
              } else {
                     System.out.println("String vazia.");
              }
       }
}
