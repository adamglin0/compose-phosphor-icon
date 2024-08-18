package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Book-user`: ImageVector
    get() {
        if (`_book-user` != null) {
            return `_book-user`!!
        }
        `_book-user` = Builder(name = "Book-user", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 72.0f)
                lineTo(160.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -32.0f, 16.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 96.0f, 72.0f)
                lineTo(24.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(16.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(240.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 72.0f)
                close()
                moveTo(96.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                lineTo(32.0f, 88.0f)
                lineTo(96.0f, 88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(88.0f)
                arcTo(39.81f, 39.81f, 0.0f, false, false, 96.0f, 192.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(160.0f, 192.0f)
                arcToRelative(39.81f, 39.81f, 0.0f, false, false, -24.0f, 8.0f)
                lineTo(136.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(89.6f, 43.19f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 76.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.79f, 9.62f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -51.22f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 89.6f, 43.19f)
                close()
            }
        }
        .build()
        return `_book-user`!!
    }

private var `_book-user`: ImageVector? = null
