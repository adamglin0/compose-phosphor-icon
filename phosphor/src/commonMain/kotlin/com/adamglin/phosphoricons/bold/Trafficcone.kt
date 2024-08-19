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

public val BoldGroup.Trafficcone: ImageVector
    get() {
        if (_trafficcone != null) {
            return _trafficcone!!
        }
        _trafficcone = Builder(name = "Trafficcone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 204.0f)
                lineTo(216.53f, 204.0f)
                lineTo(157.2f, 33.43f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 138.31f, 20.0f)
                lineTo(117.69f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 98.8f, 33.43f)
                lineTo(39.47f, 204.0f)
                lineTo(24.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(98.27f, 108.0f)
                horizontalLineToRelative(59.46f)
                lineToRelative(13.91f, 40.0f)
                lineTo(84.36f, 148.0f)
                close()
                moveTo(120.53f, 44.0f)
                horizontalLineToRelative(14.94f)
                lineToRelative(13.91f, 40.0f)
                lineTo(106.62f, 84.0f)
                close()
                moveTo(76.0f, 172.0f)
                lineTo(180.0f, 172.0f)
                lineToRelative(11.13f, 32.0f)
                lineTo(64.88f, 204.0f)
                close()
            }
        }
        .build()
        return _trafficcone!!
    }

private var _trafficcone: ImageVector? = null
