// Valores definidos
const numeroElementos = 3

// Containers
const [
    containerInput,
    containerOutput,
    containerReverse
] = [
    "#input",
    "#sort-output",
    "#reverse-output"
].map(selector => document.querySelector(selector))

// Verificar si un dato es un numero
function isNumeric(n) {
    return !isNaN(parseFloat(n)) && isFinite(n);
}


function crearCarta(num){
    const card = document.createElement("div")
    
    card.innerText = `${num}`
    card.classList.add("card")

    return card
}


function getNumberArray(){
    let miNumbers = [];

    while(miNumbers.length < numeroElementos){

        const value = prompt(`Ingrese un numero (faltan ${numeroElementos - miNumbers.length}):`)

        if(isNumeric(value)){
            miNumbers.push(parseInt(value))
        }
        else {
            alert(`El numero ${value}, no es un numero valido`)
        }

    }

    return miNumbers
}

function run(){
    
    const arrayNumeros = getNumberArray()
    const sortNumeros = arrayNumeros.toSorted()
    const reverseNumeros = arrayNumeros.toSorted().toReversed()

    // Creando cartas
    const cardItems = arrayNumeros.map(num => crearCarta(num))
    const cardItemsSorted = sortNumeros.map(num => crearCarta(num))
    const cardItemsReversed = reverseNumeros.map(num => crearCarta(num))

    cardItems.forEach(el => containerInput.append(el))
    cardItemsSorted.forEach(el => containerOutput.append(el))
    cardItemsReversed.forEach(el => containerReverse.append(el))

}


run()