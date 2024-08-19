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

public val ThinGroup.`Storefront-thin`: ImageVector
    get() {
        if (`_storefront-thin` != null) {
            return `_storefront-thin`!!
        }
        `_storefront-thin` = Builder(name = "Storefront-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.15f, 95.0f)
                arcTo(3.81f, 3.81f, 0.0f, false, false, 28.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 16.0f, 29.92f)
                lineTo(44.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 141.92f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 228.0f, 112.0f)
                lineTo(228.0f, 96.0f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, -0.17f, -1.08f)
                lineTo(213.5f, 44.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 202.0f, 36.0f)
                lineTo(54.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 42.5f, 44.7f)
                close()
                moveTo(50.15f, 46.92f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 54.0f, 44.0f)
                lineTo(202.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.84f, 2.9f)
                lineTo(218.7f, 92.0f)
                lineTo(37.3f, 92.0f)
                close()
                moveTo(100.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(36.0f, 112.0f)
                lineTo(36.0f, 100.0f)
                lineTo(92.0f, 100.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -41.37f, 24.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.31f, -0.76f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 36.0f, 112.0f)
                close()
                moveTo(204.0f, 212.0f)
                lineTo(52.0f, 212.0f)
                lineTo(52.0f, 145.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 44.0f, -17.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 44.0f, 17.48f)
                close()
                moveTo(206.68f, 135.83f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -1.3f, 0.76f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 164.0f, 112.0f)
                lineTo(164.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(12.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 206.68f, 135.83f)
                close()
            }
        }
        .build()
        return `_storefront-thin`!!
    }

private var `_storefront-thin`: ImageVector? = null
