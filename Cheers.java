public class Cheers {
        public static void main(String[] args) {
	    String input=args[0];
           input= input.toUpperCase();
            int num=Integer.parseInt(args[1]);
            for(int i=0;i<input.length();i++)
            {
                char cheked=input.charAt(i);
                if (cheked=='A'||cheked=='E'||cheked=='F'||cheked=='H'||cheked=='I'||cheked=='L'||cheked=='M'||cheked=='N'||cheked=='O'||cheked=='R'||cheked=='S'||cheked=='X')
                 {
                        System.out.println("Give me an  "+cheked+": "+cheked+"!");
                }
                else
                {
                        System.out.println("Give me a  "+cheked+": "+cheked+"!");

                }
            }
            System.out.println("What does that spell?");
            for(int i=0;i<num;i++)
            {
                System.out.println(input+"!!!");
            }
        }
}
