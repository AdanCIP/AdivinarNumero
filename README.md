# Práctica UT05 - Sentencias Condicional y Bucles

## Objetivo

El objetivo de esta práctica es el de desarrollar un pequeño programa/juego que consista en adivinar un número comprendido entre 1 y 100. Este programa pedirá un numero y devolverá si el número que se ha de acertar es mayor o menor a este o si el número introducido es el acertado.

## Desarrollo

El desarrollo de este programa se puede dividir en dos partes:

* Generación de número aleatorio.
* Comprobación del número introducido por teclado.


Para obtener un número aleatorio se utiliza la clase Math:
```bash
double numero = Math.random()*100+1;
```
>__Nota__: Se multiplica por 100 para obtener un número entre 0-99 y se le suma 1 para que esta cantidad varíe entre 1 y 100 como corresponde en el enunciado de la foto.


Para comprobar si el número introducido es el acertado, este es mayor o menor, se utiliza la estructura IF. Bastará con comprobar si este número es menor (número_introducido < número_acertar), mayor (número_introducido > número_acertar) o igual al numero a acertar ((número_introducido == número_acertar))

Por otro lado, para pedir continuamente un número hasta que se acierte se utiliza la estructura while. En este caso se crea un bucle infinito que tan solo se romperá si el número es acertado.
```bash
while (true) {
  comprobaciones...
}
```
>__Nota__: Se utiliza la expresión true para que esta, como indica, siempre sera verdadera y el bucle continue iterando hasta que sea finalizado.
