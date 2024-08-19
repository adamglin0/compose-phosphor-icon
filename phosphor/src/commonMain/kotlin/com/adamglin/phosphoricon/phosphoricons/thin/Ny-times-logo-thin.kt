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

public val ThinGroup.`Ny-times-logo-thin`: ImageVector
    get() {
        if (`_ny-times-logo-thin` != null) {
            return `_ny-times-logo-thin`!!
        }
        `_ny-times-logo-thin` = Builder(name = "Ny-times-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 140.0f)
                close()
                moveTo(186.31f, 99.62f)
                lineTo(119.57f, 68.48f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 52.0f, 144.0f)
                curveToRelative(0.0f, 1.32f, 0.0f, 2.64f, 0.1f, 3.95f)
                lineToRelative(74.0f, -39.48f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 132.0f, 112.0f)
                lineTo(132.0f, 219.88f)
                arcToRelative(75.64f, 75.64f, 0.0f, false, false, 68.52f, -53.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.63f, 2.4f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 57.57f, 98.25f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 68.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.69f, 0.38f)
                lineTo(188.85f, 92.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 188.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 186.31f, 99.62f)
                close()
                moveTo(124.0f, 118.62f)
                lineTo(100.0f, 131.42f)
                verticalLineToRelative(83.16f)
                arcToRelative(75.45f, 75.45f, 0.0f, false, false, 24.0f, 5.26f)
                close()
                moveTo(53.05f, 156.51f)
                arcToRelative(76.15f, 76.15f, 0.0f, false, false, 39.0f, 54.4f)
                lineTo(92.05f, 135.73f)
                close()
                moveTo(107.05f, 62.65f)
                lineTo(67.15f, 44.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -4.6f, 47.36f)
                curveToRelative(1.1f, -1.37f, 2.22f, -2.71f, 3.41f, -4.0f)
                arcTo(83.89f, 83.89f, 0.0f, false, true, 107.08f, 62.65f)
                close()
            }
        }
        .build()
        return `_ny-times-logo-thin`!!
    }

private var `_ny-times-logo-thin`: ImageVector? = null
