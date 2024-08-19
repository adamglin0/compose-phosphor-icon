package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 128.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 96.0f, 56.0f)
                lineTo(204.69f, 56.0f)
                lineTo(194.34f, 45.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(204.69f, 72.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(224.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, 56.0f)
                lineTo(51.31f, 184.0f)
                lineToRelative(10.35f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(51.31f, 200.0f)
                lineTo(160.0f, 200.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 120.0f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
