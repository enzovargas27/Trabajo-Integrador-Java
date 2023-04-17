public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadoEnum resultado(Equipo equipo) {
        if (golesEquipo1 > golesEquipo2) {
            if (equipo.equals(equipo1)) {
                return ResultadoEnum.Ganador;
            } else if (equipo.equals(equipo2)) {
                return ResultadoEnum.Perdedor;
            }
        } else if (golesEquipo2 > golesEquipo1) {
            if (equipo.equals(equipo2)) {
                return ResultadoEnum.Ganador;
            } else if (equipo.equals(equipo1)) {
                return ResultadoEnum.Perdedor;
            }
        } else if (golesEquipo1 == golesEquipo2) {
            return ResultadoEnum.Empate;
        }
        return null;
    }
}

