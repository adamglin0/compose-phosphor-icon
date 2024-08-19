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

public val ThinGroup.`Tiktok-logo-thin`: ImageVector
    get() {
        if (`_tiktok-logo-thin` != null) {
            return `_tiktok-logo-thin`!!
        }
        `_tiktok-logo-thin` = Builder(name = "Tiktok-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 76.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(128.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(124.0f, 156.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -34.28f, -21.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 130.69f)
                lineTo(92.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.7f, -3.94f)
                curveTo(53.49f, 90.08f, 28.0f, 121.0f, 28.0f, 156.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 144.0f, 0.0f)
                lineTo(172.0f, 109.44f)
                arcTo(99.26f, 99.26f, 0.0f, false, false, 224.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 76.0f)
                close()
                moveTo(220.0f, 115.92f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, -49.66f, -17.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 102.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                curveToRelative(0.0f, -29.52f, 20.32f, -55.79f, 48.0f, -63.0f)
                verticalLineToRelative(35.31f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 132.0f, 156.0f)
                lineTo(132.0f, 28.0f)
                horizontalLineToRelative(32.13f)
                arcTo(60.11f, 60.11f, 0.0f, false, false, 220.0f, 83.87f)
                close()
            }
        }
        .build()
        return `_tiktok-logo-thin`!!
    }

private var `_tiktok-logo-thin`: ImageVector? = null
