package section3

/**
 * CameraMode class uses secondary constructors.
 * These will be replaced with a companion object method
 * to simply the code.
 */
class CameraMode private constructor(val mode: String) {

    companion object {
        fun setMode(shutter: Int = 0, aperture: Double = 0.0) =
            when {
                shutter > 0 && aperture > 0.0 -> CameraMode("manual")
                shutter > 0 -> CameraMode("shutter priority")
                aperture > 0.0 -> CameraMode("aperture priority")
                else -> CameraMode("auto")
            }
    }
}

/**
 * This exercise will demonstrate how to replace a classes
 * secondary constructors by using a factory pattern that
 * uses a companion object.
 */
fun main(args: Array<String>) {
    // Create different instances of CameraMode then display it's mode property
    println(CameraMode.setMode().mode)
    println(CameraMode.setMode(1000).mode)
    println(CameraMode.setMode(aperture = 1.2).mode)
    println(CameraMode.setMode(1000, 1.2).mode)
}

