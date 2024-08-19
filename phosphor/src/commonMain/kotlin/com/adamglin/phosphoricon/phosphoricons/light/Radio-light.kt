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

public val LightGroup.`Radio-light`: ImageVector
    get() {
        if (`_radio-light` != null) {
            return `_radio-light`!!
        }
        `_radio-light` = Builder(name = "Radio-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 98.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 104.0f)
                close()
                moveTo(96.0f, 130.0f)
                lineTo(64.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(96.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(96.0f, 162.0f)
                lineTo(64.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(96.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 80.0f)
                lineTo(230.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.28f, -5.75f)
                lineToRelative(160.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.44f, 11.5f)
                lineTo(72.88f, 66.0f)
                lineTo(216.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 80.0f)
                close()
                moveTo(218.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(38.0f, 78.0f)
                lineTo(38.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(198.0f, 136.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, -38.0f, -38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 198.0f, 136.0f)
                close()
                moveTo(186.0f, 136.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 186.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_radio-light`!!
    }

private var `_radio-light`: ImageVector? = null
