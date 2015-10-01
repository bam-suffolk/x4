int r,g,b;
float buttonX=200, buttonY=250, buttonW=80, buttonH=60;
int counter=0;

//size and colors
void setup() {
  size( 500, 500 );
  reset();
  noStroke();
  rectMode(CENTER);
}
void reset() {
  r=  255;
  g=  255;
  b=  0;
}
void draw() {
  background( r,g,b );
  showButton( buttonX, buttonY, buttonW, buttonH );
  fill(255,110,0);
  textSize(20);
  text( "Change", width/2-37, height/2+7 );
}
// Button.
void showButton( float x, float y, float w, float h ) {
  fill( 0,0,255 );
  rect ( width/2,height/2, w,h );
}
//keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, width/2,height/2, 40,30 ) ) {
    counter=  counter+1;
    if (counter % 2 > 0) {
      background(random(0,255),random(0,255),random(0,255));
      //r=  0;
      //g=  255;
      //b=  255;
    } else {
      reset();
    }
  }
}

//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;

  // +++++ STUB ALWAYS RETURNS TRUE!
  if ( abs(x1-x2) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }

  return result;
}
