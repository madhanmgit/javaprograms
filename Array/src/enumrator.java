
public class enumrator {
	public enum team{ Development,testing,Desing,Desksupport,Service}
	public static void main(String[] args){
		for(team t:team.values())
	    {System.out.println(t);}

}
}