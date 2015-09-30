//// Exercise 4:  click button to change background.

int r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;
int counter=0;

//// SETUP:  size only.  Also set colors.
void setup() {
  size( 640, 480 );
  reset();
}
void reset() {
  r=  100;
  g=  200;
  b=  250;
}


//// NEXT:  button only.
void draw() {
  background( r,g,b );
  showButton( button1X, button1Y, button1W, button1H );
  fill(100,0,0);
  text( "Click me!", button1X+button1W/4, button1Y+button1H*2/3 );
}
// Draw the button.
void showButton( float x, float y, float w, float h ) {
  fill( 255,255,0 );
  rect ( x,y, w,h );
}

//// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, 100,100, 50,50 ) ) {
    counter=  counter+1;
    if (counter % 2 > 0) {
      r=  255;
      g=  50;
      b=  0;
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
