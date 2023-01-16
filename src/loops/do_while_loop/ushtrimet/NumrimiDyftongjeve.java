package loops.do_while_loop.ushtrimet;

import java.util.Scanner;

public class NumrimiDyftongjeve {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine().toLowerCase();

        int dh, ll, gj, nj, th, sh, xh, zh, rr, index;
        dh = ll = gj = nj = th = sh = xh = zh = rr = index = 0;

        do {
            char shkronja = text.charAt(index);
            char nextShkronja = text.charAt(++index);
//            if("dh".equals(""+shkronja+nextShkronja)) {
//                dh++;
            //index++;
//            }
            /*

            do {
String dyShkronja = text.substring(index, index+2);

switch (dyShkronja) {
	case "dh": dh++; index++; break;
  case "sh": sh++; index++; break;
}

index++;

} while(index<text.length()-1);

             */
            if (shkronja == 'd' && nextShkronja == 'h') {
                dh++;
                index++;
            } else if (shkronja == 'l' && nextShkronja == 'l') {
                ll++;
                index++;
            } else if (shkronja == 'r' && nextShkronja == 'r') {
                rr++;
                index++;
            } else if (shkronja == 's' && nextShkronja == 'h') {
                sh++;
                index++;
            } else if (shkronja == 't' && nextShkronja == 'h') {
                th++;
                index++;
            } else if (shkronja == 'x' && nextShkronja == 'h') {
                xh++;
                index++;
            } else if (shkronja == 'z' && nextShkronja == 'h') {
                zh++;
                index++;
            } else if (shkronja == 'n' && nextShkronja == 'j') {
                nj++;
                index++;
            } else if (shkronja == 'g' && nextShkronja == 'j') {
                gj++;
                index++;
            }
        } while (index < text.length() - 1);

        System.out.println("--------------------");
        System.out.printf("GJ = %5d%n", gj);
        System.out.printf("SH = %5d%n", sh);
        System.out.printf("TH = %5d%n", th);
        System.out.printf("XH = %5d%n", xh);
        System.out.printf("ZH = %5d%n", zh);
        System.out.printf("RR = %5d%n", rr);
        System.out.printf("LL = %5d%n", ll);
        System.out.printf("NJ = %5d%n", nj);
        System.out.printf("DH = %5d%n", dh);
        System.out.println("--------------------");

    }
}







