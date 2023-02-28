import java.awt.Color
import java.awt.image.BufferedImage  

fun drawCircles(): BufferedImage {
  // Add your code here
    val height = 200
    val width = 200
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    graphics.color = Color.RED
    graphics.drawOval(50, 50, 100, 100)

    graphics.color = Color.YELLOW
    graphics.drawOval(50, 75, 100, 100)

    graphics.color = Color.GREEN
    graphics.drawOval(75, 50, 100, 100)

    graphics.color = Color.BLUE
    graphics.drawOval(75, 75, 100, 100)

    return image
}
