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

public val BoldGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.36f, 170.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 230.0f, 186.37f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.1f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.09f, -20.74f)
                lineToRelative(90.0f, 52.48f)
                lineTo(218.0f, 165.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 234.36f, 170.0f)
                close()
                moveTo(218.0f, 117.63f)
                lineTo(128.0f, 170.11f)
                lineTo(38.05f, 117.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 26.0f, 138.37f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.1f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 218.0f, 117.63f)
                close()
                moveTo(20.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.0f, -10.37f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, true, 12.1f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 20.74f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.1f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 80.0f)
                close()
                moveTo(55.82f, 80.0f)
                lineTo(128.0f, 122.11f)
                lineTo(200.18f, 80.0f)
                lineTo(128.0f, 37.89f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
