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

public val BoldGroup.`Patreon-logo-bold`: ImageVector
    get() {
        if (`_patreon-logo-bold` != null) {
            return `_patreon-logo-bold`!!
        }
        `_patreon-logo-bold` = Builder(name = "Patreon-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.88f, 28.29f)
                curveToRelative(-19.47f, -8.0f, -42.59f, -10.29f, -65.11f, -6.54f)
                curveToRelative(-24.28f, 4.0f, -45.33f, 14.53f, -60.88f, 30.34f)
                curveTo(25.47f, 90.15f, 33.05f, 167.56f, 50.0f, 207.88f)
                curveTo(56.87f, 224.36f, 69.0f, 244.0f, 87.51f, 244.0f)
                curveToRelative(25.38f, 0.0f, 36.72f, -22.14f, 46.73f, -41.68f)
                curveToRelative(6.73f, -13.14f, 13.69f, -26.74f, 24.23f, -33.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(5.49f, -3.72f, 13.22f, -6.7f, 21.41f, -9.86f)
                curveToRelative(23.69f, -9.13f, 56.12f, -21.64f, 56.12f, -65.4f)
                curveTo(236.0f, 64.19f, 218.82f, 40.54f, 188.88f, 28.29f)
                close()
                moveTo(171.24f, 136.18f)
                curveToRelative(-9.08f, 3.5f, -18.48f, 7.13f, -26.24f, 12.39f)
                curveToRelative(-15.63f, 10.6f, -24.39f, 27.71f, -32.13f, 42.81f)
                curveTo(103.79f, 209.13f, 97.7f, 220.0f, 87.51f, 220.0f)
                curveToRelative(-1.28f, 0.0f, -8.0f, -3.81f, -15.41f, -21.4f)
                curveTo(57.48f, 163.75f, 51.89f, 97.51f, 80.0f, 68.91f)
                curveToRelative(11.79f, -12.0f, 28.73f, -20.34f, 47.69f, -23.49f)
                arcToRelative(104.37f, 104.37f, 0.0f, false, true, 17.0f, -1.39f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 35.08f, 6.47f)
                curveToRelative(12.0f, 4.92f, 32.21f, 17.0f, 32.21f, 42.67f)
                curveTo(212.0f, 119.14f, 196.51f, 126.43f, 171.24f, 136.18f)
                close()
            }
        }
        .build()
        return `_patreon-logo-bold`!!
    }

private var `_patreon-logo-bold`: ImageVector? = null
