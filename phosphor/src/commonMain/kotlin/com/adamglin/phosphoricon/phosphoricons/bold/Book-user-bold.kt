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

public val BoldGroup.`Book-user-bold`: ImageVector
    get() {
        if (`_book-user-bold` != null) {
            return `_book-user-bold`!!
        }
        `_book-user-bold` = Builder(name = "Book-user-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 72.0f)
                lineTo(160.0f, 72.0f)
                arcToRelative(43.86f, 43.86f, 0.0f, false, false, -32.0f, 13.85f)
                arcTo(43.86f, 43.86f, 0.0f, false, false, 96.0f, 72.0f)
                lineTo(24.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 84.0f)
                lineTo(12.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 72.0f)
                close()
                moveTo(96.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(76.81f)
                arcTo(43.79f, 43.79f, 0.0f, false, false, 96.0f, 188.0f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(160.0f, 188.0f)
                arcToRelative(43.71f, 43.71f, 0.0f, false, false, -20.0f, 4.83f)
                lineTo(140.0f, 116.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(60.0f)
                close()
                moveTo(86.4f, 40.79f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.19f, 14.42f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -44.82f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 86.4f, 40.79f)
                close()
            }
        }
        .build()
        return `_book-user-bold`!!
    }

private var `_book-user-bold`: ImageVector? = null
