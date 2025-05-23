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

public val RegularGroup.LockKey: ImageVector
    get() {
        if (_lockKey != null) {
            return _lockKey!!
        }
        _lockKey = Builder(name = "LockKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 112.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -8.0f, 54.83f)
                lineTo(120.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 166.83f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 112.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(208.0f, 80.0f)
                lineTo(176.0f, 80.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                lineTo(80.0f, 80.0f)
                lineTo(48.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 96.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(96.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                lineTo(160.0f, 80.0f)
                lineTo(96.0f, 80.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 96.0f)
                lineTo(208.0f, 96.0f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
        .build()
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
