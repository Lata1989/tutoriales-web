// Un modulo es un archivo javascript

function saludar(nombre) {
  return `Hola ${nombre}.`;
}

// console.log(saludar("Latita"));

function saludarHolaMundo() {
  return "Hola mundo!";
}


/*
Exportando el modulo
*/
//module.exports es un objeto

// module.exports.saludar = saludar;
// module.exports.saludarHolaMundo = saludarHolaMundo;

// console.log(module.exports);

// Otra forma de exportar modulos

module.exports = {
  saludar: saludar,
  saludarHolaMundo : saludarHolaMundo
}

// console.log(module.exports);
