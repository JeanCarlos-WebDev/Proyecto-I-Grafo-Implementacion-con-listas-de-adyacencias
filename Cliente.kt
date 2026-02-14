package proyecto1

fun main() {
    // Crear grafo
    val grafo = ListasAdyacenciaGrafo<String>()

    println("=== AGREGAR VÉRTICES ===")
    println(grafo.agregarVertice("A")) // true
    println(grafo.agregarVertice("B")) // true
    println(grafo.agregarVertice("C")) // true
    println(grafo.agregarVertice("A")) // false (ya existe)

    println("\n=== CONECTAR VÉRTICES ===")
    println(grafo.conectar("A", "B")) // true
    println(grafo.conectar("A", "C")) // true
    println(grafo.conectar("B", "C")) // true
    println(grafo.conectar("A", "D")) // false (D no existe)

    println("\n=== CONTIENE ===")
    println(grafo.contiene("A")) // true
    println(grafo.contiene("D")) // false

    println("\n=== OBTENER ARCOS DE SALIDA ===")
    println("De A: ${grafo.obtenerArcosSalida("A")}") // B, C
    println("De B: ${grafo.obtenerArcosSalida("B")}") // C
    println("De D: ${grafo.obtenerArcosSalida("D")}") // []

    println("\n=== OBTENER ARCOS DE ENTRADA ===")
    println("Hacia C: ${grafo.obtenerArcosEntrada("C")}") // A, B
    println("Hacia B: ${grafo.obtenerArcosEntrada("B")}") // A
    println("Hacia D: ${grafo.obtenerArcosEntrada("D")}") // []

    println("\n=== TAMANO ===")
    println("Tamaño del grafo: ${grafo.tamano()}") // 3

    println("\n=== ELIMINAR VÉRTICE ===")
    println(grafo.eliminarVertice("B")) // true
    println(grafo.eliminarVertice("D")) // false
    println("Tamaño después de eliminar B: ${grafo.tamano()}") // 2
    println("Arcos de A después de eliminar B: ${grafo.obtenerArcosSalida("A")}") // C

    println("\n=== SUBGRAFO ===")
    val subG = grafo.subgrafo(listOf("A", "C"))
    println("Tamaño subgrafo: ${subG.tamano()}") // 2
    println("Arcos de A en subgrafo: ${subG.obtenerArcosSalida("A")}") // C
    println("Arcos de C en subgrafo: ${subG.obtenerArcosSalida("C")}") // []
}