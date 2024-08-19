package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Shopping-cart-duotone`: ImageVector
    get() {
        if (`_shopping-cart-duotone` != null) {
            return `_shopping-cart-duotone`!!
        }
        `_shopping-cart-duotone` = Builder(name = "Shopping-cart-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineToRelative(-12.16f, 66.86f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.1f, 144.0f)
                horizontalLineTo(70.55f)
                lineTo(56.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.14f, 58.87f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 56.0f)
                lineTo(62.68f, 56.0f)
                lineTo(56.6f, 22.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.73f, 16.0f)
                lineTo(24.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(18.0f)
                lineTo(67.56f, 172.29f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 5.33f, 11.27f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 44.4f, 8.44f)
                horizontalLineToRelative(45.42f)
                arcTo(27.75f, 27.75f, 0.0f, false, false, 160.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, -28.0f)
                lineTo(91.17f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.87f, -6.57f)
                lineTo(80.13f, 152.0f)
                horizontalLineToRelative(116.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.61f, -19.71f)
                lineToRelative(12.16f, -66.86f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 230.14f, 58.87f)
                close()
                moveTo(104.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 204.0f)
                close()
                moveTo(200.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
                moveTo(204.0f, 129.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.1f, 136.0f)
                lineTo(77.22f, 136.0f)
                lineTo(65.59f, 72.0f)
                lineTo(214.41f, 72.0f)
                close()
            }
        }
        .build()
        return `_shopping-cart-duotone`!!
    }

private var `_shopping-cart-duotone`: ImageVector? = null
