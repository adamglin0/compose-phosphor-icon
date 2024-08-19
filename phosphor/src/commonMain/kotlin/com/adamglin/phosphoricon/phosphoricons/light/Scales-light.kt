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

public val LightGroup.`Scales-light`: ImageVector
    get() {
        if (`_scales-light` != null) {
            return `_scales-light`!!
        }
        `_scales-light` = Builder(name = "Scales-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.57f, 133.77f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.86f, -3.63f)
                lineTo(134.0f, 64.52f)
                lineTo(134.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 67.19f)
                lineToRelative(-67.3f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.27f, 3.63f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(-32.0f, 80.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 18.0f, 168.0f)
                curveToRelative(0.0f, 21.86f, 23.31f, 30.0f, 38.0f, 30.0f)
                reflectiveCurveToRelative(38.0f, -8.14f, 38.0f, -30.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -0.43f, -2.23f)
                lineTo(64.19f, 92.33f)
                lineTo(122.0f, 79.48f)
                lineTo(122.0f, 210.0f)
                lineTo(104.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 76.81f)
                lineToRelative(56.21f, -12.49f)
                lineToRelative(-27.78f, 69.45f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 162.0f, 136.0f)
                curveToRelative(0.0f, 21.86f, 23.31f, 30.0f, 38.0f, 30.0f)
                reflectiveCurveToRelative(38.0f, -8.14f, 38.0f, -30.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 237.57f, 133.77f)
                close()
                moveTo(56.0f, 186.0f)
                arcToRelative(36.89f, 36.89f, 0.0f, false, true, -17.48f, -4.56f)
                curveToRelative(-5.37f, -3.13f, -8.15f, -7.18f, -8.49f, -12.37f)
                lineToRelative(26.0f, -64.91f)
                lineToRelative(26.0f, 64.91f)
                curveTo(81.06f, 182.85f, 62.58f, 186.0f, 56.0f, 186.0f)
                close()
                moveTo(200.0f, 154.0f)
                arcToRelative(36.89f, 36.89f, 0.0f, false, true, -17.48f, -4.56f)
                curveToRelative(-5.37f, -3.13f, -8.15f, -7.18f, -8.49f, -12.37f)
                lineToRelative(26.0f, -64.91f)
                lineToRelative(26.0f, 64.91f)
                curveTo(225.06f, 150.85f, 206.58f, 154.0f, 200.0f, 154.0f)
                close()
            }
        }
        .build()
        return `_scales-light`!!
    }

private var `_scales-light`: ImageVector? = null
