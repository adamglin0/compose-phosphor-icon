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

public val BoldGroup.`Brackets-round-bold`: ImageVector
    get() {
        if (`_brackets-round-bold` != null) {
            return `_brackets-round-bold`!!
        }
        `_brackets-round-bold` = Builder(name = "Brackets-round-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.33f, 222.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.5f, 4.09f)
                curveTo(64.0f, 225.16f, 20.0f, 198.0f, 20.0f, 128.0f)
                reflectiveCurveTo(64.0f, 30.84f, 65.83f, 29.72f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 78.24f, 50.25f)
                curveTo(76.71f, 51.21f, 44.0f, 72.31f, 44.0f, 128.0f)
                reflectiveCurveToRelative(32.85f, 76.88f, 34.25f, 77.75f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 82.33f, 222.19f)
                close()
                moveTo(190.17f, 29.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.42f, 20.53f)
                curveTo(179.15f, 51.12f, 212.0f, 72.19f, 212.0f, 128.0f)
                reflectiveCurveToRelative(-32.85f, 76.88f, -34.17f, 77.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.34f, 20.58f)
                curveTo(192.0f, 225.16f, 236.0f, 198.0f, 236.0f, 128.0f)
                reflectiveCurveTo(192.0f, 30.84f, 190.17f, 29.72f)
                close()
            }
        }
        .build()
        return `_brackets-round-bold`!!
    }

private var `_brackets-round-bold`: ImageVector? = null
