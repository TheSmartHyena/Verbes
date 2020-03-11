package licence.pro.verbes;

/**
 * Hello world!
 *
 */
public class App {
	
	// test de la vitesse en passant par des variables locales plutôt que des appel/renvois direct, en millisecondes
	public static void main( String[] args ){
		
		long total = 0;
		for(int j=0; j<10; j++) {
			
		
			long timerStart = System.currentTimeMillis();
			
			for (int i=0; i<1000000; i++) {
				
				String a = randomAlphaNumeric(10);
				String b = randomAlphaNumeric(10);
				
				myConcatShort(a, b);
				
			}
			
			long timerStop = System.currentTimeMillis();
			
			//System.out.println("Début:");
			////System.out.println(timerStart);
			//System.out.println("Fin:");
			//System.out.println(timerStop);
			
			System.out.println("Différence:");
			System.out.println(timerStop-timerStart);
			total = total + timerStop - timerStart;
		
		}
		System.out.println("Différence Moyenne :");
		System.out.println(total / 10);
		
	}
	
	private static final String myConcatLong(String a, String b) {
		
		String result = "";
		
		result = a.concat(b);
		
		return result;
	}
	
	private static final String myConcatShort(String a, String b) { return a.concat(b); }
		
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

}
