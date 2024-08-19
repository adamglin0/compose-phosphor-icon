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

public val BoldGroup.Tipi: ImageVector
    get() {
        if (_tipi != null) {
            return _tipi!!
        }
        _tipi = Builder(name = "Tipi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.11f, 209.53f)
                lineToRelative(-99.86f, -156.0f)
                lineToRelative(19.86f, -31.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 141.89f, 9.53f)
                lineTo(128.0f, 31.24f)
                lineTo(114.11f, 9.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 93.89f, 22.47f)
                lineToRelative(19.86f, 31.0f)
                lineToRelative(-99.86f, 156.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 228.0f)
                lineTo(232.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.11f, -18.47f)
                close()
                moveTo(96.17f, 204.0f)
                lineTo(128.0f, 154.26f)
                lineTo(159.83f, 204.0f)
                close()
                moveTo(188.33f, 204.0f)
                lineTo(138.11f, 125.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.22f, 0.0f)
                lineTo(67.67f, 204.0f)
                lineTo(45.93f, 204.0f)
                lineTo(128.0f, 75.76f)
                lineTo(210.07f, 204.0f)
                close()
            }
        }
        .build()
        return _tipi!!
    }

private var _tipi: ImageVector? = null
