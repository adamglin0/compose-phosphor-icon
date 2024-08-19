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

public val ThinGroup.`Currency-dollar-thin`: ImageVector
    get() {
        if (`_currency-dollar-thin` != null) {
            return `_currency-dollar-thin`!!
        }
        `_currency-dollar-thin` = Builder(name = "Currency-dollar-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 124.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                lineTo(132.0f, 44.0f)
                lineTo(132.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 44.0f)
                lineTo(112.0f, 44.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, 88.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(72.0f)
                lineTo(104.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 212.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                close()
                moveTo(112.0f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(72.0f)
                close()
                moveTo(152.0f, 204.0f)
                lineTo(132.0f, 204.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_currency-dollar-thin`!!
    }

private var `_currency-dollar-thin`: ImageVector? = null
