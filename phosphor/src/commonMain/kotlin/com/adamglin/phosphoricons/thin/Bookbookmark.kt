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

public val ThinGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(52.0f, 220.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                lineTo(208.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(116.0f, 36.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(84.0f)
                lineToRelative(-25.61f, -19.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 0.0f)
                lineTo(116.0f, 120.0f)
                close()
                moveTo(204.0f, 188.0f)
                lineTo(72.0f, 188.0f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, -20.0f, 8.42f)
                lineTo(52.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 36.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, 3.2f)
                lineTo(144.0f, 109.0f)
                lineToRelative(29.61f, 22.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(180.01f, 36.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
