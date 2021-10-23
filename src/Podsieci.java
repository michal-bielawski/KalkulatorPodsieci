public class Podsieci {
    public Podsieci(String ip, char selectedOption){
        if (selectedOption == 'a' || selectedOption == 'A'){
            System.out.println(checkKlasa(ip));

        }
    }

    private int checkKlasa(String ip){
        String[] ipAll = ip.split("\\.");
        int[] oktetArray = new int[4];
        
        for(int i = 0; i < ipAll.length; i++){
            oktetArray[i] = Integer.parseInt(ipAll[i]);
            if (oktetArray[i]>255){
                return -1;
            }
        }


        if(oktetArray[0] >= 1 && oktetArray[0] <= 127) return 8;
        else if (oktetArray[0] <= 191) return 16;
        else if (oktetArray[0] <= 223) return 24;
        else return -1;



    }

}
