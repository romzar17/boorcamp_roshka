// agarramos las celdas, botón y cosas varias
var cuadritos = document.querySelectorAll(".cuadrado");
var botonReset = document.getElementById("Reiniciar");

// jugadores
var jugadorX = "";
var jugadorO = "";
var turno = "X";

// tablero
var tablero = ["", "", "", "", "", "", "", "", ""];

// estado del juego
var jugando = false;

// combinaciones ganadoras, sí, me las aprendí de memoria 😅
var ganadores = [
    [0,1,2],
    [3,4,5],
    [6,7,8],
    [0,3,6],
    [1,4,7],
    [2,5,8],
    [0,4,8],
    [2,4,6]
];

// pedimos nombres
window.onload = function() {
    jugadorX = prompt("Dime tu nombre X:");
    jugadorO= prompt("Dime tu nombre O:");

    if(!jugadorX|| !jugadorO) {
        alert("No ingresaste el nombre");
        return;
    }

    jugando = true;
    alert(jugadorX + " empieza con la X");
}

// revisar si alguien gana, o empate
function checkGanador() {
    // recorro todas las combinaciones
    for(var i=0;i<ganadores.length;i++){
        var a = ganadores[i][0];
        var b = ganadores[i][1];
        var c = ganadores[i][2];

        // si hay una línea
        if(tablero[a] != "" && tablero[a] == tablero[b] && tablero[a] == tablero[c]){
            return true;
        }
    }
    return false;
}

// click de las sceldas
for(var i=0;i<cuadritos.length;i++){
    (function(idx){
        cuadritos[idx].addEventListener("click", function(){
            if(!jugando) return;
            if(tablero[idx] != "") return;

            tablero[idx] = turno;
            cuadritos[idx].textContent = turno;

            if(checkGanador()){
                alert("Gano " + (turno=="X"?jugadorX:jugadorO) + " 🎉");
                jugando = false;
                return;
            }

            // empate
            var vacio = false;
            for(var j=0;j<tablero.length;j++){
                if(tablero[j] == ""){
                    vacio = true;
                    break;
                }
            }
            if(!vacio){
                alert("Empate 😐");
                jugando = false;
                return;
            }

            // cambio de turno, ya basta de X y O
            turno = (turno=="X")?"O":"X";
        });
    })(i);
}

// reiniciar juego
function reiniciarJuego(){
    // limpio tablero
    for(var i=0;i<tablero.length;i++){
        tablero[i] = "";
        cuadritos[i].textContent = "";
    }

    turno = "X";
    jugando = true;

    alert("Nuevo juego, empieza " + jugadorX);
}

// listener del boton
botonReset.addEventListener("click", reiniciarJuego);

