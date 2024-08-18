package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Brackets-round`: ImageVector
    get() {
        if (`_brackets-round` != null) {
            return `_brackets-round`!!
        }
        `_brackets-round` = Builder(name = "Brackets-round", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 128.0f)
                curveToRelative(0.0f, 58.29f, 34.67f, 80.25f, 36.15f, 81.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.27f, 13.7f)
                curveTo(66.09f, 221.78f, 24.0f, 195.75f, 24.0f, 128.0f)
                reflectiveCurveTo(66.09f, 34.22f, 67.88f, 33.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.26f, 13.7f)
                curveTo(74.54f, 47.83f, 40.0f, 69.82f, 40.0f, 128.0f)
                close()
                moveTo(188.12f, 33.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.27f, 13.7f)
                curveTo(181.33f, 47.75f, 216.0f, 69.71f, 216.0f, 128.0f)
                reflectiveCurveToRelative(-34.67f, 80.25f, -36.12f, 81.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.24f, 13.72f)
                curveTo(189.91f, 221.78f, 232.0f, 195.75f, 232.0f, 128.0f)
                reflectiveCurveTo(189.91f, 34.22f, 188.12f, 33.14f)
                close()
            }
        }
        .build()
        return `_brackets-round`!!
    }

private var `_brackets-round`: ImageVector? = null
