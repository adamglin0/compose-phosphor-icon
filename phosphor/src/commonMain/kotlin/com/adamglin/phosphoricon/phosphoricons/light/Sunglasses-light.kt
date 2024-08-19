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

public val LightGroup.`Sunglasses-light`: ImageVector
    get() {
        if (`_sunglasses-light` != null) {
            return `_sunglasses-light`!!
        }
        `_sunglasses-light` = Builder(name = "Sunglasses-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(58.0f)
                lineTo(38.0f, 130.0f)
                lineTo(38.0f, 72.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 26.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 0.0f)
                lineTo(110.0f, 142.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 0.0f)
                lineTo(230.0f, 72.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(38.0f, 164.0f)
                lineTo(38.0f, 142.48f)
                lineTo(84.53f, 189.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 38.0f, 164.0f)
                close()
                moveTo(98.0f, 164.0f)
                arcToRelative(29.83f, 29.83f, 0.0f, false, true, -5.0f, 16.53f)
                lineTo(54.48f, 142.0f)
                lineTo(98.0f, 142.0f)
                close()
                moveTo(158.0f, 164.0f)
                lineTo(158.0f, 142.48f)
                lineTo(204.53f, 189.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 158.0f, 164.0f)
                close()
                moveTo(213.0f, 180.53f)
                lineTo(174.48f, 142.0f)
                lineTo(218.0f, 142.0f)
                verticalLineToRelative(22.0f)
                arcTo(29.83f, 29.83f, 0.0f, false, true, 213.0f, 180.53f)
                close()
            }
        }
        .build()
        return `_sunglasses-light`!!
    }

private var `_sunglasses-light`: ImageVector? = null
