//Justin Acosta
//Making a button that changes the background color when clicked


int x;  //button globals
int y = 300;
int w = 150;
int h = 100;

float r = random(255);    //colors
float g = random(255);
float b = random(255);




boolean button = false;

void setup(){
  x = width/2;
  size(600, 450);

}

void reset(){              //pick new color
  r= random(255);
  g = random(255);
  b = random(255);
}


void draw(){                     
  background(255,200,0);

  if (button) {
  background( r, g, b);     
 



  } else{ 
    reset();
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

void drawCircle(float x, float y, float w, float h, color c){
  fill(c);
  ellipse(x, y, w, h);
}
