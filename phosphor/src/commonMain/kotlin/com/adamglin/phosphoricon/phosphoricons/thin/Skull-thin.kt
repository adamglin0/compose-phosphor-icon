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

public val ThinGroup.`Skull-thin`: ImageVector
    get() {
        if (`_skull-thin` != null) {
            return `_skull-thin`!!
        }
        `_skull-thin` = Builder(name = "Skull-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 92.0f, 108.0f)
                close()
                moveTo(92.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 148.0f)
                close()
                moveTo(164.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 108.0f)
                close()
                moveTo(164.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 148.0f)
                close()
                moveTo(128.0f, 20.0f)
                curveTo(72.86f, 20.0f, 28.0f, 63.07f, 28.0f, 116.0f)
                curveToRelative(0.0f, 33.43f, 18.33f, 64.64f, 48.0f, 82.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 198.0f)
                curveToRelative(29.67f, -17.38f, 48.0f, -48.59f, 48.0f, -82.0f)
                curveTo(228.0f, 63.07f, 183.14f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(174.06f, 192.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.06f, 3.5f)
                lineTo(172.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(148.0f, 220.0f)
                lineTo(148.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(116.0f, 220.0f)
                lineTo(116.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(88.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(84.0f, 195.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.06f, -3.5f)
                curveTo(53.6f, 176.48f, 36.0f, 147.29f, 36.0f, 116.0f)
                curveToRelative(0.0f, -48.52f, 41.27f, -88.0f, 92.0f, -88.0f)
                reflectiveCurveToRelative(92.0f, 39.48f, 92.0f, 88.0f)
                curveTo(220.0f, 147.29f, 202.4f, 176.48f, 174.06f, 192.19f)
                close()
            }
        }
        .build()
        return `_skull-thin`!!
    }

private var `_skull-thin`: ImageVector? = null
