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

public val FillGroup.`Currency-eur-fill`: ImageVector
    get() {
        if (`_currency-eur-fill` != null) {
            return `_currency-eur-fill`!!
        }
        `_currency-eur-fill` = Builder(name = "Currency-eur-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(88.0f, 120.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(88.81f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 65.86f, 21.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.66f, 11.92f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 72.58f, 152.0f)
                lineTo(64.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(72.0f, 120.0f)
                lineTo(64.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.58f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 92.75f, -33.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.66f, 11.92f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 88.81f, 104.0f)
                close()
            }
        }
        .build()
        return `_currency-eur-fill`!!
    }

private var `_currency-eur-fill`: ImageVector? = null
