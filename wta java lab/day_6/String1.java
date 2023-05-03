public class String1 {
    public static void main(String[] args) {
        String s =new String("ok the book is boring ");
        String s1=" is ok to be not okay ";
        char []a ={
                'm','a','h','e','n','d','r','a'
        };
        String s2=new String(a);

        System.out.println("The length of s ="+s.length());
        System.out.println();
        System.out.println("The combination of s and s1 ="+s+s1);
        System.out.println();
        System.out.println("the s.compareTo(s1) ="+s.compareTo(s1));
        System.out.println("the s.compareToIgnoreCase(s1) "+s.compareToIgnoreCase(s1));
        System.out.println();
        System.out.println("s2.equals(\"Mahendra\") ="+s2.equals("Mahendra"));
        System.out.println("s2.equalsIgnoreCase(\"Mahendra\")"+s2.equalsIgnoreCase("Mahendra"));
        System.out.println();
        System.out.println("s start with ok ="+s.startsWith("ok") );
        System.out.println("s1 ends with  okay ="+s1.endsWith("okay"));
        System.out.println();
        System.out.println(" s1.indexOf(\"ok\") ="+s1.indexOf("ok"));
        System.out.println("s1.lastIndexOf(\"ok\") ="+s1.lastIndexOf("ok"));
        System.out.println();
        System.out.println("s.replace(\"k\",\"h\")"+s.replace("k","h"));
        System.out.println("s1.replaceAll(\"ok\",\"notok\")"+s1.replaceAll("ok","notok"));
        System.out.println();
        System.out.println("s.substring(4) ="+s.substring(4));
        System.out.println("s.substring(3,8) ="+s.substring(3,8));
        String uppers =s.toUpperCase();
        System.out.println("s.toUpperCase() ="+uppers);
        System.out.println("uppers.tolowerCase()= "+uppers.toLowerCase());
        System.out.println();
        System.out.println("s2.trim() = "+s2.trim());
        System.out.println("s char at 10 "+s.charAt(10));

        System.out.println();
        System.out.println("getchars ..........");
        char []b=new char[10];

        s.getChars(3,9,b,0);
        for(char c : b){
            System.out.print(c +" ");
        }
        System.out.println();
        System.out.println("split ............");

        for(String str : s.split(" ")){
            System.out.println(str);
        }
        System.out.println();
        System.out.println("s.isEmpty = "+s.isEmpty());
        System.out.println("s.isBlank() = "+s.isBlank());

        System.out.println();
        System.out.println("s1.contains(\"okay\") = "+s1.contains("okay") );
        System.out.println("s1.join(\"//\",s1.split(\" \")) = "+s1.join("//",s1.split(" ")));


        System.out.println(" s1.replaceFirst(\"ok\",\"okay\") ="+s1.replaceFirst("ok","okay"));
    }
}
