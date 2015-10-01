//Justin Acosta
//Making a button that changes the background color when clicked


int x = width/2;  //button globals
int y = 300;
int w = 150;
int h = 100;




boolean button = false;

void setup(){
  size(600, 450);
}

void draw(){
  if (button) {
  background( 60, 50, 255);
  } else{ 
    background( 255, 200, 0);
  }
  
  fill(0, 200, 100);
  rect(x, y, w, h);
  
  fill(255,255,0);
  textSize(20);
  text("Click Here!", x + 25, y+ 55);
  fill(0);
  text("Justin Acosta", w, 100);
}

void mousePressed(){
  if (mouseX > x &&
      mouseX < x + w &&
      mouseY > y &&
      mouseY < y + h){
   button = !button;
      }
}





