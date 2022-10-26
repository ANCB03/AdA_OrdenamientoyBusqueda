console.time('loop');


Array.prototype.ordenarDatosBurbuja = function() {
    let ordenado = false;

    while(!ordenado) {
        ordenado = true;

        for (let i = 0; i < this.length - 1; i++) {
            if (this[i] > this[i + 1]) {
                let temporal = this[i + 1];
                this[i + 1] = this[i];
                this[i] = temporal;

                ordenado = false;
            }
        }
    }

    return this;
}

let numeros = [
  //ingresar datos
   
];


let numerosOrdenados = numeros.ordenarDatosBurbuja();

console.log(numerosOrdenados);  


console.timeEnd('loop');




 







