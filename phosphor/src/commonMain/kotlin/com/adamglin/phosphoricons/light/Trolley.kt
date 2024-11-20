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

public val LightGroup.Trolley: ImageVector
    get() {
        if (_trolley != null) {
            return _trolley!!
        }
        _trolley = Builder(name = "Trolley", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 86.0f, 224.0f)
                close()
                moveTo(216.0f, 210.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 210.0f)
                close()
                moveTo(240.0f, 178.0f)
                lineTo(54.0f, 178.0f)
                lineTo(54.0f, 75.31f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(28.24f, 43.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f)
                lineTo(41.41f, 73.9f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 42.0f, 75.31f)
                lineTo(42.0f, 178.0f)
                lineTo(32.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _trolley!!
    }

private var _trolley: ImageVector? = null
