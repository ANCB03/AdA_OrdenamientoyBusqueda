function selectionSort(datos) {
    let auxiliar = [...datos];

    for (let i = 0; i < datos.length; i++) {
        let minimo = auxiliar.slice(i + 1)
                            .reduce((a, e, j) => (e < auxiliar[a] ? j + i + 1 : a), i);
        
        if (minimo != i) {
            [auxiliar[i], auxiliar[minimo]] = [auxiliar[minimo], auxiliar[i]];
        }
    }

    return auxiliar;
}



let num = [];//datos

let resultado = selectionSort(num);

console.log(resultado);

console.timeEnd('loop');