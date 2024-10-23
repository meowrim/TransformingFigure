interface Transforming {
    fun resize(zoom: Int)
    // Увеличивает фигуру, не перемещая, с сохранением пропорций

    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
    // Поворот фигуры вокруг точки (centerX, centerY) на 90 градусов
}

enum class RotateDirection {
    Clockwise, CounterClockwise
}
