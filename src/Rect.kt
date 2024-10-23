class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Transforming, Figure(0) {

    var color: Int = -1

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return (width * height).toFloat()
    }

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val temp = width
        width = height
        height = temp

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
