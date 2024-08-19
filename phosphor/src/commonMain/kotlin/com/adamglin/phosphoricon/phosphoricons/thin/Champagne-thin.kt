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

public val ThinGroup.`Champagne-thin`: ImageVector
    get() {
        if (`_champagne-thin` != null) {
            return `_champagne-thin`!!
        }
        `_champagne-thin` = Builder(name = "Champagne-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.3f, 12.0f)
                lineTo(97.7f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 2.76f)
                curveToRelative(-1.45f, 4.47f, -35.2f, 109.75f, -6.13f, 149.78f)
                curveTo(94.5f, 173.79f, 104.0f, 178.92f, 116.0f, 179.83f)
                lineTo(116.0f, 236.0f)
                lineTo(96.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(124.0f, 236.0f)
                lineTo(124.0f, 179.83f)
                curveToRelative(12.0f, -0.91f, 21.5f, -6.0f, 28.22f, -15.29f)
                curveToRelative(29.08f, -40.0f, -4.67f, -145.31f, -6.12f, -149.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 142.3f, 12.0f)
                close()
                moveTo(100.65f, 20.0f)
                horizontalLineToRelative(38.7f)
                arcTo(455.34f, 455.34f, 0.0f, false, true, 151.0f, 68.0f)
                lineTo(89.0f, 68.0f)
                arcTo(462.0f, 462.0f, 0.0f, false, true, 100.65f, 20.0f)
                close()
                moveTo(145.75f, 159.83f)
                curveTo(139.8f, 168.0f, 131.38f, 172.0f, 120.0f, 172.0f)
                reflectiveCurveToRelative(-19.8f, -4.0f, -25.75f, -12.16f)
                curveTo(81.0f, 141.63f, 82.6f, 106.72f, 87.6f, 76.0f)
                horizontalLineToRelative(64.81f)
                curveTo(158.86f, 116.0f, 156.57f, 144.94f, 145.75f, 159.83f)
                close()
                moveTo(228.0f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 52.0f)
                close()
                moveTo(204.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 204.0f, 20.0f)
                close()
                moveTo(204.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 204.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_champagne-thin`!!
    }

private var `_champagne-thin`: ImageVector? = null
