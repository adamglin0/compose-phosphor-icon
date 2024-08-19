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

public val LightGroup.`Circuitry-light`: ImageVector
    get() {
        if (`_circuitry-light` != null) {
            return `_circuitry-light`!!
        }
        `_circuitry-light` = Builder(name = "Circuitry-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(88.0f, 158.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 88.0f, 158.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(82.0f, 46.0f)
                lineTo(82.0f, 146.84f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(94.0f, 110.49f)
                lineToRelative(52.0f, 52.0f)
                lineTo(146.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(158.0f, 210.0f)
                lineTo(158.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.24f)
                lineTo(94.0f, 93.51f)
                lineTo(94.0f, 46.0f)
                horizontalLineToRelative(36.0f)
                lineTo(130.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.76f, 4.24f)
                lineToRelative(17.0f, 17.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 8.48f, -8.48f)
                lineTo(142.0f, 69.51f)
                lineTo(142.0f, 46.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(168.0f, 94.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 168.0f, 94.0f)
                close()
            }
        }
        .build()
        return `_circuitry-light`!!
    }

private var `_circuitry-light`: ImageVector? = null
