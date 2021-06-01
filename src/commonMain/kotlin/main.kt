import com.soywiz.korge.Korge
import com.soywiz.korge.tiled.readTiledMap
import com.soywiz.korge.tiled.tiledMapView
import com.soywiz.korim.color.Colors
import com.soywiz.korio.file.std.resourcesVfs

suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
	val map = resourcesVfs["street/street.tmx"].readTiledMap()
    tiledMapView(map)
}
