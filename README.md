# ♠ Poker — Simulador de Probabilidades Monte Carlo

> *¿Cuántas posibilidades tienes realmente de ganar? Este proyecto te lo dice.*

Un simulador estadístico de póker basado en el método de **Monte Carlo** que calcula con precisión la probabilidad de ganar una mano en función de tus cartas, el número de jugadores en mesa y las decisiones que toman a lo largo de la partida.

---

## ¿Qué es esto?

La mayoría de los jugadores de póker toman decisiones por intuición. Este proyecto las toma por **matemáticas**.

Dado un estado concreto de la partida (tus cartas, las cartas comunitarias visibles, cuántos jugadores siguen en juego), el simulador ejecuta **miles de partidas aleatorias** para estimar la probabilidad exacta de que ganes. Cuantas más simulaciones, mayor precisión.

Esto es precisamente el método **Monte Carlo**: en lugar de calcular probabilidades de forma analítica (lo cual se vuelve computacionalmente inviable con tantas combinaciones posibles), se **muestrea el espacio de posibilidades** de forma aleatoria y repetida, y se observa qué porcentaje de veces se gana.

---

## El método Monte Carlo

La técnica de Monte Carlo es un enfoque matemático-estadístico que se basa en tres principios:

1. **Muestreo aleatorio repetido** — Se generan miles de escenarios posibles aleatoriamente.
2. **Estimación por frecuencia** — La probabilidad de un evento se aproxima como la fracción de simulaciones en que ocurre.
3. **Convergencia** — Cuantas más iteraciones, más preciso es el resultado (Ley de los Grandes Números).

En el contexto del póker:

```
P(ganar) ≈ partidas_ganadas / total_simulaciones
```

Con ~10.000 simulaciones se obtiene una estimación fiable. Con ~100.000, la precisión es prácticamente exacta para uso práctico.

---

## Características

- ✅ Cálculo de probabilidad de victoria para cualquier mano de póker
- ✅ Soporte para múltiples jugadores (configurable)
- ✅ Simulación de abandono de jugadores (*fold*) durante la partida
- ✅ Basado íntegramente en probabilidad, casuística y estadística
- ✅ Sin heurísticas ni reglas hard-coded — todo emerge de la simulación

---

## Tecnología

| | |
|---|---|
| **Lenguaje** | Java |
| **IDE** | IntelliJ IDEA |
| **Paradigma** | Orientado a objetos |
| **Técnica estadística** | Monte Carlo |

> 💡 **Nota del autor:** El lenguaje ideal para este tipo de simulación sería **Python**, por su ecosistema estadístico (NumPy, SciPy, Matplotlib) y la velocidad de iteración. Este proyecto nació como ejercicio práctico de Java.

---

## Licencia

Proyecto de código abierto. Ver repositorio para detalles.

---

<p align="center">Desarrollado por <a href="https://github.com/NaVi2O">NaVi2O</a> · Estadística aplicada al verde de la mesa</p>
