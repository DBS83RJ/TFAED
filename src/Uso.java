import java.util.Date;
import java.util.Objects;

public class Uso implements IDado{
    private Carro carro;
    private Vaga vaga;
    private Date horaEntrada;
    private Date horaSaida;

    public Uso(Carro carro, Vaga vaga, Date horaEntrada, Date horaSaida) {
        this.carro = carro;
        this.vaga = vaga;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Vaga getVaga() {
        return this.vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Date getHoraEntrada() {
        return this.horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Uso)) {
            return false;
        }
        Uso uso = (Uso) o;
        return Objects.equals(carro, uso.carro) && Objects.equals(vaga, uso.vaga) && Objects.equals(horaEntrada, uso.horaEntrada) && Objects.equals(horaSaida, uso.horaSaida);
    }

    @Override
    public String toString() {
        return "{" +
            " carro='" + getCarro() + "'" +
            ", vaga='" + getVaga() + "'" +
            ", horaEntrada='" + getHoraEntrada() + "'" +
            ", horaSaida='" + getHoraSaida() + "'" +
            "}";
    }

    @Override
    public int compareTo(IDado o) {
        Uso uso = (Uso) o;
        return this.carro.compareTo(uso.carro);
    }

}
