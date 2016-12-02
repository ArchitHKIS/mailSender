
public class GoogleMail{
	public static void main(String[] args){
		long startTime = System.nanoTime();
		String[] to = {"190902@hkis.edu.hk","architksrivastava@gmail.com"};
		if(EmailSender.sendMail("190902@hkis.edu.hk", "passwordshouldbereplaced", "message that was sent form eclipse", to)){
			System.out.println("sent message");
		}else{
			System.out.println("nah");
		}
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
}