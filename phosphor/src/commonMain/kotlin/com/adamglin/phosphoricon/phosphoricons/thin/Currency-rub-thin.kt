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

public val ThinGroup.`Currency-rub-thin`: ImageVector
    get() {
        if (`_currency-rub-thin` != null) {
            return `_currency-rub-thin`!!
        }
        `_currency-rub-thin` = Builder(name = "Currency-rub-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 36.0f)
                lineTo(88.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(84.0f, 140.0f)
                lineTo(56.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(84.0f, 148.0f)
                verticalLineToRelative(24.0f)
                lineTo(56.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(84.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(92.0f, 180.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(92.0f, 172.0f)
                lineTo(92.0f, 148.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
                moveTo(148.0f, 140.0f)
                lineTo(92.0f, 140.0f)
                lineTo(92.0f, 44.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_currency-rub-thin`!!
    }

private var `_currency-rub-thin`: ImageVector? = null
