package AB;

import java.io.IOException;

public class ROT13 {public static void main(String[] args) throws IOException {



    do {



        System.out.print("Geben Sie den Text ein, den Sie verschl�sseln m�chten: ");



        String input = IO.readString();



        String rot13 = rot13(input);



        System.out.println("Verschl�sselter Text: " + rot13);



        System.out.println(" ");



        System.out.println("M�chten Sie wiederholen:");



    } while (IO.readBoolean());



}





    public static String rot13(String input) {



        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < input.length(); i++) {



            char c = input.charAt(i);



            if (c >= 'a' && c <= 'm') c += 13;



            else if (c >= 'A' && c <= 'M') c += 13;



            else if (c >= 'n' && c <= 'z') c -= 13;



            else if (c >= 'N' && c <= 'Z') c -= 13;



            sb.append(c);



        }



        return sb.toString();



    }



}

