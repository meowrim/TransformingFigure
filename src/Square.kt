class Square(var x: Int, var y: Int, var side: Int) : Movable, Transforming, Figure(0) {

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return (side * side).toFloat()
    }

    override fun resize(zoom: Int) {
        side *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        if (direction == RotateDirection.Clockwise) {
            val newX = centerY - (y - centerX)
            val newY = centerX + (x - centerY)
            x = newX
            y = newY
        } else {
            val newX = centerY + (y - centerX)
            val newY = centerX - (x - centerY)
            x = newX
            y = newY
        }
    }
}
