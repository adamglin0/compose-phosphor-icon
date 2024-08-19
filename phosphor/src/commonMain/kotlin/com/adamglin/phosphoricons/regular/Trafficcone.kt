package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Trafficcone: ImageVector
    get() {
        if (_trafficcone != null) {
            return _trafficcone!!
        }
        _trafficcone = Builder(name = "Trafficcone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                lineTo(213.69f, 208.0f)
                lineTo(153.42f, 34.75f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 138.31f, 24.0f)
                lineTo(117.69f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.11f, 10.74f)
                lineTo(42.31f, 208.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(232.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(95.43f, 104.0f)
                horizontalLineToRelative(65.14f)
                lineToRelative(16.7f, 48.0f)
                lineTo(78.73f, 152.0f)
                close()
                moveTo(117.69f, 40.0f)
                horizontalLineToRelative(20.62f)
                lineTo(155.0f, 88.0f)
                lineTo(101.0f, 88.0f)
                close()
                moveTo(73.17f, 168.0f)
                lineTo(182.83f, 168.0f)
                lineToRelative(13.92f, 40.0f)
                lineTo(59.25f, 208.0f)
                close()
            }
        }
        .build()
        return _trafficcone!!
    }

private var _trafficcone: ImageVector? = null
