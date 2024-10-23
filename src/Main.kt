fun main() {
    val rect = Rect(0, 0, 4, 2)
    val circle = Circle(5, 5, 3)
    val square = Square(1, 1, 3)

    println(" Начальные состояния ")
    println("Rect: position (${rect.x}, ${rect.y}), size (${rect.width}x${rect.height}), area: ${rect.area()}")
    println("Circle: position (${circle.x}, ${circle.y}), radius ${circle.radius}, area: ${circle.area()}")
    println("Square: position (${square.x}, ${square.y}), side ${square.side}, area: ${square.area()}")
    println()

    // Перемещение
    rect.move(1, 1)
    circle.move(-2, 3)
    square.move(0, -1)

    println(" Перемещение фигур ")
    println("Rect area: ${rect.area()}, new position: (${rect.x}, ${rect.y})")
    println("Circle area: ${circle.area()}, new position: (${circle.x}, ${circle.y})")
    println("Square area: ${square.area()}, new position: (${square.x}, ${square.y})")
    println()

    // Масштабирование
    rect.resize(2)
    circle.resize(2)
    square.resize(2)

    println(" Масштабирование фигур ")
    println("Rect resized area: ${rect.area()}")
    println("Circle resized area: ${circle.area()}")
    println("Square resized area: ${square.area()}")
    println()

    // Поворот
    rect.rotate(RotateDirection.Clockwise, 0, 0)
    circle.rotate(RotateDirection.CounterClockwise, 0, 0)
    square.rotate(RotateDirection.Clockwise, 0, 0)

    println(" Поворот фигур ")
    println("Rect after rotation: position: (${rect.x}, ${rect.y}), size: (${rect.width}х${rect.height})")
    println("Circle after rotation: position: (${circle.x}, ${circle.y})")
    println("Square after rotation: position: (${square.x}, ${square.y})")
    println()
}
