import java.awt.Color
import java.awt.image.BufferedImage

fun drawSquare(): BufferedImage {
  // Add your code here
    val height = 500
    val width = 500
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)

    val graphic = image.createGraphics()
    graphic.color = Color.RED
    graphic.drawRect(100, 100, 300, 300)

    return image
}
