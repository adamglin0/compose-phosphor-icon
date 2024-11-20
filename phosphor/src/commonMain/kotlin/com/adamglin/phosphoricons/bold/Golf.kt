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

public val BoldGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 100.0f)
                close()
                moveTo(132.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 132.0f, 116.0f)
                close()
                moveTo(220.0f, 96.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 4.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 220.0f, 96.0f)
                close()
                moveTo(196.0f, 96.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -68.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 196.0f, 96.0f)
                close()
                moveTo(164.0f, 197.86f)
                arcToRelative(108.61f, 108.61f, 0.0f, false, true, -72.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.0f, 22.63f)
                arcToRelative(131.83f, 131.83f, 0.0f, false, false, 32.0f, 7.0f)
                lineTo(116.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 227.46f)
                arcToRelative(131.83f, 131.83f, 0.0f, false, false, 32.0f, -7.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.0f, -22.63f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
