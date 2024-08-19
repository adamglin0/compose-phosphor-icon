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

public val ThinGroup.Trafficcone: ImageVector
    get() {
        if (_trafficcone != null) {
            return _trafficcone!!
        }
        _trafficcone = Builder(name = "Trafficcone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 212.0f)
                lineTo(210.84f, 212.0f)
                lineTo(149.65f, 36.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 138.31f, 28.0f)
                lineTo(117.69f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.34f, 8.06f)
                lineTo(45.16f, 212.0f)
                lineTo(24.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(232.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(92.58f, 100.0f)
                horizontalLineToRelative(70.84f)
                lineToRelative(19.47f, 56.0f)
                lineTo(73.11f, 156.0f)
                close()
                moveTo(113.91f, 38.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 117.69f, 36.0f)
                horizontalLineToRelative(20.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.78f, 2.69f)
                lineTo(160.63f, 92.0f)
                lineTo(95.37f, 92.0f)
                close()
                moveTo(70.32f, 164.0f)
                lineTo(185.68f, 164.0f)
                lineToRelative(16.69f, 48.0f)
                lineTo(53.63f, 212.0f)
                close()
            }
        }
        .build()
        return _trafficcone!!
    }

private var _trafficcone: ImageVector? = null
