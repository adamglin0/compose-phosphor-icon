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

public val LightGroup.`Asterisk-light`: ImageVector
    get() {
        if (`_asterisk-light` != null) {
            return `_asterisk-light`!!
        }
        `_asterisk-light` = Builder(name = "Asterisk-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.14f, 179.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.23f, 2.06f)
                lineTo(134.0f, 138.6f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(138.6f)
                lineTo(51.09f, 181.15f)
                arcTo(6.07f, 6.07f, 0.0f, false, true, 48.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.1f, -11.15f)
                lineTo(116.34f, 128.0f)
                lineTo(44.91f, 85.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.18f, -10.3f)
                lineTo(122.0f, 117.4f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(77.4f)
                lineToRelative(70.91f, -42.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.18f, 10.3f)
                lineTo(139.66f, 128.0f)
                lineToRelative(71.43f, 42.85f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 213.14f, 179.09f)
                close()
            }
        }
        .build()
        return `_asterisk-light`!!
    }

private var `_asterisk-light`: ImageVector? = null
