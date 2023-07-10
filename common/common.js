// Implementacion de debounce en el input de la pagina con un clousure
export function debounce (
    doneFunc,
    preDoneFunc = () => {},
    timeout = 1000
){ // 300 miliseconds
    // Variable para almacenar la referencia de nuestro ultimo timeout 
    let timer;
    // Regresamos una funcion donde recibe argumentos por rest 
    return (...args) => {

        // Si existe un timeout lo limpiamos 
        if(timer) clearTimeout(timer);
        // Funcion pre ejecutar el debounce 
        try{
            preDoneFunc.apply(this, args);
        }
        catch(e){
            return;
        }
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
export function isNumeric(n) {
    return !isNaN(parseFloat(n)) && isFinite(n);
}