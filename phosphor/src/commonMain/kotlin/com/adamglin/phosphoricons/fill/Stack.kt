package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 169.09f)
                lineToRelative(-92.0f, 53.65f)
                lineTo(36.0f, 169.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 182.91f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 220.0f, 169.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 121.09f)
                lineToRelative(-92.0f, 53.65f)
                lineTo(36.0f, 121.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 134.91f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 220.0f, 121.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 86.91f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.06f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.82f)
                lineToRelative(-96.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.06f, 0.0f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.82f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
