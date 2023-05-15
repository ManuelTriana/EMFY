# Ejercicio 1


En su labor como programador de software, ha sido seleccionado para desarrollar una aplicación para el rector de una escuela de formación de músicos. La institución requiere programa que pueda calcular el promedio de ingresos generados durante el último semestre, además de tener el registro adecuado de sus estudiantes. Esta información es necesaria para los informes fiscales, presupuesto interno y gastos principales de la escuela. Cada estudiante debe proporcionar datos básicos, como su número de identificación, nombre y el curso al que se ha inscrito. Aclaraciones:

• La aplicación se diseñará para calcular el promedio de ingresos netos de un periodo específico.

• Para simplificar el ejemplo, no se considerará el almacenamiento persistente de los datos.

• No se realizarán validaciones ni se comprobará la calidad de los datos ingresados.

# HU Programa

![HU](https://github.com/ManuelTriana/EMFY/assets/132718719/cf9cde94-8d25-436f-820d-84c3537b02b9)



# Diagrama caso de uso
![casouso](https://github.com/ManuelTriana/EMFY/assets/132718719/ab655413-1a97-4460-9d54-c647cfed47fd)



# Diagrama de Flujo
![DFD](https://github.com/ManuelTriana/EMFY/assets/132718719/007205c6-95df-4211-9428-7577009d8dfc)



# Pseudocodigo

Algoritmo Escuelamusicalprom

Tamaño <- 50

Dimension identificaciones[tamaño]

Dimension nombres[tamaño]

Dimension Enfasismusical[tamaño]

Dimension Costos[tamaño]

Escribir '--------------------------------------'

Escribir 'Digite el numero de estudiantes'

Leer numeroestudiantes

Escribir '--------------------------------------'

Para i<- 0 Hasta numeroestudiantes-1 Hacer

Escribir '--------------------------------------'

Escribir 'Digite la identificacion del estudiante'

Leer Identificacion

Escribir '--------------------------------------'

Escribir 'Digite el nombre del estudiante'

Leer nombre

Escribir '--------------------------------------'

Escribir 'Digite el enfasis instrumental del estudiante: '

Leer Enfasisestudiante

Escribir '--------------------------------------'

Escribir 'Digite el costo del semestre del estudiante:'

Leer costo

identificaciones[i] <- identificacion

nombres[i] <- nombre

Enfasismusical[i] <- Enfasisestudiante

costos[i] <- costo

FinPara

Para i<-0 Hasta numeroestudiantes-1 Hacer

promedio <- promedio+(costos[i]/numeroestudiantes)

FinPara

Escribir '--------------------------------------'

Escribir 'Los estudiantes son :'

Para i<-0 Hasta numeroestudiantes-1 Hacer

Escribir '--------------------------------------'

Escribir 'C.C: ',identificaciones[i]

Escribir 'Nombre: ',nombres[i]

Escribir 'Enfasis: ',Enfasismusical[i]

Escribir 'Costo: ',costos[i],'$'

FinPara

Escribir '**********************************'

Escribir 'El promedio de ingresos es de: ',promedio,'$'

FinAlgoritmo
