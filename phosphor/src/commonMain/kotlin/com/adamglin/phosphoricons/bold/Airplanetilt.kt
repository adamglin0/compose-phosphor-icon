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

public val BoldGroup.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) {
            return _airplaneTilt!!
        }
        _airplaneTilt = Builder(name = "AirplaneTilt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 115.31f)
                lineTo(217.21f, 89.7f)
                lineToRelative(0.26f, -0.26f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.91f, -50.91f)
                curveToRelative(-0.09f, 0.08f, -0.17f, 0.17f, -0.26f, 0.26f)
                lineTo(140.69f, 66.0f)
                lineTo(60.1f, 36.71f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 47.52f, 39.5f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 25.34f, 82.0f)
                lineToRelative(59.83f, 39.88f)
                lineTo(75.0f, 132.0f)
                lineTo(56.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 3.51f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.0f, 19.62f)
                lineToRelative(35.23f, 14.1f)
                lineToRelative(14.06f, 35.14f)
                lineToRelative(0.09f, 0.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.76f, 3.7f)
                lineToRelative(23.81f, -23.81f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 124.0f, 200.0f)
                lineTo(124.0f, 181.0f)
                lineToRelative(10.13f, -10.13f)
                lineTo(174.0f, 230.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.47f, 1.83f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.79f, -12.59f)
                close()
                moveTo(185.89f, 205.16f)
                lineTo(146.0f, 145.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.8f, -5.28f)
                arcTo(11.66f, 11.66f, 0.0f, false, false, 136.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.52f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 176.0f)
                verticalLineToRelative(19.0f)
                lineToRelative(-7.62f, 7.62f)
                lineToRelative(-9.24f, -23.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.69f, -6.69f)
                lineToRelative(-23.1f, -9.24f)
                lineTo(61.0f, 156.0f)
                lineTo(80.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f)
                lineToRelative(24.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 110.66f, 110.0f)
                lineTo(50.84f, 70.12f)
                lineToRelative(8.24f, -8.25f)
                lineToRelative(80.83f, 29.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.84f, -3.05f)
                lineToRelative(30.89f, -32.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-32.82f, 30.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.06f, 12.84f)
                lineToRelative(29.4f, 80.82f)
                close()
            }
        }
        .build()
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
