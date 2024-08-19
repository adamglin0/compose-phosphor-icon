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

public val LightGroup.`List-star-light`: ImageVector
    get() {
        if (`_list-star-light` != null) {
            return `_list-star-light`!!
        }
        `_list-star-light` = Builder(name = "List-star-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(216.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 64.0f)
                close()
                moveTo(40.0f, 134.0f)
                lineTo(96.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(112.0f, 186.0f)
                lineTo(40.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(235.82f, 142.24f)
                lineTo(212.33f, 161.63f)
                lineTo(219.49f, 190.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, 6.61f)
                lineTo(184.0f, 181.5f)
                lineToRelative(-26.62f, 15.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, -6.61f)
                lineToRelative(7.16f, -28.93f)
                lineToRelative(-23.49f, -19.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, -10.61f)
                lineToRelative(31.0f, -2.4f)
                lineToRelative(11.91f, -27.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 0.0f)
                lineToRelative(11.91f, 27.61f)
                lineToRelative(31.0f, 2.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, 10.61f)
                close()
                moveTo(216.72f, 142.45f)
                lineTo(196.89f, 140.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -3.61f)
                lineTo(184.0f, 119.14f)
                lineToRelative(-7.84f, 18.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 3.61f)
                lineToRelative(-19.83f, 1.53f)
                lineToRelative(14.94f, 12.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, 6.07f)
                lineToRelative(-4.63f, 18.74f)
                lineTo(181.0f, 169.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.08f, 0.0f)
                lineToRelative(17.37f, 10.22f)
                lineToRelative(-4.63f, -18.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, -6.07f)
                close()
            }
        }
        .build()
        return `_list-star-light`!!
    }

private var `_list-star-light`: ImageVector? = null
