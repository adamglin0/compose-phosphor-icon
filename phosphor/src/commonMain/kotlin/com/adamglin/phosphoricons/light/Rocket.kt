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

public val LightGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 224.0f)
                close()
                moveTo(128.0f, 110.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 110.0f)
                close()
                moveTo(221.67f, 155.4f)
                lineTo(209.31f, 211.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 187.0f, 219.0f)
                lineToRelative(-27.79f, -21.0f)
                lineTo(96.82f, 198.0f)
                lineTo(69.0f, 219.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -22.34f, -8.0f)
                lineTo(34.33f, 155.4f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, true, 2.91f, -12.0f)
                lineToRelative(29.0f, -34.76f)
                arcToRelative(121.28f, 121.28f, 0.0f, false, true, 8.48f, -36.71f)
                curveToRelative(12.72f, -31.88f, 35.52f, -51.88f, 44.73f, -59.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.16f, 0.0f)
                curveToRelative(9.21f, 7.12f, 32.0f, 27.12f, 44.73f, 59.0f)
                arcToRelative(121.28f, 121.28f, 0.0f, false, true, 8.48f, 36.71f)
                lineToRelative(29.0f, 34.76f)
                arcTo(14.06f, 14.06f, 0.0f, false, true, 221.67f, 155.4f)
                close()
                moveTo(98.26f, 186.0f)
                horizontalLineToRelative(59.48f)
                curveToRelative(21.93f, -38.46f, 26.12f, -75.33f, 12.43f, -109.62f)
                curveToRelative(-11.95f, -30.0f, -34.35f, -48.87f, -40.93f, -54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.48f, 0.0f)
                curveToRelative(-6.58f, 5.09f, -29.0f, 24.0f, -40.93f, 54.0f)
                curveTo(72.14f, 110.67f, 76.33f, 147.54f, 98.26f, 186.0f)
                close()
                moveTo(87.0f, 190.4f)
                curveToRelative(-12.0f, -21.49f, -18.9f, -42.6f, -20.62f, -63.19f)
                lineTo(46.46f, 151.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.42f, 1.71f)
                lineToRelative(12.37f, 55.64f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.2f, 1.13f)
                lineToRelative(0.13f, -0.11f)
                close()
                moveTo(209.57f, 151.08f)
                lineTo(189.68f, 127.21f)
                curveToRelative(-1.72f, 20.59f, -8.6f, 41.7f, -20.62f, 63.19f)
                lineToRelative(25.23f, 19.0f)
                lineToRelative(0.13f, 0.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.2f, -1.13f)
                lineTo(210.0f, 152.79f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 209.54f, 151.08f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
