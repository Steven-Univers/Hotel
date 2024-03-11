package Controllers

import Entities.Habitacion
import Entities.Reservacion
import Entities.Cliente
import Utils.Printer

class ReservacionesController {

    private val printer = Printer()
    private val listaReservas = mutableListOf<Reservacion>()

    fun crearReserva(cliente: Cliente, habitacion: Habitacion) {
        printer.printMsg("Ingrese la fecha de inicio")
        val fechaInicio = readln()
        printer.printMsg("Ingrese la fecha de salida")
        val fechaFin = readln()
        printer.printMsg("Ingrese el número de noches")
        val totalNoches = readln().toInt()

        val reservaAgregada = Reservacion(
            habitacion, cliente, fechaInicio, fechaFin, totalNoches, false
        )
        reservaAgregada.calcularPrecio()
        cliente.agregarReserva(reservaAgregada)
        listaReservas.add(reservaAgregada)
    }

    fun mostrarReservas() {
        if (listaReservas.isEmpty()) {
            printer.printMsg("Aún no se encuentran reservas registradas")
        } else {
            var contador = 1
            for (reserva in listaReservas) {
                printer.printMsg("$contador " + reserva.getDatosReserva())
                contador++
            }
        }
    }
}

