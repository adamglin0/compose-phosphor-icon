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

public val FillGroup.`Storefront-fill`: ImageVector
    get() {
        if (`_storefront-fill` != null) {
            return `_storefront-fill`!!
        }
        `_storefront-fill` = Builder(name = "Storefront-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.69f, 93.81f)
                lineTo(217.35f, 43.6f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 202.0f, 32.0f)
                lineTo(54.0f, 32.0f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 38.65f, 43.6f)
                lineTo(24.31f, 93.81f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 24.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, 32.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, -32.0f)
                lineTo(232.0f, 96.0f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 231.69f, 93.81f)
                close()
                moveTo(88.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -35.12f, 21.26f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, false, -1.82f, -1.06f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 40.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                lineTo(88.0f, 104.0f)
                close()
                moveTo(152.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(216.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -11.07f, 20.2f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -1.8f, 1.05f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return `_storefront-fill`!!
    }

private var `_storefront-fill`: ImageVector? = null
