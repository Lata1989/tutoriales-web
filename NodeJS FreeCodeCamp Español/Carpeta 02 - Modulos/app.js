// 01 - Modulo Console

// console.log("Hola mundo!");

// console.warn("Error a la vista!");

// console.error("Otro error mas!");

// console.error(new Error("Otro error mas grave!"));

// 02 - Modulo Process

// console.log(process);

// console.log(process.env);

// console.log(process.argv);

// console.log(process.memoryUsage());

// 03 - Modulo OS
// No esta de forma global por ende hay que importarlo

// const os = require('os');

// console.log(os.type());

// console.log(os.homedir());

// console.log(os.uptime());

// console.log(os.userInfo());

// 04 - Modulo timers
// Estructura del timeout setTimeout(funcion, retraso, argumentos para la funcion separados por coma);

function mostrarTema(tema) {
    console.log(`Estoy aprendiendo ${tema}`);
}

mostrarTema("Javascript");
setTimeout(mostrarTema, 3000, "Node.js");