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

public val ThinGroup.`Cigarette-thin`: ImageVector
    get() {
        if (`_cigarette-thin` != null) {
            return `_cigarette-thin`!!
        }
        `_cigarette-thin` = Builder(name = "Cigarette-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 132.0f)
                lineTo(32.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 132.0f)
                close()
                moveTo(28.0f, 176.0f)
                lineTo(28.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(84.0f, 140.0f)
                verticalLineToRelative(40.0f)
                lineTo(32.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 176.0f)
                close()
                moveTo(228.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(92.0f, 180.0f)
                lineTo(92.0f, 140.0f)
                lineTo(224.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(204.51f, 62.0f)
                curveToRelative(8.22f, -14.61f, 8.21f, -23.23f, 6.75f, -27.9f)
                arcToRelative(10.82f, 10.82f, 0.0f, false, false, -4.94f, -6.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.3f, -2.0f)
                curveToRelative(0.66f, 0.29f, 6.52f, 3.09f, 9.16f, 11.0f)
                curveToRelative(3.0f, 9.0f, 0.53f, 20.66f, -7.29f, 34.57f)
                curveToRelative(-8.22f, 14.61f, -8.21f, 23.24f, -6.75f, 27.91f)
                arcToRelative(10.74f, 10.74f, 0.0f, false, false, 4.94f, 6.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 108.0f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.63f, -0.35f)
                curveToRelative(-0.66f, -0.3f, -6.52f, -3.09f, -9.16f, -11.0f)
                curveTo(194.23f, 87.59f, 196.69f, 76.0f, 204.51f, 62.0f)
                close()
                moveTo(164.51f, 62.0f)
                curveToRelative(8.22f, -14.61f, 8.21f, -23.23f, 6.75f, -27.9f)
                arcToRelative(10.82f, 10.82f, 0.0f, false, false, -4.94f, -6.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.3f, -2.0f)
                curveToRelative(0.66f, 0.29f, 6.52f, 3.09f, 9.16f, 11.0f)
                curveToRelative(3.0f, 9.0f, 0.53f, 20.66f, -7.29f, 34.57f)
                curveToRelative(-8.22f, 14.61f, -8.21f, 23.24f, -6.75f, 27.91f)
                arcToRelative(10.74f, 10.74f, 0.0f, false, false, 4.94f, 6.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 108.0f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.63f, -0.35f)
                curveToRelative(-0.66f, -0.3f, -6.52f, -3.09f, -9.16f, -11.0f)
                curveTo(154.23f, 87.59f, 156.69f, 76.0f, 164.51f, 62.0f)
                close()
            }
        }
        .build()
        return `_cigarette-thin`!!
    }

private var `_cigarette-thin`: ImageVector? = null
