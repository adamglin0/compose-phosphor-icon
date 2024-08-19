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

public val ThinGroup.`Palette-thin`: ImageVector
    get() {
        if (`_palette-thin` != null) {
            return `_palette-thin`!!
        }
        `_palette-thin` = Builder(name = "Palette-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 56.74f)
                arcTo(99.31f, 99.31f, 0.0f, false, false, 128.0f, 28.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 28.0f, 128.0f)
                curveToRelative(0.0f, 41.22f, 25.55f, 75.85f, 66.69f, 90.38f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, false, 9.42f, 1.63f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 132.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(46.21f)
                arcToRelative(27.84f, 27.84f, 0.0f, false, false, 27.3f, -21.76f)
                arcToRelative(100.37f, 100.37f, 0.0f, false, false, 2.49f, -23.1f)
                arcTo(99.26f, 99.26f, 0.0f, false, false, 198.0f, 56.74f)
                close()
                moveTo(217.74f, 148.46f)
                arcTo(19.89f, 19.89f, 0.0f, false, true, 198.21f, 164.0f)
                lineTo(152.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -26.64f, 18.83f)
                curveTo(59.51f, 197.46f, 36.0f, 165.72f, 36.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 91.05f, -92.0f)
                lineTo(128.0f, 36.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 89.72f, 112.46f)
                close()
                moveTo(136.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 76.0f)
                close()
                moveTo(92.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 100.0f)
                close()
                moveTo(92.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 156.0f)
                close()
                moveTo(180.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_palette-thin`!!
    }

private var `_palette-thin`: ImageVector? = null
