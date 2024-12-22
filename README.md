# Kata3

Este proyecto es una kata de programación que implementa la lectura de un archivo TSV, genera un histograma de los datos y lo muestra en un gráfico de barras utilizando JFreeChart.

## Descripción

El objetivo de esta kata es leer un archivo TSV que contiene información sobre títulos, deserializar los datos en objetos `Title`, generar un histograma de los tipos de títulos y mostrarlo en un gráfico de barras.

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

- `Main`: Clase principal que ejecuta el programa.
- `JfreeBarChartHistogramDisplay`: Clase que implementa la visualización del histograma en un gráfico de barras.
- `MainFrame`: Clase que crea la ventana principal para mostrar el histograma.
- `HistogramGenerator`: Clase que genera el histograma a partir de una lista de títulos.
- `TitleDeserializer`: Interfaz para deserializar datos en objetos `Title`.
- `TitleReader`: Interfaz para leer títulos desde una fuente de datos.
- `TsvTitleDeserializer`: Implementación de `TitleDeserializer` para deserializar datos desde un archivo TSV.
- `TsvTitleReader`: Implementación de `TitleReader` para leer títulos desde un archivo TSV.
- `Histogram`: Interfaz que define los métodos para un histograma.
- `Title`: Clase que representa un título con sus atributos y tipos.
- `HistogramDisplay`: Interfaz para mostrar el histograma.
