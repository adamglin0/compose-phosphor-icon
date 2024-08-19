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

public val LightGroup.`Keyhole-light`: ImageVector
    get() {
        if (`_keyhole-light` != null) {
            return `_keyhole-light`!!
        }
        `_keyhole-light` = Builder(name = "Keyhole-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(166.0f, 112.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -61.5f, 29.86f)
                lineToRelative(-14.0f, 31.72f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 182.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.49f, -8.42f)
                lineToRelative(-14.0f, -31.72f)
                arcTo(38.16f, 38.16f, 0.0f, false, false, 166.0f, 112.0f)
                close()
                moveTo(141.0f, 134.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.49f, 7.61f)
                lineTo(150.8f, 170.0f)
                lineTo(105.2f, 170.0f)
                lineToRelative(12.29f, -27.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.49f, -7.61f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_keyhole-light`!!
    }

private var `_keyhole-light`: ImageVector? = null
