package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Books-thin`: ImageVector
    get() {
        if (`_books-thin` != null) {
            return `_books-thin`!!
        }
        `_books-thin` = Builder(name = "Books-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(116.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 36.0f)
                close()
                moveTo(52.0f, 76.0f)
                horizontalLineToRelative(56.0f)
                lineTo(108.0f, 180.0f)
                lineTo(52.0f, 180.0f)
                close()
                moveTo(56.0f, 44.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(108.0f, 68.0f)
                lineTo(52.0f, 68.0f)
                lineTo(52.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 44.0f)
                close()
                moveTo(104.0f, 212.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 188.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 212.0f)
                close()
                moveTo(227.74f, 195.38f)
                lineTo(194.55f, 37.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.25f, -9.3f)
                lineTo(133.49f, 38.32f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -9.23f, 14.3f)
                lineToRelative(33.19f, 157.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.25f, 9.3f)
                lineToRelative(46.81f, -10.06f)
                horizontalLineToRelative(0.0f)
                arcTo(12.08f, 12.08f, 0.0f, false, false, 227.74f, 195.38f)
                close()
                moveTo(144.53f, 110.11f)
                lineTo(199.16f, 98.38f)
                lineTo(214.16f, 169.45f)
                lineTo(159.53f, 181.19f)
                close()
                moveTo(137.89f, 78.55f)
                lineTo(192.53f, 66.81f)
                lineTo(197.53f, 90.55f)
                lineTo(142.89f, 102.28f)
                close()
                moveTo(135.18f, 46.15f)
                lineTo(182.0f, 36.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.84f, -0.09f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.14f, 0.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.76f, 2.58f)
                lineTo(190.88f, 59.0f)
                lineTo(136.24f, 70.72f)
                lineTo(132.09f, 51.0f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 135.18f, 46.15f)
                close()
                moveTo(216.83f, 201.85f)
                lineTo(170.0f, 211.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -0.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.76f, -2.58f)
                lineTo(161.12f, 189.0f)
                lineToRelative(54.64f, -11.73f)
                lineTo(219.91f, 197.0f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 216.83f, 201.85f)
                close()
            }
        }
        .build()
        return `_books-thin`!!
    }

private var `_books-thin`: ImageVector? = null
