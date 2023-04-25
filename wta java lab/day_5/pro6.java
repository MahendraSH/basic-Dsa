// write a user difined exeptions
class UserExpress extends  Exception{
    UserExpress(String s){
        super(s);
    }
}
public class pro6 {
    public static void main(String[] args) {
        try{
            throw new UserExpress("some error ");
        }
        catch (UserExpress e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }

    }
}
