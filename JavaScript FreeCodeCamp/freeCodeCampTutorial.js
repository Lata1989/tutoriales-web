// Comentario singleline javascript
/*
Comentario multilinea javascript
*/

/*
Tipos de datos:
undefined: cuando no existe un valor asignado
null
boolean: booleano, verdadero o falso
string: cadenas de caracteres
symbol: 
number: representa un numero
object: es una estructura que permite relacionar propiedades y funciones bajo una misma estructura
*/

var miVariable = "Hola mundo!";
console.log(miVariable);
let miNumero = 45;
console.log(miNumero);
const MINOMBRE = "Pablo";
console.log(MINOMBRE);

// Operadores de asignacion
let a;
let b = 2;

console.log(a);
console.log(b);

// Variables no inicializadas

var c;
var d;
console.log(c);
console.log(d);
c = 40;
d = 56;
console.log(c);
console.log(d);

/*
Operadores aritmeticos
+ Suma
- Resta
* multiplicacion
/ division
% resto
*/

/*
Operadores logicos
|| or
&& and
! not
< menor
<= menor o igual
> mayor
>= mayor o igual
!= distinto
!== estrictamente desigual
== igual
=== estrictamente igual
*/

/*

Operaciones de contador
+= suma
-= resta
/= dividido
*= multiplicado

*/

/*
Escapar comillas en cadenas de caracteres

*/

let variableConComillas = "Soy una cadena de caracteres con \"con comillas\"";
console.log(variableConComillas);
let variableConComillasSimples = 'Mi objetivo es "aprender a programar"';
console.log(variableConComillasSimples);

/*
Secuencias de escape
\' comilla simple
\" comilla doble
\\ barra invertida
\n nueva linea
\r retorno de carro
\t tabulacion
\b retroceso
\f salto de pagina
*/

let cantidadCaracteres = variableConComillas.length;
console.log(cantidadCaracteres);

/*
Notacion de corchetes
Si buscamos un indice fuera de lo que tiene la cadena devuelve undefined
*/
let ubicacionCaracter = variableConComillas[6];
console.log(ubicacionCaracter);

// Notacion de corchetes para acceder al ultimo caracter de una cadena


/*
Arrays
*/

let miArray = ["Pablo", 34];
console.log(miArray[0]);
console.log(miArray[1]);


/*
Matrices
*/

var miMatriz = [[0, 1, 2], [3, 4, 5], [6, 7, 8]];

/*
var miMatriz = [[0, 1, 2], [3, 4, 5], [6, 7, 8]];
indice              0          1          2
indice interno   0  1  2    0  1  2    0  1  2
*/

// Accediendo al numero 7
console.log(miMatriz[2][1]);

/*
Modificacion de arreglos
arreglo.push(elemento) Agrega un elemento al final del arreglo
arreglo.pop() Elimina el ultimo elemento del arreglo
arreglo.unshift(elemento) Agrega un elemento al principio del arreglo
arreglo.shift() Elimina el primer elemento del arreglo
*/

/*
Funciones en JavaScript
*/

function saludar() {
    console.log("Hola mundo!!");
}

saludar();
saludar();
saludar();
saludar();

/*
Funciones con argumento
*/

function sumar(num1, num2) {
    let resultado = num1 + num2;
    console.log(resultado);
}

sumar(30, 45);
sumar(36, 19);
sumar(14, 22);
sumar(38, 13);

/*
Ambito global
*/

/*
Variables globales
Se usan en cualquier lugar del programa
Se declaran con "var" o "const" o "let" en el ambito global del programa
*/

var miVariableGlobal = 5;

/*
Variables locales
Se usan en lugares especificos del programa
Se declaran normalmente con "let";
*/
function unaFuncion(miVariableGlobal) {
    let miVariableLocal = 6;
    let suma = miVariableGlobal + miVariableLocal;
    console.log(suma);
}


/*
Funciones con retorno de valores
*/

function restar(num1, num2) {
    return num1 - num2;
}

console.log(restar(9, 5));
console.log(restar(13, 25));
console.log(restar(14, 79));

/*
undefined
Si una funcion tiene que devolver u valor y no lo devuelve por defecto devuelve undefined
*/

function multiplcar(num1, num2) {
    console.log(num1 * num2);
    // Esta funcion devuelve undefined
}

console.log(multiplcar(7, 9)); // Esta llamada a la funcion devuelve undefined

/*
Asignar el retorno de una funcion a una variable
*/

let unResultado = restar(14, 6);
console.log(unResultado)

/*
Permanece en la fila
*/

/*
En informatica una cola (queue) es una estructura de datos abstracta en la cual los elementos se mantienen en orden. Los nuevos elementos se pueden añadir al final de la cola
y los elementos previos se retiran del principio de la cola.
Define una funcion proximoEnLaFila() que tome un arreglo (arreglo) y un numero (elemento) como argumentos.
Agrega el elemento al final del arreglo y luego elimina el primer elemento del arreglo. La funcion proximoEnLaFila debe retornar el elemento removido.
*/

let arreglo = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

function proximoEnLaFila(elemento) {
    arreglo.push(elemento);
    return arreglo.shift();
}


// Una forma de mostrar arrays con una funcion de javascript
console.log("Antes " + JSON.stringify(arreglo));
console.log("Se elimino el elemento: " + proximoEnLaFila(14));
console.log("Despues: " + JSON.stringify(arreglo));
console.log("Antes " + JSON.stringify(arreglo));
console.log("Se elimino el elemento: " + proximoEnLaFila(36));
console.log("Despues: " + JSON.stringify(arreglo));
console.log("Antes " + JSON.stringify(arreglo));
console.log("Se elimino el elemento: " + proximoEnLaFila(22));
console.log("Despues: " + JSON.stringify(arreglo));
console.log("Antes " + JSON.stringify(arreglo));
console.log("Se elimino el elemento: " + proximoEnLaFila(99));
console.log("Despues: " + JSON.stringify(arreglo));

/*
Sentencias condicionales "if"
*/
let x = 5
if (x > 2) {
    console.log("La condicion es verdadera.");
} else {
    console.log("La condicion es falsa.");
}

if (x < 5) {
    console.log("El valor de x es menos que 5.");
}
else if (x = 5) {
    console.log("El valor de x es igual a 5.");
}
else {
    console.log("El valor de x es mayor que 5.");
}

/*
Sentencia condicional "switch"
*/
function clasificarValor(valor) {
    let respuesta;
    switch (valor) {
        case 1:
            respuesta = "alpha";
            break;
        case 2:
            respuesta = "beta";
            break;
        case 3:
            respuesta = "gamma";
            break;
        case 4:
            respuesta = "delta";
            break;
        default:
            break;
    }
    return respuesta;
}

console.log(clasificarValor(1));
console.log(clasificarValor(3));
console.log(clasificarValor(4));
console.log(clasificarValor(2));


/*
Sentencia switch multiples casos
*/

function clasificarVolumen(valor) {
    let volumen;
    switch (valor) {
        case 1:
            volumen = "Volumen bajo";
            break;
        case 2:
        case 3:
            volumen = "Volumen intermedio";
            break;
        case 4:
        case 5:
        case 6:
            volumen = "Volumen alto";
            break;
        default:
            volumen = "Fuera de rango";
            break;
    }
    return volumen;
}

console.log(clasificarVolumen(3));
console.log(clasificarVolumen(1));
console.log(clasificarVolumen(6));
console.log(clasificarVolumen(14));

/*
Creacion de objetos
*/
// Si el objeto tiene alguna propiedad sin indicarle que es una cadena, JavaScript lo hace de forma automatica.

let miPerro = {
    nombre: "Lolo",
    edad: 5,
    peso: 6,
    raza: "Caniche"
};


/*
    Notacion de puntos
*/

let otroPerro = {
    nombre: "Lorenzo",
    edad: 6,
    peso: 9,
    raza: "Mestizo"
};

// Formas de acceder a las propiedades a los objetos.
// Notacion de puntos

console.log("El nombre del perro es: " + otroPerro.nombre);

// Notacion de corchetes

let miCuaderno = {
    color: "Verde",
    categoria: 3,
    "numero de paginas": 200,
    "numero de hojas": 100
};

console.log(miCuaderno["numero de paginas"]);
console.log(miCuaderno[3]); // Esta forma no funciona

// Acceso a propiedad de un objeto a traves de variables

let resultados = {
    1: "Nora256",
    2: "Gino577",
    3: "Tito123",
    4: "Gen456"
};

let posicion = 4;

console.log(resultados[posicion]);

// Actualizar propiedades

let mochila = {
    color: "Azul",
    tamanio: "mediano",
    contenido: ["botella de agua", "cuaderno"]
};

console.log(mochila.color);
mochila.color = "Verde";
console.log(mochila.color);
console.log(mochila["contenido"][1]);

// Para agregar un valor a un array dentro de un atributo de la mochila.
console.log(mochila.contenido);
mochila.contenido.push("Lapiz");
console.log(mochila.contenido);
mochila.contenido = ["cuadernillo", "lapices", "lapicera", "tijeras"];
console.log(mochila.contenido);

/*
    Agregar nuevas propiedades a un objeto
*/

let curso = {
    titulo: "Aprende JavaScript desde 0",
    idioma: "Español",
    duracion: 30
};

curso.vistas = 34500;
console.log(curso);
curso["suscriptores"] = 34;
console.log(curso);

/*
    Eliminar propiedades de los objetos en JS
*/

delete curso.suscriptores;
console.log(curso);

/*
    Usar objetos para busquedas
*/
console.log(buscarElementoQuimico("Al"));

function buscarElementoQuimico(simbolo) {
    var elementoQuimico = "";

    // switch (simbolo) {
    //   case "Al":
    //     elementoQuimico = "Aluminio";
    //     break;
    //   case "S":
    //     elementoQuimico = "Azufre";
    //     break;
    //   case "Cl":
    //     elementoQuimico = "Cloro";
    //     break;
    //   case "He":
    //     elementoQuimico = "Helio";
    //     break;
    //   case "B":
    //     elementoQuimico = "Boro";
    //     break;
    //   case "Li":
    //     elementoQuimico = "Litio";
    //     break;
    // }
    let elementosQuimicos = {
        Al: "Aluminio",
        S: "Azufre",
        Cl: "Cloro",
        He: "Helio",
        B: "Boro",
        Li: "Litio"
    };
    // return elementoQuimico;
    return elementosQuimicos[simbolo];
}

console.log(buscarElementoQuimico("S"));
console.log(buscarElementoQuimico("Li"));


/*
  Verificar propiedades de los objetos
*/

let otroCuaderno = {
    color: "Verde",
    categoria: 4,
    precio: 7.5
};

console.log(otroCuaderno.hasOwnProperty("color"));
console.log(otroCuaderno.hasOwnProperty("pagias"));

function verificarPropiedad(objeto, propiedad) {
    if (objeto.hasOwnProperty(propiedad)) {
        return "Propiedad: " + objeto[propiedad];
    }
    else {
        return "El objeto no tiene esta propiedad."
    }
}

let unCuaderno = {
    color: "Azul",
    categoria: 4,
    precio: 5.6
}

console.log(verificarPropiedad(unCuaderno, "precio"))
console.log(verificarPropiedad(unCuaderno, "cantidad de paginas"))
console.log(verificarPropiedad(unCuaderno, "origen"))

/*
    Objetos complejos, esto es similar a un JSON
*/

var ordenesDePizzas = [
    // Primer elemento index 0
    {
        "tipo": "margarita",
        "tamaño": "individual",
        "precio": 5.67,
        "toppings": [
            "extra queso",
            "champiñones",
            "piña"
        ],
        "paraLlevar": true
    },
    // Segundo elemento index 1
    {
        "tipo": "cuatro quesos",
        "tamaño": "familiar",
        "precio": 18.34,
        "toppings": [
            "extra queso",
            "pimentón"
        ],
        "paraLlevar": false
    },
    {
        tipo: "napolitana",
        tamanio: "individual",
        precio: 18.34,
        toppings: [],
        "para llevar": true
    }
];

console.log(ordenesDePizzas[0]);
console.log(ordenesDePizzas[1]);
console.log(ordenesDePizzas[2]);

// Mostrar algo particular de una de las pizzas

console.log(ordenesDePizzas[0]["tipo"]);
console.log(ordenesDePizzas[1]["toppings"][1]);


/*
  Objetos anidados
*/

let miReceta = {
    "descripcion": "mi postre favorito",
    "costo": 15.6,
    "ingredientes": {
        "masa": {
            "harina": "100 grs",
            "sal": "1 cucharadita",
            "agua": "1 taza"
        },
        "cobertura": {
            "azucar": "120 grs",
            "chocolate": "4 cucharadas",
            "mantequilla": "200 grs"
        }
    }
};

// Acceder a los elementos
console.log(miReceta.descripcion);
console.log(miReceta.costo);
console.log(miReceta["ingredientes"]);
console.log(miReceta.ingredientes.masa);
console.log(miReceta.ingredientes.masa.harina);
console.log(miReceta.ingredientes.masa.sal);
console.log(miReceta.ingredientes.masa.agua);
console.log(miReceta["ingredientes"]["cobertura"]["azucar"]);
console.log(miReceta["ingredientes"]["cobertura"]["chocolate"]);
console.log(miReceta["ingredientes"]["cobertura"]["mantequilla"]);



/*
    Arreglos anidados
*/

let misPlantas = [
    {
        tipo: "flores",
        lista: [
            "rosas",
            "tulipanes",
            "dientes de leon"
        ]
    },
    {
        tipo: "arboles",
        lista: [
            "abeto",
            "pino",
            "abedul"
        ]
    }
]

// Acceso a los elementos
// Acceso al elemento completo
console.log(misPlantas[0]);
console.log(misPlantas[1]);
console.log(misPlantas[0].tipo);
console.log(misPlantas[0].lista);
console.log(misPlantas[0].lista[0]);
console.log(misPlantas[0].lista[1]);
console.log(misPlantas[0].lista[2]);
console.log(misPlantas[1].tipo);
console.log(misPlantas[1].lista);
console.log(misPlantas[1].lista[0]);
console.log(misPlantas[1].lista[1]);
console.log(misPlantas[1].lista[2]);


/*
    Coleccion de discos
*/