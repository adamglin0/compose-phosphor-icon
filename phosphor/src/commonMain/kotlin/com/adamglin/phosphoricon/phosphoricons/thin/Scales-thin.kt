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

public val ThinGroup.`Scales-thin`: ImageVector
    get() {
        if (`_scales-thin` != null) {
            return `_scales-thin`!!
        }
        `_scales-thin` = Builder(name = "Scales-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.71f, 134.51f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.57f, -2.41f)
                lineTo(132.0f, 67.0f)
                lineTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 68.79f)
                lineTo(55.13f, 84.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.84f, 2.41f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-32.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 168.0f)
                curveToRelative(0.0f, 20.4f, 22.08f, 28.0f, 36.0f, 28.0f)
                reflectiveCurveToRelative(36.0f, -7.6f, 36.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.29f, -1.49f)
                lineTo(61.46f, 90.88f)
                lineTo(124.0f, 77.0f)
                lineTo(124.0f, 212.0f)
                lineTo(104.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 212.0f)
                lineTo(132.0f, 75.21f)
                lineToRelative(61.47f, -13.66f)
                lineToRelative(-29.18f, 73.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 136.0f)
                curveToRelative(0.0f, 20.4f, 22.08f, 28.0f, 36.0f, 28.0f)
                reflectiveCurveToRelative(36.0f, -7.6f, 36.0f, -28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.71f, 134.51f)
                close()
                moveTo(56.0f, 188.0f)
                curveToRelative(-7.15f, 0.0f, -27.37f, -3.56f, -28.0f, -19.27f)
                lineToRelative(28.0f, -70.0f)
                lineToRelative(28.0f, 70.0f)
                curveTo(83.37f, 184.44f, 63.15f, 188.0f, 56.0f, 188.0f)
                close()
                moveTo(200.0f, 156.0f)
                curveToRelative(-7.15f, 0.0f, -27.37f, -3.56f, -28.0f, -19.27f)
                lineToRelative(28.0f, -70.0f)
                lineToRelative(28.0f, 70.0f)
                curveTo(227.37f, 152.44f, 207.15f, 156.0f, 200.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_scales-thin`!!
    }

private var `_scales-thin`: ImageVector? = null
