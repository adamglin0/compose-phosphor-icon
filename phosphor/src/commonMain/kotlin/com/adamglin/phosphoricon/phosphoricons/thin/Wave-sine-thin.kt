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

public val ThinGroup.`Wave-sine-thin`: ImageVector
    get() {
        if (`_wave-sine-thin` != null) {
            return `_wave-sine-thin`!!
        }
        `_wave-sine-thin` = Builder(name = "Wave-sine-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.62f, 129.7f)
                curveTo(214.4f, 174.93f, 196.1f, 196.0f, 178.0f, 196.0f)
                curveToRelative(-22.56f, 0.0f, -37.67f, -32.21f, -53.66f, -66.3f)
                curveTo(110.15f, 99.37f, 95.44f, 68.0f, 78.0f, 68.0f)
                curveToRelative(-14.2f, 0.0f, -31.13f, 20.76f, -50.34f, 61.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.24f, -3.4f)
                curveTo(41.6f, 81.07f, 59.9f, 60.0f, 78.0f, 60.0f)
                curveToRelative(22.56f, 0.0f, 37.67f, 32.21f, 53.66f, 66.3f)
                curveTo(145.85f, 156.63f, 160.56f, 188.0f, 178.0f, 188.0f)
                curveToRelative(14.2f, 0.0f, 31.13f, -20.76f, 50.34f, -61.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.24f, 3.4f)
                close()
            }
        }
        .build()
        return `_wave-sine-thin`!!
    }

private var `_wave-sine-thin`: ImageVector? = null
