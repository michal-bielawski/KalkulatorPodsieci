public class Podsieci {

    private int[] oktetArray = new int[4];

    public Podsieci(String ip, char selectedOption, int iloscPodzialu){
        if (selectedOption == 'a' || selectedOption == 'A'){
            System.out.println(checkKlasa(ip));
            createMaska(oktetArray, checkKlasa(ip));


        }
    }

    private int checkKlasa(String ip){

        ipToArray(ip);

        for (int i = 0; i<4; i++){
            if(oktetArray[i] > 255) return -1;
        }

        if(oktetArray[0] >= 1 && oktetArray[0] <= 127) return 8;
        else if (oktetArray[0] <= 191) return 16;
        else if (oktetArray[0] <= 223) return 24;
        else return -1;

    }

    private int[] ipToArray(String ip){
        String[] ipAll = ip.split("\\.");

        for(int i = 0; i < ipAll.length; i++){
            oktetArray[i] = Integer.parseInt(ipAll[i]);
        }

        return oktetArray;
    }

    private void createMaska(int[] oktetArray, int basicMaska){
        int i;

        for (i = 0; i < basicMaska; i++) System.out.print("1");
        for (int j = 0; i + j < 32; j++) System.out.print("0");


    }



}
