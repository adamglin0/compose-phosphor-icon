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

public val BoldGroup.Bookbookmark: ImageVector
    get() {
        if (_bookbookmark != null) {
            return _bookbookmark!!
        }
        _bookbookmark = Builder(name = "Bookbookmark", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 56.0f)
                lineTo(36.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(60.0f, 212.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(208.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 20.0f)
                close()
                moveTo(120.0f, 44.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(59.0f)
                lineToRelative(-10.51f, -8.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.0f, 0.0f)
                lineTo(120.0f, 103.0f)
                close()
                moveTo(196.0f, 172.0f)
                lineTo(72.0f, 172.0f)
                arcToRelative(35.59f, 35.59f, 0.0f, false, false, -12.0f, 2.06f)
                lineTo(60.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 44.0f)
                lineTo(96.0f, 44.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.5f, 9.37f)
                lineToRelative(22.49f, -18.0f)
                lineToRelative(22.51f, 18.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 180.0f, 128.0f)
                lineTo(180.0f, 44.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _bookbookmark!!
    }

private var _bookbookmark: ImageVector? = null
