package Controllers

import Entities.Habitacion
import Utils.Printer

class HabitacionController(private val printer: Printer) {

    private val listaHabitaciones = mutableListOf<Habitacion>(Habitacion(2000.00, 2, 1, true))

    fun registrarHabitacion() {
        printer.printMsg("Ingrese el precio por noche")
        val precioPorNoche = readln().toDouble()
        printer.printMsg("Ingrese la capacidad")
        val capacidad: Int = readln().toInt()
        printer.printMsg("Ingrese el número de habitación")
        val numeroHabitacion: Int = readln().toInt()
        val estaDisponible = true

        val habitacionAgregada = Habitacion(
            precioPorNoche, capacidad, numeroHabitacion, estaDisponible
        )
        listaHabitaciones.add(habitacionAgregada)
    }

    fun modificarHabitacion(habitacionModificada: Habitacion, indice: Int) {
        listaHabitaciones[indice] = habitacionModificada
    }

    fun obtenerHabitacionPorIndice(indice: Int): Habitacion {
        return listaHabitaciones[indice]
    }

    fun mostrarHabitaciones() {
        if (listaHabitaciones.isEmpty()) {
            printer.printMsg("Aún no se encuentran habitaciones registradas")
        } else {
            var contador = 1
            for (habitacion in listaHabitaciones) {
                printer.printMsg("$contador " + habitacion.getDatosHabitacion())
                contador++
            }
        }
    }

    fun noHayHabitacionesRegistradas(): Boolean = listaHabitaciones.isEmpty()

}
