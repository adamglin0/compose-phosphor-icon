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

public val BoldGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.29f, 47.91f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 25.2f, 69.45f)
                lineToRelative(0.12f, 0.14f)
                lineTo(92.0f, 140.75f)
                lineTo(92.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 31.1f, 16.64f)
                lineToRelative(32.0f, -21.33f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 164.0f, 194.66f)
                lineTo(164.0f, 140.75f)
                lineToRelative(66.67f, -71.16f)
                lineToRelative(0.12f, -0.14f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 234.29f, 47.91f)
                close()
                moveTo(143.29f, 127.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 136.0f)
                verticalLineToRelative(56.52f)
                lineToRelative(-24.0f, 16.0f)
                lineTo(116.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.25f, -8.2f)
                lineTo(49.23f, 60.0f)
                lineTo(206.77f, 60.0f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
