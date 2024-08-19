package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Book-bookmark-light`: ImageVector
    get() {
        if (`_book-bookmark-light` != null) {
            return `_book-bookmark-light`!!
        }
        `_book-bookmark-light` = Builder(name = "Book-bookmark-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 26.0f)
                lineTo(72.0f, 26.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 42.0f, 56.0f)
                lineTo(42.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(192.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(54.0f, 218.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, -18.0f)
                lineTo(208.0f, 198.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 26.0f)
                close()
                moveTo(118.0f, 38.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(78.0f)
                lineTo(147.59f, 99.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.2f, 0.0f)
                lineTo(118.0f, 116.0f)
                close()
                moveTo(202.0f, 186.0f)
                lineTo(72.0f, 186.0f)
                arcToRelative(29.87f, 29.87f, 0.0f, false, false, -18.0f, 6.0f)
                lineTo(54.0f, 56.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 72.0f, 38.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f)
                lineTo(144.0f, 111.5f)
                lineToRelative(28.41f, 21.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 182.0f, 128.0f)
                lineTo(182.0f, 38.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return `_book-bookmark-light`!!
    }

private var `_book-bookmark-light`: ImageVector? = null
