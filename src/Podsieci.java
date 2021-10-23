public class Podsieci {
    public Podsieci(String ip, char selectedOption){
        if (selectedOption == 'a' || selectedOption == 'A'){
            checkKlasa(ip);

        }
    }

    private void checkKlasa(String ip){
        int i = 0;
        String[] ipAll = ip.split("\\.");
        String[] oktetArray = new String[4];
        
        for(String oktet : ipAll){
            oktetArray[i] = oktet;
            i++;
        }
        
        for(String a : oktetArray)
            System.out.println(a);

    }

}
