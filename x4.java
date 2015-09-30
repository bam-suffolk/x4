int r,g,b;
float buttonX=200, buttonY=250, buttonW=80, buttonH=40;
int counter=0;

//// SETUP:  size only.  Also set colors.
void setup() {
  size( 500, 500 );
  reset();
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
  text( "Change", buttonX+buttonW/4, buttonY+buttonH*2/3 );
}
// Draw the button.
void showButton( float x, float y, float w, float h ) {
  fill( 0,0,255 );
  rect ( x,y, w,h );
}
/// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, width/2,height/2, 50,50 ) ) {
    counter=  counter+1;
    if (counter % 2 > 0) {
      r=  0;
      g=  255;
      b=  255;
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
