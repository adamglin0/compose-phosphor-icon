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

public val LightGroup.`Bell-light`: ImageVector
    get() {
        if (`_bell-light` != null) {
            return `_bell-light`!!
        }
        `_bell-light` = Builder(name = "Bell-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.07f, 176.94f)
                curveTo(214.41f, 167.2f, 206.0f, 139.73f, 206.0f, 104.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -156.0f, 0.0f)
                curveToRelative(0.0f, 35.74f, -8.42f, 63.2f, -14.08f, 72.94f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 198.0f)
                lineTo(90.48f, 198.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f)
                lineTo(208.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.06f, -21.06f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -25.29f, -20.0f)
                horizontalLineToRelative(50.58f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(209.71f, 185.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, 1.0f)
                lineTo(48.0f, 186.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveTo(53.87f, 170.0f, 62.0f, 139.69f, 62.0f, 104.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 132.0f, 0.0f)
                curveToRelative(0.0f, 35.68f, 8.14f, 65.95f, 15.71f, 79.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.71f, 185.0f)
                close()
            }
        }
        .build()
        return `_bell-light`!!
    }

private var `_bell-light`: ImageVector? = null
