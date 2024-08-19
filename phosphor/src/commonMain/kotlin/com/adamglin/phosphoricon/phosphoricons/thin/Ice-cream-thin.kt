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

public val ThinGroup.`Ice-cream-thin`: ImageVector
    get() {
        if (`_ice-cream-thin` != null) {
            return `_ice-cream-thin`!!
        }
        `_ice-cream-thin` = Builder(name = "Ice-cream-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 100.4f)
                lineTo(204.0f, 96.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 52.0f, 96.0f)
                verticalLineToRelative(4.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 140.0f)
                horizontalLineToRelative(5.61f)
                lineToRelative(56.0f, 97.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.84f, 0.0f)
                lineToRelative(56.0f, -97.95f)
                lineTo(200.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 4.0f, -39.6f)
                close()
                moveTo(131.47f, 234.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.94f, 0.0f)
                lineTo(70.82f, 140.0f)
                lineTo(99.39f, 140.0f)
                lineToRelative(42.9f, 75.06f)
                close()
                moveTo(137.11f, 140.0f)
                lineTo(161.11f, 182.06f)
                lineTo(146.89f, 207.0f)
                lineToRelative(-38.28f, -67.0f)
                close()
                moveTo(165.75f, 174.0f)
                lineTo(146.32f, 140.0f)
                horizontalLineToRelative(38.86f)
                close()
                moveTo(200.0f, 132.0f)
                lineTo(56.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(60.0f, 96.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_ice-cream-thin`!!
    }

private var `_ice-cream-thin`: ImageVector? = null
