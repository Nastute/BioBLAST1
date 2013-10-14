package BioBLAST;
//package bioBlast;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLConnection;
//
//public class BLAST_Connector {
//
//public static void main(String[] args) throws Exception {
//        URL toBLAST = new URL("http://www.ncbi.nlm.nih.gov/blast/Blast.cgi?CMD=Put&QUERY=SSWWAHVEMGPPDPILGVTEAYKRDTNSKK&PROGRAM=blastp&FILTER=L&DATABASE=nr&ALIGNMENTS=100&DESCRIPTIONS=100");
//        URLConnection yc = toBLAST.openConnection();
//        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
//        String inputLine;
//        StringBuilder sb=new StringBuilder();
//        while ((inputLine = in.readLine()) != null) {
//            System.out.println(inputLine);
//            sb.append(inputLine);
//        }
//        in.close();
//        //Parse a new String(sb) for the <input name="RID" value="UWFU352V016" type="hidden" /> tag in order to get the RID.
//    }
//}