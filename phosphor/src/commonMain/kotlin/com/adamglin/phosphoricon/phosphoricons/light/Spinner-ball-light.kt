package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Spinner-ball-light`: ImageVector
    get() {
        if (`_spinner-ball-light` != null) {
            return `_spinner-ball-light`!!
        }
        `_spinner-ball-light` = Builder(name = "Spinner-ball-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(217.89f, 123.44f)
                curveToRelative(-31.0f, 22.37f, -53.66f, 15.36f, -77.93f, 3.75f)
                curveToRelative(21.43f, -14.75f, 42.27f, -33.21f, 41.51f, -71.54f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 217.89f, 123.44f)
                close()
                moveTo(169.0f, 47.89f)
                curveToRelative(3.84f, 38.0f, -13.53f, 54.13f, -35.71f, 69.34f)
                curveTo(131.22f, 91.29f, 125.67f, 64.0f, 92.06f, 45.5f)
                arcTo(89.88f, 89.88f, 0.0f, false, true, 169.0f, 47.89f)
                close()
                moveTo(79.14f, 52.45f)
                curveTo(114.0f, 68.15f, 119.23f, 91.23f, 121.32f, 118.0f)
                curveToRelative(-23.5f, -11.18f, -49.92f, -20.0f, -82.75f, -0.17f)
                arcTo(90.12f, 90.12f, 0.0f, false, true, 79.14f, 52.45f)
                close()
                moveTo(38.14f, 132.56f)
                curveToRelative(31.05f, -22.37f, 53.66f, -15.36f, 77.93f, -3.75f)
                curveTo(94.61f, 143.56f, 73.77f, 162.0f, 74.53f, 200.35f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 38.11f, 132.56f)
                close()
                moveTo(87.0f, 208.11f)
                curveToRelative(-3.84f, -38.0f, 13.53f, -54.13f, 35.71f, -69.34f)
                curveToRelative(2.06f, 25.94f, 7.61f, 53.24f, 41.22f, 71.73f)
                arcTo(89.88f, 89.88f, 0.0f, false, true, 87.0f, 208.11f)
                close()
                moveTo(176.85f, 203.55f)
                curveTo(142.0f, 187.85f, 136.77f, 164.77f, 134.68f, 138.0f)
                curveToRelative(13.36f, 6.36f, 27.67f, 12.0f, 43.56f, 12.0f)
                curveToRelative(12.06f, 0.0f, 25.0f, -3.23f, 39.19f, -11.79f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 176.86f, 203.55f)
                close()
            }
        }
        .build()
        return `_spinner-ball-light`!!
    }

private var `_spinner-ball-light`: ImageVector? = null
