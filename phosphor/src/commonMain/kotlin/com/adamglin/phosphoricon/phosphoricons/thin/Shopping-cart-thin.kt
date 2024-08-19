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

public val ThinGroup.`Shopping-cart-thin`: ImageVector
    get() {
        if (`_shopping-cart-thin` != null) {
            return `_shopping-cart-thin`!!
        }
        `_shopping-cart-thin` = Builder(name = "Shopping-cart-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.07f, 61.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 60.0f)
                lineTo(59.34f, 60.0f)
                lineTo(52.66f, 23.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.73f, 20.0f)
                lineTo(24.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(45.39f, 28.0f)
                lineToRelative(6.69f, 36.8f)
                horizontalLineToRelative(0.0f)
                lineTo(71.49f, 171.58f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 79.0f, 183.85f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 109.87f, 188.0f)
                horizontalLineToRelative(60.26f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 188.0f, 180.0f)
                lineTo(91.17f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.8f, -9.85f)
                lineToRelative(-4.0f, -22.15f)
                lineTo(196.1f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.68f, -16.42f)
                lineToRelative(12.16f, -66.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 227.07f, 61.44f)
                close()
                moveTo(108.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 204.0f)
                close()
                moveTo(204.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 204.0f, 204.0f)
                close()
                moveTo(207.91f, 130.15f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.1f, 140.0f)
                lineTo(73.88f, 140.0f)
                lineTo(60.79f, 68.0f)
                lineTo(219.21f, 68.0f)
                close()
            }
        }
        .build()
        return `_shopping-cart-thin`!!
    }

private var `_shopping-cart-thin`: ImageVector? = null
