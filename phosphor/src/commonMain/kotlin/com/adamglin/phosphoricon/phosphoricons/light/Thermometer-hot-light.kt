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

public val LightGroup.`Thermometer-hot-light`: ImageVector
    get() {
        if (`_thermometer-hot-light` != null) {
            return `_thermometer-hot-light`!!
        }
        `_thermometer-hot-light` = Builder(name = "Thermometer-hot-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 154.6f)
                lineTo(126.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(114.0f, 154.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(120.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 120.0f, 202.0f)
                close()
                moveTo(158.0f, 135.0f)
                lineTo(158.0f, 48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineToRelative(87.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, false, 76.0f, 0.0f)
                close()
                moveTo(120.0f, 234.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -28.57f, -91.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 138.0f)
                lineTo(94.0f, 48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.57f, 4.92f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 120.0f, 234.0f)
                close()
                moveTo(179.0f, 79.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.75f, -8.3f)
                curveToRelative(14.14f, -9.21f, 24.95f, -4.61f, 33.63f, -0.9f)
                curveToRelative(7.9f, 3.37f, 13.6f, 5.8f, 22.37f, 0.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.55f, 10.05f)
                curveToRelative(-6.12f, 4.0f, -11.62f, 5.39f, -16.59f, 5.39f)
                curveToRelative(-6.51f, 0.0f, -12.11f, -2.39f, -17.0f, -4.49f)
                curveToRelative(-7.89f, -3.37f, -13.59f, -5.8f, -22.37f, -0.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 179.0f, 79.68f)
                close()
                moveTo(245.0f, 104.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.76f, 8.3f)
                curveToRelative(-6.12f, 4.0f, -11.62f, 5.39f, -16.59f, 5.39f)
                curveToRelative(-6.51f, 0.0f, -12.11f, -2.39f, -17.0f, -4.49f)
                curveToRelative(-7.89f, -3.37f, -13.59f, -5.8f, -22.37f, -0.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.55f, -10.05f)
                curveToRelative(14.14f, -9.21f, 24.95f, -4.6f, 33.63f, -0.9f)
                curveToRelative(7.9f, 3.37f, 13.6f, 5.8f, 22.37f, 0.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 245.0f, 104.32f)
                close()
            }
        }
        .build()
        return `_thermometer-hot-light`!!
    }

private var `_thermometer-hot-light`: ImageVector? = null
