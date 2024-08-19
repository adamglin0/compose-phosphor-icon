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

public val ThinGroup.`Tent-thin`: ImageVector
    get() {
        if (`_tent-thin` != null) {
            return `_tent-thin`!!
        }
        `_tent-thin` = Builder(name = "Tent-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.66f, 190.38f)
                lineToRelative(-64.0f, -144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 184.0f, 44.0f)
                lineTo(72.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.63f, 2.35f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.0f, 0.06f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-64.0f, 143.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 196.0f)
                lineTo(248.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -5.62f)
                close()
                moveTo(68.0f, 66.85f)
                lineTo(68.0f, 188.0f)
                lineTo(14.16f, 188.0f)
                close()
                moveTo(76.0f, 188.0f)
                lineTo(76.0f, 66.85f)
                lineTo(129.84f, 188.0f)
                close()
                moveTo(138.6f, 188.0f)
                lineTo(78.16f, 52.0f)
                lineTo(181.4f, 52.0f)
                lineToRelative(60.44f, 136.0f)
                close()
            }
        }
        .build()
        return `_tent-thin`!!
    }

private var `_tent-thin`: ImageVector? = null
