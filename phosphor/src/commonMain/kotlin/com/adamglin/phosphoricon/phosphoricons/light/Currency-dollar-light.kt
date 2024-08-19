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

public val LightGroup.`Currency-dollar-light`: ImageVector
    get() {
        if (`_currency-dollar-light` != null) {
            return `_currency-dollar-light`!!
        }
        `_currency-dollar-light` = Builder(name = "Currency-dollar-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 122.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 54.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, false, -46.0f, -46.0f)
                lineTo(134.0f, 42.0f)
                lineTo(134.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 42.0f)
                lineTo(112.0f, 42.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, 92.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(68.0f)
                lineTo(104.0f, 202.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, false, 46.0f, 46.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 214.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                close()
                moveTo(112.0f, 122.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, -68.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(68.0f)
                close()
                moveTo(152.0f, 202.0f)
                lineTo(134.0f, 202.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return `_currency-dollar-light`!!
    }

private var `_currency-dollar-light`: ImageVector? = null
