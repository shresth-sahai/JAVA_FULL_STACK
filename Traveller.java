package looseVStightCoupling;

 class Traveller {
 private Vehicle v;
 public Vehicle getV(){
     return v;
 }
 public  void setV(Vehicle v){
     this.v=v;
 }
 public void start(){
     v.move();
 }

}
