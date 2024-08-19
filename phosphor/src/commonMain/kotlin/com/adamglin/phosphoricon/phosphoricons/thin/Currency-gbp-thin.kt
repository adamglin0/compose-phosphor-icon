package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Currency-gbp-thin`: ImageVector
    get() {
        if (`_currency-gbp-thin` != null) {
            return `_currency-gbp-thin`!!
        }
        `_currency-gbp-thin` = Builder(name = "Currency-gbp-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(132.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(84.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 78.53f, -37.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.09f, 6.17f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 100.0f, 84.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(100.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -16.0f, 32.0f)
                horizontalLineTo(184.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_currency-gbp-thin`!!
    }

private var `_currency-gbp-thin`: ImageVector? = null
