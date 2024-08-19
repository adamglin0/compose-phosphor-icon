package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f)
                close()
                moveTo(215.0f, 142.67f)
                curveToRelative(-19.17f, 34.54f, -55.11f, 53.08f, -106.85f, 55.14f)
                lineTo(85.62f, 250.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 80.1f, 254.0f)
                horizontalLineToRelative(-0.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.39f, -4.34f)
                lineTo(59.22f, 196.77f)
                lineTo(6.35f, 181.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.71f, -11.29f)
                lineTo(58.2f, 147.85f)
                curveTo(60.28f, 96.13f, 78.81f, 60.2f, 113.33f, 41.0f)
                curveTo(159.56f, 15.34f, 219.0f, 30.0f, 222.09f, 31.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.12f, 2.11f)
                curveTo(226.0f, 36.94f, 240.67f, 96.38f, 215.0f, 142.65f)
                close()
                moveTo(167.0f, 172.31f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 130.0f, 126.0f)
                arcTo(50.09f, 50.09f, 0.0f, false, true, 83.71f, 89.0f)
                curveToRelative(-8.46f, 16.93f, -13.0f, 38.0f, -13.63f, 63.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.64f, 5.38f)
                lineTo(25.88f, 174.74f)
                lineToRelative(39.85f, 11.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.12f, 4.12f)
                lineToRelative(11.38f, 39.85f)
                lineToRelative(17.39f, -40.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.37f, -3.64f)
                curveTo(129.0f, 185.33f, 150.05f, 180.76f, 167.0f, 172.29f)
                close()
                moveTo(218.0f, 77.78f)
                arcToRelative(171.1f, 171.1f, 0.0f, false, false, -3.86f, -35.92f)
                arcTo(170.78f, 170.78f, 0.0f, false, false, 178.25f, 38.0f)
                lineTo(178.0f, 38.0f)
                curveToRelative(-18.52f, 0.0f, -45.0f, 3.22f, -66.67f, 18.47f)
                arcTo(83.53f, 83.53f, 0.0f, false, false, 94.17f, 72.56f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 41.47f, 41.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.54f, 6.55f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 41.28f, 41.46f)
                arcToRelative(83.13f, 83.13f, 0.0f, false, false, 16.07f, -17.07f)
                curveTo(214.87f, 123.0f, 218.05f, 96.31f, 218.0f, 77.76f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
