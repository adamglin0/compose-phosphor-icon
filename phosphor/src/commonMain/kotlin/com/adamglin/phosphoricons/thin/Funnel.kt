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

public val ThinGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.0f, 51.15f)
                arcTo(11.85f, 11.85f, 0.0f, false, false, 216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.88f, 20.07f)
                lineToRelative(0.05f, 0.05f)
                lineTo(100.0f, 137.59f)
                lineTo(100.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.66f, 10.0f)
                lineToRelative(32.0f, -21.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.35f, -10.0f)
                lineTo(156.01f, 137.59f)
                lineToRelative(68.86f, -73.52f)
                arcTo(11.85f, 11.85f, 0.0f, false, false, 227.0f, 51.15f)
                close()
                moveTo(219.0f, 58.65f)
                lineTo(149.1f, 133.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 136.0f)
                verticalLineToRelative(58.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, 3.33f)
                lineToRelative(-32.0f, 21.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 216.0f)
                lineTo(108.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.08f, -2.74f)
                lineTo(37.05f, 58.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 6.65f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
