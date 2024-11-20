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

public val RegularGroup.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) {
            return _bookmarksSimple!!
        }
        _bookmarksSimple = Builder(name = "BookmarksSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.65f, 6.51f)
                lineTo(112.0f, 193.83f)
                lineToRelative(51.36f, 36.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 224.0f)
                lineTo(176.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 56.0f)
                close()
                moveTo(160.0f, 208.46f)
                lineTo(116.64f, 177.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f)
                lineTo(64.0f, 208.45f)
                lineTo(64.0f, 72.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(208.0f, 40.0f)
                lineTo(208.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 40.0f)
                lineTo(88.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(192.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
