// Seleccionamos todas las celdas y el botón
const celdas = document.querySelectorAll(".cuadrado");
const btnReiniciar = document.getElementById("Reiniciar");

// Variables del juego
let jugadorX = "";
let jugadorO = "";
let turno = "X";
let tablero = ["", "", "", "", "", "", "", "", ""];
let juegoActivo = false;

// Combinaciones ganadoras
const combinacionesGanadoras = [
    [0,1,2],
    [3,4,5],
    [6,7,8],
    [0,3,6],
    [1,4,7],
    [2,5,8],
    [0,4,8],
    [2,4,6]
];

// Pedir nombres al cargar la página
window.onload = () => {
    jugadorX = prompt("Nombre del jugador X:");
    jugadorO = prompt("Nombre del jugador O:");

    if (!jugadorX || !jugadorO) {
        alert("Error: debe ingresar el nombre de ambos jugadores");
        return;
    }

    juegoActivo = true;
    alert(`Comienza ${jugadorX} con la X`);
};

// Función que verifica ganador
function hayGanador() {
    return combinacionesGanadoras.some(combinacion =>
        combinacion.every(pos => tablero[pos] === turno)
    );
}

// Click en cada celda
celdas.forEach((celda, index) => {
    celda.addEventListener("click", () => {

        if (!juegoActivo) return;
        if (tablero[index] !== "") return;

        tablero[index] = turno;
        celda.textContent = turno;

        if (hayGanador()) {
            alert(`Ganó ${turno === "X" ? jugadorX : jugadorO}`);
            juegoActivo = false;
            return;
        }

        if (!tablero.includes("")) {
            alert("Empate 😐");
            juegoActivo = false;
            return;
        }

        // Cambiar turno
        turno = turno === "X" ? "O" : "X";
    });
});

// Función para reiniciar el juego
function reiniciarJuego() {
    tablero = ["", "", "", "", "", "", "", "", ""];
    turno = "X";
    juegoActivo = true;

    celdas.forEach(celda => {
        celda.textContent = "";
    });

    alert(`Nuevo juego. Comienza ${jugadorX} con la X`);
}

// Listener del botón
btnReiniciar.addEventListener("click", reiniciarJuego);
