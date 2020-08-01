var photos = new Array();
var wich = 0;

photos[0]="/assets/images/BANNER-KSB-300-1500x430.jpg"
photos[1]="/assets/images/BANNER-WEB-INFORMATIVO-1-1500x430.jpg"
photos[2]="/assets/images/BANNER-WEB-LG-1500x430.jpg"
photos[3]="/assets/images/BANNER-WEB-MATEBOKK-13-3-1500x430.jpg"

function forward(){
    if( wich < photos.length-1 )
        wich++;
    else
        wich=0;
    //cambiar la imagen del elemento slider
    imagen = document.getElementById("slider");
    imagen.src = photos[wich];
}

function backward(){
    if( wich> 0 )
        wich--;
    else
        wich = photos.leght-1;
    //cambiar la imagen del elemento slider
    imagen = document.getElementById("slider");
    imagen.src = photos[wich];
}