package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Smiley-bold`: ImageVector
    get() {
        if (`_smiley-bold` != null) {
            return `_smiley-bold`!!
        }
        `_smiley-bold` = Builder(name = "Smiley-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.39f, 158.0f)
                curveToRelative(-11.0f, 19.06f, -29.39f, 30.0f, -50.39f, 30.0f)
                reflectiveCurveToRelative(-39.36f, -10.93f, -50.39f, -30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.78f, -12.0f)
                curveToRelative(3.89f, 6.73f, 12.91f, 18.0f, 29.61f, 18.0f)
                reflectiveCurveToRelative(25.72f, -11.28f, 29.61f, -18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.78f, 12.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
                moveTo(92.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 124.0f)
                close()
                moveTo(164.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 92.0f)
                close()
            }
        }
        .build()
        return `_smiley-bold`!!
    }

private var `_smiley-bold`: ImageVector? = null
