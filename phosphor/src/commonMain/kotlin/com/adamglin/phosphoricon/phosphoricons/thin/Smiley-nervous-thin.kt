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

public val ThinGroup.`Smiley-nervous-thin`: ImageVector
    get() {
        if (`_smiley-nervous-thin` != null) {
            return `_smiley-nervous-thin`!!
        }
        `_smiley-nervous-thin` = Builder(name = "Smiley-nervous-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 108.0f)
                close()
                moveTo(156.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 108.0f)
                close()
                moveTo(180.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                curveToRelative(-8.0f, 0.0f, -12.0f, -5.32f, -15.2f, -9.6f)
                curveToRelative(-3.07f, -4.09f, -5.0f, -6.4f, -8.8f, -6.4f)
                reflectiveCurveToRelative(-5.73f, 2.31f, -8.8f, 6.4f)
                curveTo(140.0f, 166.68f, 136.0f, 172.0f, 128.0f, 172.0f)
                reflectiveCurveToRelative(-12.0f, -5.32f, -15.2f, -9.6f)
                curveToRelative(-3.07f, -4.09f, -5.0f, -6.4f, -8.8f, -6.4f)
                reflectiveCurveToRelative(-5.73f, 2.31f, -8.8f, 6.4f)
                curveTo(92.0f, 166.68f, 88.0f, 172.0f, 80.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                curveToRelative(3.81f, 0.0f, 5.73f, -2.31f, 8.8f, -6.4f)
                curveTo(92.0f, 153.32f, 96.0f, 148.0f, 104.0f, 148.0f)
                reflectiveCurveToRelative(12.0f, 5.32f, 15.2f, 9.6f)
                curveToRelative(3.07f, 4.09f, 5.0f, 6.4f, 8.8f, 6.4f)
                reflectiveCurveToRelative(5.73f, -2.31f, 8.8f, -6.4f)
                curveTo(140.0f, 153.32f, 144.0f, 148.0f, 152.0f, 148.0f)
                reflectiveCurveToRelative(12.0f, 5.32f, 15.2f, 9.6f)
                curveToRelative(3.07f, 4.09f, 5.0f, 6.4f, 8.8f, 6.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_smiley-nervous-thin`!!
    }

private var `_smiley-nervous-thin`: ImageVector? = null
