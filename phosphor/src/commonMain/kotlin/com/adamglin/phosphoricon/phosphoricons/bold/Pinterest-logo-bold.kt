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

public val BoldGroup.`Pinterest-logo-bold`: ImageVector
    get() {
        if (`_pinterest-logo-bold` != null) {
            return `_pinterest-logo-bold`!!
        }
        `_pinterest-logo-bold` = Builder(name = "Pinterest-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 112.0f)
                curveToRelative(0.0f, 23.6f, -8.29f, 45.23f, -23.35f, 60.88f)
                curveTo(190.52f, 187.57f, 171.33f, 196.0f, 152.0f, 196.0f)
                curveToRelative(-15.45f, 0.0f, -26.78f, -4.18f, -34.89f, -9.31f)
                lineToRelative(-9.43f, 40.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.36f, -5.5f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.36f, 5.5f)
                lineToRelative(-16.45f, 69.93f)
                curveTo(126.72f, 164.86f, 135.16f, 172.0f, 152.0f, 172.0f)
                curveToRelative(25.56f, 0.0f, 52.0f, -22.45f, 52.0f, -60.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 77.09f, 146.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.77f, 12.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 228.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_pinterest-logo-bold`!!
    }

private var `_pinterest-logo-bold`: ImageVector? = null
