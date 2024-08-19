package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Book-bold`: ImageVector
    get() {
        if (`_book-bold` != null) {
            return `_book-bold`!!
        }
        `_book-bold` = Builder(name = "Book-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 20.0f)
                horizontalLineTo(72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(60.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 20.0f)
                close()
                moveTo(196.0f, 172.0f)
                horizontalLineTo(72.0f)
                arcToRelative(35.59f, 35.59f, 0.0f, false, false, -12.0f, 2.06f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 44.0f)
                horizontalLineTo(196.0f)
                close()
            }
        }
        .build()
        return `_book-bold`!!
    }

private var `_book-bold`: ImageVector? = null
