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

public val ThinGroup.`Pen-nib-thin`: ImageVector
    get() {
        if (`_pen-nib-thin` != null) {
            return `_pen-nib-thin`!!
        }
        `_pen-nib-thin` = Builder(name = "Pen-nib-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 92.68f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.51f, -8.48f)
                lineTo(171.8f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(125.78f, 44.56f)
                lineTo(66.92f, 66.63f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -7.63f, 9.26f)
                lineTo(36.05f, 215.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 220.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.66f, -0.05f)
                lineTo(180.1f, 196.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.27f, -7.62f)
                lineToRelative(22.07f, -58.86f)
                lineToRelative(29.0f, -29.0f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 244.0f, 92.68f)
                close()
                moveTo(181.88f, 186.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.09f, 2.54f)
                lineTo(51.66f, 210.0f)
                lineToRelative(58.45f, -58.45f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(46.0f, 204.35f)
                lineTo(67.19f, 77.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.54f, -3.09f)
                lineTo(127.0f, 52.64f)
                lineTo(203.35f, 129.0f)
                close()
                moveTo(108.0f, 132.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 132.0f)
                close()
                moveTo(234.83f, 95.51f)
                lineTo(208.0f, 122.34f)
                lineTo(133.66f, 48.0f)
                lineToRelative(26.82f, -26.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(68.69f, 68.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                close()
            }
        }
        .build()
        return `_pen-nib-thin`!!
    }

private var `_pen-nib-thin`: ImageVector? = null
