import java.awt.Color
import java.awt.image.BufferedImage

fun drawStrings(): BufferedImage {
  // Add your code here
    val height: Int = 200
    val width: Int = 200
    val image = BufferedImage(width, height ,BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    graphics.color = Color.RED
    graphics.drawString("Hello, images!",50,50)

    graphics.color = Color.GREEN
    graphics.drawString("Hello, images!",51,51)

    graphics.color = Color.BLUE
    graphics.drawString("Hello, images!", 52,52)

    return image 

}
