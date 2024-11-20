package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -51.12f, 15.77f)
                lineToRelative(-26.79f, 33.0f)
                lineTo(146.0f, 73.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -36.06f, 0.0f)
                lineTo(85.91f, 128.74f)
                lineToRelative(-26.79f, -33.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -26.6f, 12.0f)
                lineTo(47.0f, 194.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 62.78f, 208.0f)
                horizontalLineTo(193.22f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 209.0f, 194.63f)
                lineToRelative(14.47f, -86.85f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 248.0f, 80.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(24.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 36.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 80.0f)
                close()
                moveTo(220.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 92.0f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
