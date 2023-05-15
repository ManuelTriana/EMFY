---


---

<h1 id="ejercicio-1">Ejercicio 1</h1>
<p>&lt;![endif]–&gt;</p>
<p>En su labor como programador de software, ha sido seleccionado para desarrollar una aplicación para el rector de una escuela de formación de músicos. La institución requiere programa que pueda calcular el promedio de ingresos generados durante el último semestre, además de tener el registro adecuado de sus estudiantes. Esta información es necesaria para los informes fiscales, presupuesto interno y gastos principales de la escuela. Cada estudiante debe proporcionar datos básicos, como su número de identificación, nombre y el curso al que se ha inscrito. Aclaraciones:</p>
<p>• La aplicación se diseñará para calcular el promedio de ingresos netos de un periodo específico.</p>
<p>• Para simplificar el ejemplo, no se considerará el almacenamiento persistente de los datos.</p>
<p>• No se realizarán validaciones ni se comprobará la calidad de los datos ingresados.</p>
<h1 id="hu-programa">HU Programa</h1>
<p>Subido en el repositorio</p>
<h1 id="diagrama-caso-de-uso">Diagrama caso de uso</h1>
<p>Subido en el repositorio</p>
<h1 id="diagrama-de-flujo">Diagrama de Flujo</h1>
<p>Subido en el repositorio</p>
<h1 id="pseudocodigo">Pseudocodigo</h1>
<p>Algoritmo Escuelamusicalprom</p>
<p>Tamaño &lt;- 50</p>
<p>Dimension identificaciones[tamaño]</p>
<p>Dimension nombres[tamaño]</p>
<p>Dimension Enfasismusical[tamaño]</p>
<p>Dimension Costos[tamaño]</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir ‘Digite el numero de estudiantes’</p>
<p>Leer numeroestudiantes</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Para i&lt;- 0 Hasta numeroestudiantes-1 Hacer</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir ‘Digite la identificacion del estudiante’</p>
<p>Leer Identificacion</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir ‘Digite el nombre del estudiante’</p>
<p>Leer nombre</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir 'Digite el enfasis instrumental del estudiante: ’</p>
<p>Leer Enfasisestudiante</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir ‘Digite el costo del semestre del estudiante:’</p>
<p>Leer costo</p>
<p>identificaciones[i] &lt;- identificacion</p>
<p>nombres[i] &lt;- nombre</p>
<p>Enfasismusical[i] &lt;- Enfasisestudiante</p>
<p>costos[i] &lt;- costo</p>
<p>FinPara</p>
<p>Para i&lt;-0 Hasta numeroestudiantes-1 Hacer</p>
<p>promedio &lt;- promedio+(costos[i]/numeroestudiantes)</p>
<p>FinPara</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir ‘Los estudiantes son :’</p>
<p>Para i&lt;-0 Hasta numeroestudiantes-1 Hacer</p>
<p>Escribir ‘--------------------------------------’</p>
<p>Escribir 'C.C: ',identificaciones[i]</p>
<p>Escribir 'Nombre: ',nombres[i]</p>
<p>Escribir 'Enfasis: ',Enfasismusical[i]</p>
<p>Escribir ‘Costo: ‘,costos[i],’$’</p>
<p>FinPara</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘El promedio de ingresos es de: ‘,promedio,’$’</p>
<p>FinAlgoritmo</p>

