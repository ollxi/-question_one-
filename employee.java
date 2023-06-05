class employee {
  public String name;
  public String postion;
  public double salary;
  public int experience;
  public String  Educational;
  
 public void setname(String n){
    name=n;
 }
 public String getname(){
      return name;
 }
  public void setpostion(String po){
     postion=p;
    
  }
  public String getpostion( ){
     return postion;
    
  }
  public void setsalary(double s){
      salary=s;
      
  }
  public double getsalary(){
     return salary;
  }
  public int setexperience(int x){
     x=experience;
  }
  public in getexperience(){
     return experience;
  }
  public void seteducitional(String ed){
    Educational= ed;
 }
  public void geteducational(){
     return Educationa;
 }
  public void calculate(){
        double r = 5/100;
      salary=salary+(salary*r*experience);
        if(educational=="Bachelor"){
             salary=salary+500;
          }
         else if (educational=="diploma"){
           salary=salary+250;
         }
          else {
            salary= salary+0;
            
          }
  }
