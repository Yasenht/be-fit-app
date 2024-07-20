package com.example.yas.ui;



public class Checking  {

public Checking(){}
    public String processNameinput(String name)
    {
        if(name.isEmpty())
        {

            return "Please enter your name";
        }
        else if(name.charAt(0)==' '){
            return "name of user content speaces in the bigein ";
        }
        else {return name;}

    }
    public String processPassInput(String  pass)
    {
        if(pass.isEmpty())
        {

            return "Please enter your password";
        }
        else if(pass.length()<=8){


            return "this password less than eight boxes";
        }
        else if(pass.length()>20){


            return "this password more than 20 boxes";
        }
        else {return pass;}

    }


}