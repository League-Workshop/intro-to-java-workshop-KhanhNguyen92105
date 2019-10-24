PImage catPic;
int x=313;
int y=220;

int x1=450;
int y1=211;
void setup(){
   size(700,368);
   catPic = loadImage("bigEyedCat.jpg");

catPic.resize(width, height);
background(catPic);
}

void draw(){
  if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
  ellipse(x1, y1, 60, 60);
  ellipse(x, y, 60, 60);
                  fill(41, 255, 255);
}

void keyPressed() {

x++;
y++;
x1++;
y1++;

if(x>368){
}
}