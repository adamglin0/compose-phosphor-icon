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

public val ThinGroup.`Currency-eur-thin`: ImageVector
    get() {
        if (`_currency-eur-thin` != null) {
            return `_currency-eur-thin`!!
        }
        `_currency-eur-thin` = Builder(name = "Currency-eur-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.0f, 195.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.31f, 5.65f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 60.11f, 148.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(116.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(60.11f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 186.67f, 55.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.34f, 6.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 68.13f, 108.0f)
                horizontalLineTo(136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(68.13f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 113.2f, 46.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 187.0f, 195.0f)
                close()
            }
        }
        .build()
        return `_currency-eur-thin`!!
    }

private var `_currency-eur-thin`: ImageVector? = null
