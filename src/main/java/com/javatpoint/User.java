package com.javatpoint;  
public class User 
{
String name;  
String email;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName()
{  
return name;  
}  
public void setName(String name) 
{  
this.name = name;  
}  
public String getEmail() 
{  
return email;  
}  
public void setEmail(String email) 
{  
this.email = email;  
}  
}  