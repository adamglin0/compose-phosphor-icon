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

public val ThinGroup.`Chart-polar-thin`: ImageVector
    get() {
        if (`_chart-polar-thin` != null) {
            return `_chart-polar-thin`!!
        }
        `_chart-polar-thin` = Builder(name = "Chart-polar-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(219.91f, 124.0f)
                lineTo(187.85f, 124.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 132.0f, 68.15f)
                lineTo(132.0f, 36.09f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 219.91f, 124.0f)
                close()
                moveTo(124.0f, 124.0f)
                lineTo(76.17f, 124.0f)
                arcTo(52.05f, 52.05f, 0.0f, false, true, 124.0f, 76.17f)
                close()
                moveTo(124.0f, 132.0f)
                verticalLineToRelative(47.83f)
                arcTo(52.05f, 52.05f, 0.0f, false, true, 76.17f, 132.0f)
                close()
                moveTo(132.0f, 132.0f)
                horizontalLineToRelative(47.83f)
                arcTo(52.05f, 52.05f, 0.0f, false, true, 132.0f, 179.83f)
                close()
                moveTo(132.0f, 124.0f)
                lineTo(132.0f, 76.17f)
                arcTo(52.05f, 52.05f, 0.0f, false, true, 179.83f, 124.0f)
                close()
                moveTo(124.0f, 36.09f)
                lineTo(124.0f, 68.15f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 68.15f, 124.0f)
                lineTo(36.09f, 124.0f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 124.0f, 36.09f)
                close()
                moveTo(36.09f, 132.0f)
                lineTo(68.15f, 132.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 124.0f, 187.85f)
                verticalLineToRelative(32.06f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 36.09f, 132.0f)
                close()
                moveTo(132.0f, 219.91f)
                lineTo(132.0f, 187.85f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 187.85f, 132.0f)
                horizontalLineToRelative(32.06f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 132.0f, 219.91f)
                close()
            }
        }
        .build()
        return `_chart-polar-thin`!!
    }

private var `_chart-polar-thin`: ImageVector? = null
