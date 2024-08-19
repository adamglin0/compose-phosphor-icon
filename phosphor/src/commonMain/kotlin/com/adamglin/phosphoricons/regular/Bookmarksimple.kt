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

public val RegularGroup.Bookmarksimple: ImageVector
    get() {
        if (_bookmarksimple != null) {
            return _bookmarksimple!!
        }
        _bookmarksimple = Builder(name = "Bookmarksimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                lineTo(72.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 48.0f)
                lineTo(56.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.24f, 6.78f)
                lineTo(128.0f, 193.43f)
                lineToRelative(59.77f, 37.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 224.0f)
                lineTo(200.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 32.0f)
                close()
                moveTo(184.0f, 209.57f)
                lineTo(132.23f, 177.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(72.0f, 209.57f)
                lineTo(72.0f, 48.0f)
                lineTo(184.0f, 48.0f)
                close()
            }
        }
        .build()
        return _bookmarksimple!!
    }

private var _bookmarksimple: ImageVector? = null
