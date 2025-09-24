package cuenta_bancaria;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class cuenta_bancaria {

    public int NumeroCuenta;
    public String Titular;
    public int AnnoCreacion;
    public int Saldo;
    public String Estado;
    public int anioActual;

    public cuenta_bancaria(int NumeroCuenta, String Titular, int AnnoCreacion, int Saldo, String Estado) {
        this.NumeroCuenta = NumeroCuenta;
        this.Titular = Titular;
        this.AnnoCreacion = AnnoCreacion;
        this.Saldo = Saldo;
        this.Estado = Estado;
    }

    public void mostrarDatos() {
        String Mensaje = "Detalles de la Cuenta Bancaria\n"
                + "Numero de cuenta Bancaria: " + NumeroCuenta + "\n"
                + "Titular de la cuenta: " + Titular + "\n"
                + "Anno de creacion: " + AnnoCreacion + "\n"
                + "Saldo restante: " + Saldo + "\n"
                + "Estado de la cuenta: " + Estado;
        JOptionPane.showMessageDialog(null, Mensaje);
    }

    public String mostrarMayorSaldo(cuenta_bancaria c2, cuenta_bancaria c3) {
        int s1 = this.Saldo;
        int s2 = c2.Saldo;
        int s3 = c3.Saldo;

        int mayor = Math.max(s1, Math.max(s2, s3));

        StringBuilder ganadores = new StringBuilder();
        int contador = 0;

        if (s1 == mayor) {
            ganadores.append(this.Titular).append(" ");
            contador++;
        }
        if (s2 == mayor) {
            ganadores.append(c2.Titular).append(" ");
            contador++;
        }
        if (s3 == mayor) {
            ganadores.append(c3.Titular).append(" ");
            contador++;
        }

        if (contador > 1) {
            return "Empate entre: " + ganadores.toString().trim() + " con saldo de $" + mayor;
        } else {
            return "Mayor saldo: " + ganadores.toString().trim() + " con saldo de $" + mayor;
        }
    }

    public int Antiguedad() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int DiferenciaAnios = anioActual - AnnoCreacion;
        JOptionPane.showMessageDialog(null, "La cuenta fue creada hace: " + DiferenciaAnios + " años");
        return DiferenciaAnios;
    }

    public void compararSaldos(cuenta_bancaria c2, cuenta_bancaria c3) {
        int s1 = this.Saldo;
        int s2 = c2.Saldo;
        int s3 = c3.Saldo;

        int mayor = Math.max(s1, Math.max(s2, s3));

        StringBuilder mensaje = new StringBuilder("Saldos actuales:\n");
        mensaje.append(this.Titular).append(": $").append(s1).append("\n");
        mensaje.append(c2.Titular).append(": $").append(s2).append("\n");
        mensaje.append(c3.Titular).append(": $").append(s3).append("\n\n");

        int contador = 0;
        if (s1 == mayor) {
            contador++;
        }
        if (s2 == mayor) {
            contador++;
        }
        if (s3 == mayor) {
            contador++;
        }

        if (contador > 1) {
            mensaje.append("No existe diferencia, hay un empate en el mayor saldo ($").append(mayor).append(").");
        } else {
            if (s1 == mayor) {
                mensaje.append("La cuenta con mayor saldo es de ").append(this.Titular)
                        .append(" con $").append(s1).append("\n");
                mensaje.append("Diferencia con el siguiente: $").append(mayor - Math.max(s2, s3));
            } else if (s2 == mayor) {
                mensaje.append("La cuenta con mayor saldo es de ").append(c2.Titular).append(" con $").append(s2).append("\n");
                mensaje.append("Diferencia con el siguiente: $").append(mayor - Math.max(s1, s3));
            } else {
                mensaje.append("La cuenta con mayor saldo es de ").append(c3.Titular).append(" con $").append(s3).append("\n");
                mensaje.append("Diferencia con el siguiente: $").append(mayor - Math.max(s1, s2));
            }
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Comparacion de saldos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void IncrementoPorAntiguedad() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int antiguedad = anioActual - AnnoCreacion;

        if (antiguedad > 5) {
            double incremento = Saldo * 0.05;
            Saldo += incremento;
            JOptionPane.showMessageDialog(null,"La cuenta de " + Titular + " tiene " + antiguedad + " annos de antiguedad.\n"+ "Se aplico un incremento del 5%.\n"+ "Incremento: $" + incremento + "\n"+ "Nuevo saldo: $" + Saldo);
        } else {
            JOptionPane.showMessageDialog(null, "La cuenta de " + Titular + " tiene " + antiguedad + " annos de antiguedad.\n" + "No aplica incremento porque no supera los 5 annos.");
        }
    }

    public void SacarDinero(int monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "El monto a retirar debe ser mayor que cero.");
            return;
        }

        if (monto > Saldo) {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente.\n"
                    + "Saldo actual: $" + Saldo + "\n"+ "Intentó retirar: $" + monto);
        } else {
            Saldo -= monto;
            JOptionPane.showMessageDialog(null,"Retiro exitoso de $" + monto + "\n"
                    + "Nuevo saldo: $" + Saldo);
        }
    }
}
