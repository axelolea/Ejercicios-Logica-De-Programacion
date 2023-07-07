const inputNumber = document.querySelector("#inputNumber")
const outputNumber = document.querySelector("#outputNumber")
const loadingItem = document.querySelector(".loading")
const delayDebounce = 1000;

// Implementacion de debounce en el input de la pagina con un clousure
function debounce (doneFunc, timeout = delayDebounce){ // 300 miliseconds
    // Variable para almacenar la referencia de nuestro ultimo timeout 
    let timer;
    // Regresamos una funcion donde recibe argumentos por rest 
    return (...args) => {

        // Si existe un timeout lo limpiamos 
        if(timer) clearTimeout(timer);
        
        loadingItem.classList.remove("hidden")
        
        // Almacenamor el timer y creamos una funcion 
        timer = setTimeout(
            // Pasamos a nuestra funcion callback el contexto de ejecucion 
            // del quien reciba la funcion return
            () => doneFunc.apply(this, args),
            timeout // Pasamos el tiempo de ejecucion 
        )
    }
}

// Funcion para verificar que es un numero
function isNumeric(n) {
    return !isNaN(parseFloat(n)) && isFinite(n);
}

// Recursion de cola para funcion factorial 
function factorial(num, rest){
    // Si el valor no es mayor a 1, devolver siempre -1 
    if(num < 1) return -1;
    // Si el numero es 1, devolver 1 multiplicado por el resto de numeros 
    if(num == 1){
        // Si no existe rest, devolver 1
        if(!rest) return 1;
        // Multiplicar por rest 
        return 1 * rest;
    };
    // Si no existe rest, devolver solo el numero base 
    if(!rest) return factorial(num - 1, num)
    // Recursion de cola 
    return factorial(num - 1, num * rest)
}

inputNumber.addEventListener("keyup",
    debounce(
        (e) => {
            loadingItem.classList.add("hidden")
            const value = e.target.value;
            if(!isNumeric(value)) {
                outputNumber.textContent = "No es un numero valido";
                return;
            }
            const valor = factorial(value);
            outputNumber.textContent = `${valor}`
        }
    )
)