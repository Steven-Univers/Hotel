package Entities

class Habitacion(
    val precioPorNoche: Double,
    val capacidad: Int,
    val numeroHabitacion: Int,
    val estaDisponible: Boolean = true
) {

    fun getDatosHabitacion(): String {
        return "Número de habitación: $numeroHabitacion, Precio por noche: $precioPorNoche , Capacidad : $capacidad, Disponible: ${if (estaDisponible) "Sí" else "No"}"
    }
}