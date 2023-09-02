// Importando un modulo forma tradicional

const saludo = require("./saludos.js");

// Forma alternativa de incluir un modulo
/*
De esta forma podemos traer parte del modulo
*/
// const { saludar, saludarHolaMundo } = require("./saludos.js");

// console.log(saludarHolaMundo());

// Despues de importarlo lo usamos como queremos

console.log(saludo.saludar("Latita"));

console.log(saludo.saludarHolaMundo());