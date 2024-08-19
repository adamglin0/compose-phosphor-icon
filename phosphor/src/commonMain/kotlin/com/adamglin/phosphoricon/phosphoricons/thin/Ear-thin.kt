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

public val ThinGroup.`Ear-thin`: ImageVector
    get() {
        if (`_ear-thin` != null) {
            return `_ear-thin`!!
        }
        `_ear-thin` = Builder(name = "Ear-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                curveToRelative(0.0f, 28.4f, 9.55f, 37.61f, 18.79f, 46.52f)
                curveTo(79.25f, 158.67f, 88.0f, 167.11f, 88.0f, 188.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                curveToRelative(11.37f, 0.0f, 20.83f, -4.76f, 28.92f, -14.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.16f, 5.1f)
                curveTo(153.52f, 230.13f, 141.71f, 236.0f, 128.0f, 236.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                curveToRelative(0.0f, -17.49f, -6.84f, -24.09f, -14.76f, -31.72f)
                curveTo(55.28f, 146.68f, 44.0f, 135.79f, 44.0f, 104.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f)
                close()
                moveTo(175.86f, 164.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 170.4f, 166.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.4f, -6.0f)
                curveToRelative(0.0f, -10.67f, 5.44f, -17.92f, 11.2f, -25.6f)
                curveTo(165.49f, 126.0f, 172.0f, 117.33f, 172.0f, 104.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                curveToRelative(0.0f, 10.67f, -5.44f, 17.92f, -11.2f, 25.6f)
                curveTo(146.51f, 138.0f, 140.0f, 146.67f, 140.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 37.32f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 175.86f, 164.54f)
                close()
            }
        }
        .build()
        return `_ear-thin`!!
    }

private var `_ear-thin`: ImageVector? = null
