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

public val BoldGroup.`Article-bold`: ImageVector
    get() {
        if (`_article-bold` != null) {
            return `_article-bold`!!
        }
        `_article-bold` = Builder(name = "Article-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(68.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 80.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 92.0f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 128.0f)
                close()
                moveTo(68.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_article-bold`!!
    }

private var `_article-bold`: ImageVector? = null
