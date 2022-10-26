console.time('loop');


function busquedaBinaria(datos, dato) {
    let medio = Math.floor(datos.length / 2);

    if (datos[medio] === dato) {
        return medio;
    } else if (datos.length == 1) {
        return null;
    } else if (datos[medio] < dato) {
        let datosTemporal = datos.slice(medio + 1);

        let resultado = busquedaBinaria(datosTemporal, dato);

        if (resultado == null) {
            return null;
        } else {
            return medio + 1 + resultado;
        }
    } else {
        let datosTemporal = datos.slice(0, medio);

        return busquedaBinaria(datosTemporal, dato);
    }
}

let numeros = [10754,11391,11699,12778,12940,12995,13449,13586,13686,15709,16208,16829,17084,17620,17918,19468,19788,19872,20292,20778,21448,22204,22827,23947,24459,25145,25891,28594,29294,31008,31288,33317,33792,34493,36772,37637,37803,40249,40785,41325,42667,44595,44664,44787,44836,45805,47058,47245,47999,48105,48750,49780,50259,50498,50623,51717,52702,54486,55453,56557,56579,58786,59608,60932,61396,61665,61887,62969,63281,63437,64106,64167,65141,66187,66909,67520,67912,69737,70098,70566,71314,74379,74509,
    75594,76941,77303,78010,78689,78836,79229,80292,81364,83278,83910,86109,86367,86400,88007,88630,89734];

console.log(busquedaBinaria(numeros, 12778));   

console.log(busquedaBinaria(numeros, 999999999));   // null

console.log(busquedaBinaria(numeros, 79229));   // 6

console.log(busquedaBinaria(numeros, 10754));   // 1

console.timeEnd('loop');