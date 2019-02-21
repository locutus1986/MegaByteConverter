public class MegaBytes {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int numOfMegaBytes = kiloBytes/1024;
            int remainingkiloBytes = kiloBytes%1024;

            System.out.println(kiloBytes +
                    " KB = " + numOfMegaBytes +
                    " MB and " + remainingkiloBytes+ " KB");
        }
    }
}
