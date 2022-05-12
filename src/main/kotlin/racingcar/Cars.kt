package racingcar

class Cars(private val cars: List<Car>) {

    fun move(moveStrategy: MoveStrategy): List<Car> {
        val newCars = mutableListOf<Car>()
        cars.forEach { newCars.add(it.move(moveStrategy.isMove())) }
        return newCars
    }
}
