# Parcial T2 AREP

## Descripción del proyecto
Es una aplicación web que tiene una clase para computar las funciones numéricas:
- Una para calcular los factores de un número: factors(n) retorna un json con una lista de números enteros positivos. (Recibe solo enteros positivos)
  - Con la función que debería ser:
    - 1 es un factor de todos los números
    - De ahí en adelante, simplemente mirando el módulo, puede verificar si es o no factor.
    - Puede mirar todos los numeros hasta n/2
    - n pertenece también a los factores.
- Una para calcular los números primos hasta un número dado: primes(n), retorna en un json los números primos menores o iguales a n.
  - Con la fucnión que defiría ser:
    - 1 es un número primo
    - de ahí en adelante recuerde que un número es primo si solo es divisible por 1 y por si mismo.
    - Es decir, un número es primo si el tamaño del conjunto de factores es 2.

Con la base dada se modifico GreetingController por MathController, donde se definieron los endpoints `"/factores"` y `"/primos"`.

## Los ejemplos de llamado serían:
### 1. Entrada:
`https://{ip}:{port}/factores?value=13`
### Salida:
```{bash}
{
 "operation": "factores",
 "input":  15,
 "output":  "1,3,5,15"
}
```
### 2. Entrada:
`https://{ip}:{port}/primos?value=100`
### Salida:
```{bash}
{
 "operation": "primos",
 "input":  100,
 "output":  "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97"
}
```

### Ejemplo de que funciona con el endpoint de base
<img width="424" height="142" alt="image" src="https://github.com/user-attachments/assets/7a48adc1-1a58-49bc-83c5-61d3ee88b619" />


