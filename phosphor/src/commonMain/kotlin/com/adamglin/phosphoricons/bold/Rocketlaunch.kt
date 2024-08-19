package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Rocketlaunch: ImageVector
    get() {
        if (_rocketlaunch != null) {
            return _rocketlaunch!!
        }
        _rocketlaunch = Builder(name = "Rocketlaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.85f, 46.89f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -18.74f, -18.74f)
                curveToRelative(-13.13f, -0.77f, -46.65f, 0.42f, -74.48f, 28.24f)
                lineTo(131.0f, 60.0f)
                lineTo(74.36f, 60.0f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(25.87f, 100.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 11.35f, 33.95f)
                lineToRelative(37.14f, 5.18f)
                lineToRelative(42.32f, 42.32f)
                lineToRelative(5.19f, 37.18f)
                arcTo(19.88f, 19.88f, 0.0f, false, false, 135.34f, 235.0f)
                arcToRelative(20.13f, 20.13f, 0.0f, false, false, 6.37f, 1.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 14.1f, -5.87f)
                lineToRelative(34.34f, -34.35f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 196.0f, 181.64f)
                lineTo(196.0f, 125.0f)
                lineToRelative(3.6f, -3.59f)
                curveTo(227.43f, 93.54f, 228.62f, 60.0f, 227.85f, 46.89f)
                close()
                moveTo(76.0f, 84.0f)
                horizontalLineToRelative(31.0f)
                lineTo(75.75f, 115.28f)
                lineToRelative(-27.23f, -3.8f)
                close()
                moveTo(151.6f, 73.37f)
                arcTo(72.27f, 72.27f, 0.0f, false, true, 204.0f, 52.0f)
                arcToRelative(72.17f, 72.17f, 0.0f, false, true, -21.38f, 52.41f)
                lineTo(128.0f, 159.0f)
                lineTo(97.0f, 128.0f)
                close()
                moveTo(172.0f, 180.0f)
                lineToRelative(-27.49f, 27.49f)
                lineToRelative(-3.8f, -27.23f)
                lineTo(172.0f, 149.0f)
                close()
                moveTo(100.0f, 202.0f)
                curveToRelative(-8.71f, 11.85f, -26.19f, 26.0f, -60.0f, 26.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                curveToRelative(0.0f, -33.84f, 14.12f, -51.32f, 26.0f, -60.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 68.18f, 175.3f)
                curveTo(62.3f, 179.63f, 55.51f, 187.8f, 53.0f, 203.0f)
                curveToRelative(15.21f, -2.51f, 23.37f, -9.3f, 27.7f, -15.18f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 100.0f, 202.0f)
                close()
            }
        }
        .build()
        return _rocketlaunch!!
    }

private var _rocketlaunch: ImageVector? = null
