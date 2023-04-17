class Ronda:
        def __init__(self, nro):
        self.nro = nro
        self.partidos = []

        def agregar_partido(self, partido):
        self.partidos.append(partido)

        def puntos(self, pronosticos):
        puntaje_total = 0
        for partido in self.partidos:
        pronostico = pronosticos.get(pronosticos, None)
        if pronostico:
        if pronostico.resultado() == partido.resultado():
        puntaje_total += pronostico.puntos()
        return puntaje_total

