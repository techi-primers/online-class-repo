package class2;

public class calculator{
public static void main(String[] args){

        calculator myobj = new calculator();

        System.out.println(myobj.calc(5,2,"substarct"));





        }

public Integer calc(int v1, int v2, String operation){

        if(operation == "add"){
        return v1+v2;

        }
        else if(operation == "multiplication"){

        return v1*v2;
        }
        else if(operation=="substarct"){
        return v1-v2;
        }
        else{
        return null;
        }
        }





        }