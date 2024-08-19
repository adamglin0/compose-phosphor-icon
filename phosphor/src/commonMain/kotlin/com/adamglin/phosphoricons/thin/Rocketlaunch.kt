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

public val ThinGroup.Rocketlaunch: ImageVector
    get() {
        if (_rocketlaunch != null) {
            return _rocketlaunch!!
        }
        _rocketlaunch = Builder(name = "Rocketlaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.86f, 47.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.22f, -11.22f)
                curveToRelative(-12.0f, -0.71f, -42.82f, 0.38f, -68.35f, 25.91f)
                lineTo(134.35f, 68.0f)
                horizontalLineToRelative(-60.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -8.48f, 3.52f)
                lineTo(31.52f, 105.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.81f, 20.37f)
                lineToRelative(39.79f, 5.55f)
                lineToRelative(46.11f, 46.11f)
                lineToRelative(5.55f, 39.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.37f, 6.79f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.52f, -8.48f)
                verticalLineToRelative(-60.0f)
                lineToRelative(5.94f, -5.94f)
                curveTo(219.48f, 90.18f, 220.57f, 59.41f, 219.86f, 47.36f)
                close()
                moveTo(36.21f, 115.6f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 1.0f, -4.09f)
                lineTo(71.53f, 77.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 74.35f, 76.0f)
                horizontalLineToRelative(52.0f)
                lineTo(78.58f, 123.76f)
                lineTo(39.44f, 118.3f)
                arcTo(3.94f, 3.94f, 0.0f, false, true, 36.21f, 115.6f)
                close()
                moveTo(180.0f, 181.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 2.83f)
                lineToRelative(-34.35f, 34.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.79f, -2.25f)
                lineToRelative(-5.46f, -39.15f)
                lineTo(180.0f, 129.65f)
                close()
                moveTo(128.0f, 170.34f)
                lineTo(85.66f, 128.0f)
                lineToRelative(60.28f, -60.29f)
                curveToRelative(23.24f, -23.24f, 51.25f, -24.23f, 62.22f, -23.58f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 3.71f, 3.71f)
                curveToRelative(0.65f, 11.0f, -0.35f, 39.0f, -23.58f, 62.22f)
                close()
                moveTo(98.21f, 189.48f)
                curveTo(94.0f, 198.66f, 80.0f, 220.0f, 40.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                curveToRelative(0.0f, -40.0f, 21.34f, -54.0f, 30.52f, -58.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.32f, 7.28f)
                curveToRelative(-7.46f, 3.41f, -24.43f, 14.66f, -25.76f, 46.85f)
                curveToRelative(32.19f, -1.33f, 43.44f, -18.3f, 46.85f, -25.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.28f, 3.32f)
                close()
            }
        }
        .build()
        return _rocketlaunch!!
    }

private var _rocketlaunch: ImageVector? = null
