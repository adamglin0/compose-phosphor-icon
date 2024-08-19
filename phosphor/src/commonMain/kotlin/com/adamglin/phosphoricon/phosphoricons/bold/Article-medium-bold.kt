package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Article-medium-bold`: ImageVector
    get() {
        if (`_article-medium-bold` != null) {
            return `_article-medium-bold`!!
        }
        `_article-medium-bold` = Builder(name = "Article-medium-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(24.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(28.0f, 68.0f)
                lineTo(24.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(40.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 5.33f)
                lineToRelative(30.0f, 45.0f)
                lineToRelative(30.0f, -45.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 44.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(116.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.0f, -20.93f)
                lineTo(108.0f, 95.63f)
                lineToRelative(-18.0f, 27.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineToRelative(-18.0f, -27.0f)
                verticalLineToRelative(27.44f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 132.0f)
                close()
                moveTo(176.0f, 104.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(176.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(232.0f, 120.0f)
                lineTo(176.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(232.0f, 160.0f)
                lineTo(80.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(232.0f, 200.0f)
                lineTo(80.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return `_article-medium-bold`!!
    }

private var `_article-medium-bold`: ImageVector? = null
