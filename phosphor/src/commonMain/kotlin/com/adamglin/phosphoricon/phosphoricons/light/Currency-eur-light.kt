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

public val LightGroup.`Currency-eur-light`: ImageVector
    get() {
        if (`_currency-eur-light` != null) {
            return `_currency-eur-light`!!
        }
        `_currency-eur-light` = Builder(name = "Currency-eur-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.47f, 193.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.47f, 8.48f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 58.25f, 150.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(58.0f)
                verticalLineTo(118.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(58.25f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 188.0f, 53.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.0f, 9.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 70.29f, 106.0f)
                horizontalLineTo(136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(70.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(70.29f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 180.0f, 193.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 188.47f, 193.66f)
                close()
            }
        }
        .build()
        return `_currency-eur-light`!!
    }

private var `_currency-eur-light`: ImageVector? = null
