package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Currency-btc-fill`: ImageVector
    get() {
        if (`_currency-btc-fill` != null) {
            return `_currency-btc-fill`!!
        }
        `_currency-btc-fill` = Builder(name = "Currency-btc-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(112.0f, 168.0f)
                lineTo(112.0f, 136.0f)
                horizontalLineToRelative(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 152.0f)
                close()
                moveTo(240.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 136.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 240.0f, 128.0f)
                close()
                moveTo(192.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -15.51f, -27.42f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 73.0f)
                lineTo(160.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(128.0f, 72.0f)
                lineTo(128.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 192.0f, 152.0f)
                close()
                moveTo(168.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(112.0f, 88.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 168.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_currency-btc-fill`!!
    }

private var `_currency-btc-fill`: ImageVector? = null
