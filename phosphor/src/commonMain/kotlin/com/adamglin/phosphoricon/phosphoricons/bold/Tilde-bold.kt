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

public val BoldGroup.`Tilde-bold`: ImageVector
    get() {
        if (`_tilde-bold` != null) {
            return `_tilde-bold`!!
        }
        `_tilde-bold` = Builder(name = "Tilde-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.35f, 133.1f)
                curveToRelative(-15.22f, 18.93f, -30.43f, 29.0f, -46.5f, 30.65f)
                arcTo(46.71f, 46.71f, 0.0f, false, true, 174.0f, 164.0f)
                curveToRelative(-20.81f, 0.0f, -38.16f, -14.13f, -53.59f, -26.7f)
                curveToRelative(-14.24f, -11.6f, -27.68f, -22.54f, -40.75f, -21.18f)
                curveToRelative(-9.26f, 1.0f, -19.46f, 8.32f, -30.32f, 21.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.7f, -15.0f)
                curveTo(45.87f, 104.0f, 61.08f, 94.0f, 77.15f, 92.25f)
                curveToRelative(23.0f, -2.42f, 41.82f, 12.92f, 58.43f, 26.45f)
                curveToRelative(14.24f, 11.6f, 27.68f, 22.54f, 40.75f, 21.18f)
                curveToRelative(9.26f, -1.0f, 19.46f, -8.32f, 30.32f, -21.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 18.7f, 15.0f)
                close()
            }
        }
        .build()
        return `_tilde-bold`!!
    }

private var `_tilde-bold`: ImageVector? = null
