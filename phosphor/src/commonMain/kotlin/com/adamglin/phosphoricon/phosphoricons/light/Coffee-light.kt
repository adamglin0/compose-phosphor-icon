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

public val LightGroup.`Coffee-light`: ImageVector
    get() {
        if (`_coffee-light` != null) {
            return `_coffee-light`!!
        }
        `_coffee-light` = Builder(name = "Coffee-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.0f, 56.0f)
                lineTo(82.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(94.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(120.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(126.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(114.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 62.0f)
                close()
                moveTo(152.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(158.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(146.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 62.0f)
                close()
                moveTo(246.0f, 120.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -36.94f, 38.0f)
                arcToRelative(94.55f, 94.55f, 0.0f, false, true, -31.13f, 44.0f)
                lineTo(208.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(32.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(62.07f, 210.0f)
                arcTo(94.34f, 94.34f, 0.0f, false, true, 26.0f, 136.0f)
                lineTo(26.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(208.0f, 82.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 120.0f)
                close()
                moveTo(202.0f, 136.0f)
                lineTo(202.0f, 94.0f)
                lineTo(38.0f, 94.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(82.27f, 82.27f, 0.0f, false, false, 46.67f, 74.0f)
                horizontalLineToRelative(70.66f)
                arcTo(82.27f, 82.27f, 0.0f, false, false, 202.0f, 136.0f)
                close()
                moveTo(234.0f, 120.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -20.0f, -25.29f)
                lineTo(214.0f, 136.0f)
                arcToRelative(93.18f, 93.18f, 0.0f, false, true, -1.69f, 17.64f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 234.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_coffee-light`!!
    }

private var `_coffee-light`: ImageVector? = null
