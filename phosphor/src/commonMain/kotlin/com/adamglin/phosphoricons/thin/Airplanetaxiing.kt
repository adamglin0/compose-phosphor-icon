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

public val ThinGroup.Airplanetaxiing: ImageVector
    get() {
        if (_airplanetaxiing != null) {
            return _airplanetaxiing!!
        }
        _airplanetaxiing = Builder(name = "Airplanetaxiing", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 100.0f)
                lineTo(145.66f, 100.0f)
                lineTo(98.83f, 53.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 52.0f)
                lineTo(88.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.63f, 67.79f)
                lineTo(87.36f, 100.0f)
                lineTo(57.66f, 100.0f)
                lineTo(34.83f, 77.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 76.0f)
                lineTo(24.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.52f, 91.45f)
                lineToRelative(14.06f, 46.89f)
                arcTo(35.79f, 35.79f, 0.0f, false, false, 61.06f, 164.0f)
                lineTo(240.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(244.0f, 136.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 208.0f, 100.0f)
                close()
                moveTo(236.0f, 156.0f)
                lineTo(61.06f, 156.0f)
                arcToRelative(27.83f, 27.83f, 0.0f, false, true, -26.81f, -19.95f)
                lineTo(20.18f, 89.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 84.0f)
                horizontalLineToRelative(6.34f)
                lineToRelative(22.83f, 22.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 56.0f, 108.0f)
                lineTo(92.91f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.79f, -5.26f)
                lineTo(84.21f, 65.26f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 88.0f, 60.0f)
                horizontalLineToRelative(6.34f)
                lineToRelative(46.82f, 46.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 108.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 200.0f)
                close()
                moveTo(124.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 200.0f)
                close()
            }
        }
        .build()
        return _airplanetaxiing!!
    }

private var _airplanetaxiing: ImageVector? = null
