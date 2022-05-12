package RemainingProbs;

public class EmailSeperater {

	public static void main(String[] args) {
		
		String emails = "xyz@email.com,abc@email.com,143@gmail.com";
		String[] emailList = emails.split(",");
		for(String email : emailList) {
			System.out.println(email);
		}
	}

}
