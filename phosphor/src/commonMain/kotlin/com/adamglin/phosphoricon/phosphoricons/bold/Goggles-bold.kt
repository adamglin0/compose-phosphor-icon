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

public val BoldGroup.`Goggles-bold`: ImageVector
    get() {
        if (`_goggles-bold` != null) {
            return `_goggles-bold`!!
        }
        `_goggles-bold` = Builder(name = "Goggles-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 60.0f)
                lineTo(76.0f, 60.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 0.0f, 136.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 13.74f, 21.69f)
                curveToRelative(3.15f, 8.71f, 10.51f, 16.75f, 21.52f, 23.27f)
                curveToRelative(11.52f, 6.81f, 25.6f, 11.0f, 36.74f, 11.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, false, 42.32f, -32.0f)
                horizontalLineToRelative(27.36f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 184.0f, 196.0f)
                curveToRelative(18.53f, 0.0f, 50.62f, -12.81f, 58.31f, -34.33f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 256.0f, 140.0f)
                verticalLineToRelative(-4.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 180.0f, 60.0f)
                close()
                moveTo(76.0f, 84.0f)
                lineTo(180.0f, 84.0f)
                arcToRelative(52.07f, 52.07f, 0.0f, false, true, 51.13f, 42.6f)
                arcTo(65.0f, 65.0f, 0.0f, false, false, 220.74f, 119.0f)
                curveToRelative(-11.52f, -6.81f, -25.6f, -11.0f, -36.74f, -11.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, false, -42.32f, 32.0f)
                lineTo(114.32f, 140.0f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 72.0f, 108.0f)
                curveToRelative(-13.4f, 0.0f, -33.9f, 6.71f, -47.13f, 18.56f)
                arcTo(52.08f, 52.08f, 0.0f, false, true, 76.0f, 84.0f)
                close()
                moveTo(72.0f, 172.0f)
                curveToRelative(-14.13f, 0.0f, -36.0f, -12.15f, -36.0f, -20.0f)
                curveToRelative(0.0f, -2.74f, 3.55f, -7.61f, 11.48f, -12.3f)
                curveToRelative(9.0f, -5.32f, 18.8f, -7.7f, 24.52f, -7.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
                moveTo(208.52f, 164.3f)
                curveToRelative(-9.0f, 5.32f, -18.8f, 7.7f, -24.52f, 7.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                curveToRelative(14.13f, 0.0f, 36.0f, 12.15f, 36.0f, 20.0f)
                curveTo(220.0f, 154.74f, 216.45f, 159.61f, 208.52f, 164.3f)
                close()
            }
        }
        .build()
        return `_goggles-bold`!!
    }

private var `_goggles-bold`: ImageVector? = null
