package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Fishsimple: ImageVector
    get() {
        if (_fishsimple != null) {
            return _fishsimple!!
        }
        _fishsimple = Builder(name = "Fishsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.0f)
                close()
                moveTo(206.77f, 152.73f)
                curveToRelative(-14.5f, 20.0f, -36.17f, 33.57f, -64.38f, 40.2f)
                curveToRelative(-20.91f, 4.91f, -45.61f, 6.0f, -73.8f, 3.42f)
                quadToRelative(2.46f, 20.18f, 7.41f, 42.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 4.77f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, -0.86f, 0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.14f)
                arcToRelative(457.0f, 457.0f, 0.0f, false, true, -7.72f, -45.36f)
                quadToRelative(-21.4f, -2.49f, -45.33f, -7.72f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 16.86f, 180.0f)
                quadToRelative(22.59f, 4.95f, 42.76f, 7.41f)
                curveToRelative(-2.62f, -28.16f, -1.48f, -52.84f, 3.43f, -73.73f)
                curveToRelative(6.63f, -28.21f, 20.14f, -49.88f, 40.18f, -64.39f)
                curveTo(127.32f, 31.8f, 156.61f, 28.0f, 177.53f, 28.0f)
                horizontalLineToRelative(1.71f)
                curveToRelative(22.0f, 0.21f, 40.12f, 4.54f, 41.81f, 5.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 222.46f, 35.0f)
                curveToRelative(1.0f, 1.68f, 5.31f, 19.8f, 5.53f, 41.79f)
                curveTo(228.2f, 97.75f, 224.69f, 128.0f, 206.77f, 152.73f)
                close()
                moveTo(194.54f, 155.16f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, -93.7f, -93.7f)
                curveToRelative(-27.92f, 25.08f, -39.0f, 67.62f, -33.14f, 126.81f)
                curveTo(126.9f, 194.14f, 169.45f, 183.07f, 194.54f, 155.16f)
                close()
                moveTo(215.74f, 40.26f)
                curveTo(204.9f, 37.73f, 148.5f, 26.69f, 108.3f, 55.46f)
                arcToRelative(99.92f, 99.92f, 0.0f, false, false, 92.23f, 92.24f)
                curveTo(229.29f, 107.52f, 218.27f, 51.11f, 215.74f, 40.26f)
                close()
            }
        }
        .build()
        return _fishsimple!!
    }

private var _fishsimple: ImageVector? = null
