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

public val ThinGroup.`Popcorn-thin`: ImageVector
    get() {
        if (`_popcorn-thin` != null) {
            return `_popcorn-thin`!!
        }
        `_popcorn-thin` = Builder(name = "Popcorn-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.76f, 77.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.86f, -1.0f)
                lineToRelative(-3.49f, 1.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 165.7f, 46.64f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -75.4f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 36.59f, 77.15f)
                lineToRelative(-3.49f, -1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 4.77f)
                lineTo(58.66f, 210.75f)
                arcTo(11.94f, 11.94f, 0.0f, false, false, 70.34f, 220.0f)
                lineTo(185.66f, 220.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 11.68f, -9.25f)
                lineTo(227.89f, 80.92f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.76f, 77.11f)
                close()
                moveTo(76.0f, 52.0f)
                arcToRelative(32.08f, 32.08f, 0.0f, false, true, 15.0f, 3.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.78f, -2.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 62.47f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 165.0f, 55.72f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 46.65f, 23.64f)
                lineTo(168.22f, 91.78f)
                lineTo(132.46f, 77.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.92f, 0.0f)
                lineTo(87.78f, 91.78f)
                lineTo(44.33f, 79.36f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 76.0f, 52.0f)
                close()
                moveTo(70.34f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.08f)
                lineToRelative(-29.0f, -123.2f)
                lineTo(84.38f, 99.13f)
                lineTo(99.43f, 212.0f)
                close()
                moveTo(107.5f, 212.0f)
                lineTo(92.38f, 98.56f)
                lineTo(126.52f, 84.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineToRelative(34.13f, 13.66f)
                lineTo(148.5f, 212.0f)
                close()
                moveTo(189.56f, 208.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, 3.08f)
                lineTo(156.57f, 212.0f)
                lineTo(171.62f, 99.13f)
                lineToRelative(46.92f, -13.41f)
                close()
            }
        }
        .build()
        return `_popcorn-thin`!!
    }

private var `_popcorn-thin`: ImageVector? = null
