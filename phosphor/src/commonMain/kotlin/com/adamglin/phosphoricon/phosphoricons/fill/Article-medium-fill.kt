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

public val FillGroup.`Article-medium-fill`: ImageVector
    get() {
        if (`_article-medium-fill` != null) {
            return `_article-medium-fill`!!
        }
        `_article-medium-fill` = Builder(name = "Article-medium-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(72.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.89f, 7.37f)
                arcTo(7.86f, 7.86f, 0.0f, false, true, 64.0f, 152.0f)
                lineTo(52.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(4.0f)
                lineTo(56.0f, 88.0f)
                lineTo(52.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(64.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.91f, 4.0f)
                lineTo(92.0f, 112.12f)
                lineTo(113.09f, 76.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 72.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(120.0f, 152.0f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, true, -3.11f, -0.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 144.0f)
                lineTo(112.0f, 109.59f)
                lineTo(98.91f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.82f, 0.0f)
                lineTo(72.0f, 109.59f)
                close()
                moveTo(200.0f, 184.0f)
                lineTo(88.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(200.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(200.0f, 152.0f)
                lineTo(160.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(200.0f, 120.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_article-medium-fill`!!
    }

private var `_article-medium-fill`: ImageVector? = null
