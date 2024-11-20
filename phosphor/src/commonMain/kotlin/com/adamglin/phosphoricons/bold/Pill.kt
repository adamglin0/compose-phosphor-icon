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

public val BoldGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.26f, 36.77f)
                arcToRelative(57.28f, 57.28f, 0.0f, false, false, -81.0f, 0.0f)
                lineTo(36.77f, 138.26f)
                arcToRelative(57.26f, 57.26f, 0.0f, false, false, 81.0f, 81.0f)
                lineTo(219.26f, 117.74f)
                arcTo(57.33f, 57.33f, 0.0f, false, false, 219.26f, 36.77f)
                close()
                moveTo(100.78f, 202.26f)
                arcToRelative(33.26f, 33.26f, 0.0f, true, true, -47.0f, -47.0f)
                lineTo(96.0f, 113.0f)
                lineToRelative(47.0f, 47.0f)
                close()
                moveTo(202.28f, 100.77f)
                lineTo(160.0f, 143.0f)
                lineTo(113.0f, 96.0f)
                lineToRelative(42.27f, -42.26f)
                arcToRelative(33.26f, 33.26f, 0.0f, false, true, 47.0f, 47.0f)
                close()
                moveTo(192.51f, 75.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                lineToRelative(24.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.51f, 75.51f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
