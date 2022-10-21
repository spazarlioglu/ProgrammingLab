public class CatchNumber {
    public static void main(String[] args) {

        String searchResultNew = " username:oscar  search result count: 12345 more column : more information ";
        int wordLength=searchResultNew.length();

        String numbers="";

        for (int i=0;i<=wordLength-1;i++){
            if (searchResultNew.charAt(i)<='9' && searchResultNew.charAt(i)>='0'){
                numbers+=searchResultNew.charAt(i);
            }
        }
        System.out.println("numbers = " + numbers);
    }
}
