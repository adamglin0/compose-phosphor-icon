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

public val LightGroup.Trafficcone: ImageVector
    get() {
        if (_trafficcone != null) {
            return _trafficcone!!
        }
        _trafficcone = Builder(name = "Trafficcone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 210.0f)
                lineTo(212.27f, 210.0f)
                lineTo(151.54f, 35.4f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 138.31f, 26.0f)
                lineTo(117.69f, 26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.23f, 9.4f)
                lineTo(43.73f, 210.0f)
                lineTo(24.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(94.0f, 102.0f)
                horizontalLineToRelative(68.0f)
                lineToRelative(18.08f, 52.0f)
                lineTo(75.92f, 154.0f)
                close()
                moveTo(115.8f, 39.34f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 117.69f, 38.0f)
                horizontalLineToRelative(20.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.89f, 1.34f)
                lineTo(157.82f, 90.0f)
                lineTo(98.18f, 90.0f)
                close()
                moveTo(71.74f, 166.0f)
                lineTo(184.26f, 166.0f)
                lineToRelative(15.3f, 44.0f)
                lineTo(56.44f, 210.0f)
                close()
            }
        }
        .build()
        return _trafficcone!!
    }

private var _trafficcone: ImageVector? = null
