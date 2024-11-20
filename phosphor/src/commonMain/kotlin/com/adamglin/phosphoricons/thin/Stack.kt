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

public val ThinGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.45f, 174.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.44f, 5.48f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -6.92f)
                lineToRelative(94.0f, 54.83f)
                lineToRelative(94.0f, -54.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 227.45f, 174.0f)
                close()
                moveTo(222.0f, 124.54f)
                lineToRelative(-94.0f, 54.83f)
                lineTo(34.0f, 124.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 6.92f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -6.92f)
                close()
                moveTo(28.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -3.46f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.92f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 80.0f)
                close()
                moveTo(39.94f, 80.0f)
                lineTo(128.0f, 131.37f)
                lineTo(216.06f, 80.0f)
                lineTo(128.0f, 28.63f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
