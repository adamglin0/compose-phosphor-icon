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

public val ThinGroup.`List-star-thin`: ImageVector
    get() {
        if (`_list-star-thin` != null) {
            return `_list-star-thin`!!
        }
        `_list-star-thin` = Builder(name = "List-star-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(40.0f, 132.0f)
                lineTo(96.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(112.0f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(234.55f, 140.7f)
                lineTo(210.09f, 160.89f)
                lineTo(217.55f, 191.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 4.17f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -2.4f, 0.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.55f)
                lineTo(184.0f, 179.18f)
                lineToRelative(-27.64f, 16.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.91f, -4.41f)
                lineToRelative(7.46f, -30.15f)
                lineTo(133.45f, 140.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, -7.08f)
                lineToRelative(32.24f, -2.49f)
                lineToRelative(12.4f, -28.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.34f, 0.0f)
                lineToRelative(12.4f, 28.71f)
                lineToRelative(32.24f, 2.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, 7.08f)
                close()
                moveTo(221.81f, 140.84f)
                lineTo(197.0f, 138.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.36f, -2.4f)
                lineTo(184.0f, 114.1f)
                lineToRelative(-9.68f, 22.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.36f, 2.4f)
                lineToRelative(-24.77f, 1.92f)
                lineTo(165.0f, 156.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.33f, 4.0f)
                lineToRelative(-5.78f, 23.36f)
                lineTo(182.0f, 171.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.06f, 0.0f)
                lineToRelative(21.47f, 12.64f)
                lineToRelative(-5.78f, -23.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.33f, -4.0f)
                close()
            }
        }
        .build()
        return `_list-star-thin`!!
    }

private var `_list-star-thin`: ImageVector? = null
