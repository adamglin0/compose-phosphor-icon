package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Egg-fill`: ImageVector
    get() {
        if (`_egg-fill` != null) {
            return `_egg-fill`!!
        }
        `_egg-fill` = Builder(name = "Egg-fill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 152.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -176.0f, 0.0f)
                curveToRelative(0.0f, -30.77f, 10.7f, -64.46f, 29.34f, -92.44f)
                curveTo(87.53f, 32.29f, 109.46f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveToRelative(40.47f, 16.29f, 58.66f, 43.56f)
                curveTo(205.3f, 87.54f, 216.0f, 121.23f, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_egg-fill`!!
    }

private var `_egg-fill`: ImageVector? = null
