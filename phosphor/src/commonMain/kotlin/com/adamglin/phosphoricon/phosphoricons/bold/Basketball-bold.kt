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

public val BoldGroup.`Basketball-bold`: ImageVector
    get() {
        if (`_basketball-bold` != null) {
            return `_basketball-bold`!!
        }
        `_basketball-bold` = Builder(name = "Basketball-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(60.0f, 177.28f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 44.87f, 140.0f)
                lineTo(75.14f, 140.0f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 60.0f, 177.28f)
                close()
                moveTo(44.87f, 116.0f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 60.0f, 78.72f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 75.14f, 116.0f)
                close()
                moveTo(116.0f, 211.13f)
                arcToRelative(83.63f, 83.63f, 0.0f, false, true, -39.0f, -16.46f)
                arcTo(106.94f, 106.94f, 0.0f, false, false, 99.34f, 140.0f)
                lineTo(116.0f, 140.0f)
                close()
                moveTo(116.0f, 116.0f)
                lineTo(99.34f, 116.0f)
                arcTo(106.94f, 106.94f, 0.0f, false, false, 77.0f, 61.33f)
                arcToRelative(83.63f, 83.63f, 0.0f, false, true, 39.0f, -16.46f)
                close()
                moveTo(196.0f, 78.72f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 211.13f, 116.0f)
                lineTo(180.86f, 116.0f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 196.0f, 78.72f)
                close()
                moveTo(140.0f, 211.13f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(16.66f)
                arcTo(106.94f, 106.94f, 0.0f, false, false, 179.0f, 194.67f)
                arcTo(83.63f, 83.63f, 0.0f, false, true, 140.0f, 211.13f)
                close()
                moveTo(156.66f, 116.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 44.87f)
                arcToRelative(83.63f, 83.63f, 0.0f, false, true, 39.0f, 16.46f)
                arcTo(106.94f, 106.94f, 0.0f, false, false, 156.66f, 116.0f)
                close()
                moveTo(196.0f, 177.28f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 180.86f, 140.0f)
                horizontalLineToRelative(30.27f)
                arcTo(83.59f, 83.59f, 0.0f, false, true, 196.0f, 177.28f)
                close()
            }
        }
        .build()
        return `_basketball-bold`!!
    }

private var `_basketball-bold`: ImageVector? = null
