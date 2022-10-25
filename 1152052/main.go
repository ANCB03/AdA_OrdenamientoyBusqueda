/*
Búsqueda binaria en arreglos de cadenas y números usando Go
@author parzibyte
Visita: parzibyte.me/blog
*/
package main

import (
	"fmt"
	"math"
)

func main() {
	arregloDeNumeros := []int{1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10, 12, 15, 18, 20, 21}
	busquedaNumerica := 2
	resultadoBusquedaNumerica := busquedaBinariaRecursiva(arregloDeNumeros, busquedaNumerica, 0, len(arregloDeNumeros)-1)
	fmt.Printf("[Recursivo] Buscando %d en %v... el índice devuelto es %d\n", busquedaNumerica, arregloDeNumeros, resultadoBusquedaNumerica)
	resultadoBusquedaNumerica = busquedaBinaria(arregloDeNumeros, busquedaNumerica)
	fmt.Printf("[Secuencial] Buscando %d en %v... el índice devuelto es %d\n", busquedaNumerica, arregloDeNumeros, resultadoBusquedaNumerica)

	arregloCadenas := []string{"Avión", "Barco", "Control", "Linterna", "Teléfono", "Vuelo", "Zapato"}
	busquedaCadena := "Control"
	resultadoBusquedaCadena := busquedaBinariaRecursivaCadenas(arregloCadenas, busquedaCadena, 0, len(arregloCadenas)-1)
	fmt.Printf("[Recursivo] Buscando %s en %v... el índice devuelto es %d\n", busquedaCadena, arregloCadenas, resultadoBusquedaCadena)
	resultadoBusquedaCadena = busquedaBinariaCadenas(arregloCadenas, busquedaCadena)
	fmt.Printf("[Secuencial] Buscando %s en %v... el índice devuelto es %d\n", busquedaCadena, arregloCadenas, resultadoBusquedaCadena)
}

func busquedaBinariaRecursiva(arreglo []int, busqueda, izquierda, derecha int) (indice int) {
	if izquierda > derecha {
		return -1
	}
	indiceDelMedio := int(math.Floor((float64(izquierda+derecha) / 2)))
	elementoDelMedio := arreglo[indiceDelMedio]
	if elementoDelMedio == busqueda {
		return indiceDelMedio
	}
	if busqueda < elementoDelMedio {
		derecha = indiceDelMedio - 1
	} else {
		izquierda = indiceDelMedio + 1
	}
	return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha)
}

func busquedaBinaria(arreglo []int, busqueda int) (indice int) {
	izquierda := 0
	derecha := len(arreglo) - 1

	/*
	   Recordemos que For is Go's "while"
	   https://tour.golang.org/flowcontrol/3
	*/
	for izquierda <= derecha {
		indiceDelMedio := int(math.Floor((float64(izquierda+derecha) / 2)))
		elementoDelMedio := arreglo[indiceDelMedio]
		if elementoDelMedio == busqueda {
			return indiceDelMedio
		}
		if busqueda < elementoDelMedio {
			derecha = indiceDelMedio - 1
		} else {
			izquierda = indiceDelMedio + 1
		}
	}
	return -1
}

func busquedaBinariaRecursivaCadenas(arreglo []string, busqueda string, izquierda, derecha int) (indice int) {
	if izquierda > derecha {
		return -1
	}
	indiceDelMedio := int(math.Floor((float64(izquierda+derecha) / 2)))
	elementoDelMedio := arreglo[indiceDelMedio]
	if elementoDelMedio == busqueda {
		return indiceDelMedio
	}
	if busqueda < elementoDelMedio {
		derecha = indiceDelMedio - 1
	} else {
		izquierda = indiceDelMedio + 1
	}
	return busquedaBinariaRecursivaCadenas(arreglo, busqueda, izquierda, derecha)
}

func busquedaBinariaCadenas(arreglo []string, busqueda string) (indice int) {
	izquierda := 0
	derecha := len(arreglo) - 1
	/*
	   Recordemos que For is Go's "while"
	   https://tour.golang.org/flowcontrol/3
	*/
	for izquierda <= derecha {
		indiceDelMedio := int(math.Floor((float64(izquierda+derecha) / 2)))
		elementoDelMedio := arreglo[indiceDelMedio]
		if elementoDelMedio == busqueda {
			return indiceDelMedio
		}
		if busqueda < elementoDelMedio {
			derecha = indiceDelMedio - 1
		} else {
			izquierda = indiceDelMedio + 1
		}
	}
	return -1
}
