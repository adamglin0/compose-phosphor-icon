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

public val ThinGroup.`Cube-thin`: ImageVector
    get() {
        if (`_cube-thin` != null) {
            return `_cube-thin`!!
        }
        `_cube-thin` = Builder(name = "Cube-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.76f, 69.66f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.52f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.24f, 10.52f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 11.52f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 175.82f)
                lineTo(228.0f, 80.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 221.76f, 69.66f)
                close()
                moveTo(126.08f, 28.5f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.84f, 0.0f)
                lineTo(216.67f, 76.0f)
                lineTo(128.0f, 124.52f)
                lineTo(39.33f, 76.0f)
                close()
                moveTo(38.08f, 179.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 175.82f)
                lineTo(36.0f, 83.29f)
                lineToRelative(88.0f, 48.16f)
                verticalLineToRelative(94.91f)
                close()
                moveTo(217.92f, 179.33f)
                lineTo(132.0f, 226.33f)
                lineTo(132.0f, 131.45f)
                lineToRelative(88.0f, -48.16f)
                verticalLineToRelative(92.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 217.92f, 179.32f)
                close()
            }
        }
        .build()
        return `_cube-thin`!!
    }

private var `_cube-thin`: ImageVector? = null
