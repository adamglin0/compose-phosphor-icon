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

public val ThinGroup.`Smiley-thin`: ImageVector
    get() {
        if (`_smiley-thin` != null) {
            return `_smiley-thin`!!
        }
        `_smiley-thin` = Builder(name = "Smiley-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.46f, 154.0f)
                curveToRelative(-9.55f, 16.52f, -25.39f, 26.0f, -43.46f, 26.0f)
                reflectiveCurveToRelative(-33.91f, -9.48f, -43.46f, -26.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.92f, -4.0f)
                curveToRelative(8.21f, 14.19f, 21.19f, 22.0f, 36.54f, 22.0f)
                reflectiveCurveToRelative(28.33f, -7.81f, 36.54f, -22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.92f, 4.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, -92.0f, 92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f)
                close()
                moveTo(92.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 116.0f)
                close()
                moveTo(164.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_smiley-thin`!!
    }

private var `_smiley-thin`: ImageVector? = null
