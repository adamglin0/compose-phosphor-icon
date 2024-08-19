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

public val ThinGroup.Bookmarksimple: ImageVector
    get() {
        if (_bookmarksimple != null) {
            return _bookmarksimple!!
        }
        _bookmarksimple = Builder(name = "Bookmarksimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 48.0f)
                lineTo(60.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, 3.39f)
                lineTo(128.0f, 188.72f)
                lineToRelative(61.89f, 38.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 228.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, 1.94f, -0.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 224.0f)
                lineTo(196.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 36.0f)
                close()
                moveTo(188.0f, 216.78f)
                lineTo(130.11f, 180.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.24f, 0.0f)
                lineTo(68.0f, 216.78f)
                lineTo(68.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(184.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bookmarksimple!!
    }

private var _bookmarksimple: ImageVector? = null