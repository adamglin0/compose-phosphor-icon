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

public val ThinGroup.`Grains-thin`: ImageVector
    get() {
        if (`_grains-thin` != null) {
            return `_grains-thin`!!
        }
        `_grains-thin` = Builder(name = "Grains-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 60.0f)
                arcToRelative(83.5f, 83.5f, 0.0f, false, false, -33.88f, 7.16f)
                curveToRelative(-13.0f, -30.78f, -43.0f, -46.08f, -44.33f, -46.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                curveToRelative(-1.32f, 0.66f, -31.3f, 16.0f, -44.33f, 46.74f)
                arcTo(83.5f, 83.5f, 0.0f, false, false, 48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                lineTo(212.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 60.0f)
                close()
                moveTo(124.0f, 219.9f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 52.0f, 144.0f)
                lineTo(52.0f, 124.1f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 124.0f, 200.0f)
                close()
                moveTo(124.0f, 164.27f)
                arcTo(84.12f, 84.12f, 0.0f, false, false, 52.0f, 116.1f)
                verticalLineToRelative(-48.0f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 124.0f, 144.0f)
                close()
                moveTo(89.05f, 70.75f)
                curveToRelative(10.07f, -24.22f, 32.46f, -38.47f, 39.0f, -42.19f)
                curveToRelative(6.49f, 3.72f, 28.88f, 18.0f, 38.95f, 42.19f)
                arcTo(84.43f, 84.43f, 0.0f, false, false, 128.0f, 118.41f)
                arcTo(84.43f, 84.43f, 0.0f, false, false, 89.05f, 70.75f)
                close()
                moveTo(204.0f, 144.0f)
                arcToRelative(76.11f, 76.11f, 0.0f, false, true, -72.0f, 75.9f)
                lineTo(132.0f, 200.0f)
                arcToRelative(76.11f, 76.11f, 0.0f, false, true, 72.0f, -75.9f)
                close()
                moveTo(204.0f, 116.1f)
                arcToRelative(84.12f, 84.12f, 0.0f, false, false, -72.0f, 48.17f)
                lineTo(132.0f, 144.0f)
                arcToRelative(76.11f, 76.11f, 0.0f, false, true, 72.0f, -75.9f)
                close()
            }
        }
        .build()
        return `_grains-thin`!!
    }

private var `_grains-thin`: ImageVector? = null
